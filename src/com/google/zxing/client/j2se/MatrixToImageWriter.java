/*
 * Copyright 2009 ZXing authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.zxing.client.j2se;

import com.google.zxing.common.BitMatrix;

import javax.imageio.ImageIO;

import org.sourceforge.EPSGraphics2D.EpsGraphics2D;

import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.svg.SVGDOMImplementation;

import org.w3c.dom.Document;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Element;

import java.io.File;
import java.io.OutputStream;
import java.io.IOException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Writes a {@link BitMatrix} to {@link BufferedImage},
 * file or stream. Provided here instead of core since it depends on
 * Java SE libraries.
 *
 * @author Sean Owen
 */
public final class MatrixToImageWriter {

  //private static final int BLACK = 0xFF000000;
  //private static final int WHITE = 0xFFFFFFFF;

  private MatrixToImageWriter() {}

  /**
   * Renders a {@link BitMatrix} as an image, where "false" bits are rendered
   * as white, and "true" bits are rendered as black.
   */
  public static BufferedImage toBufferedImage(BitMatrix matrix, Color bgColor, Color matrixColor) {
    int width = matrix.getWidth();
    int height = matrix.getHeight();
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        image.setRGB(x, y, matrix.get(x, y) ? matrixColor.getRGB() : bgColor.getRGB());
      }
    }
    return image;
  }

  /**
   * Renders a {@link BitMatrix} as an EPS image, where "false" bits are rendered
   * as white, and "true" bits are rendered as black.
   */
  public static String toEPSImage(BitMatrix matrix, Color bgColor, Color matrixColor) {
    int width = matrix.getWidth();
    int height = matrix.getHeight();
    
    Graphics2D g2d = new EpsGraphics2D();
    g2d.setPaintMode();
    g2d.setStroke(new BasicStroke(1.0f));
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
    	if (matrix.get(x, y) == true){
      	  if (g2d.getColor() != matrixColor){
      	    g2d.setColor(matrixColor);
      	  }
      	  g2d.drawRect(x, y, 1, 1);
    	}
    	else {
      	  if (g2d.getColor() != bgColor){
      	    g2d.setColor(bgColor);
      	  }
    	  g2d.drawRect(x, y, 1, 1);
    	}
      }
    }
    return g2d.toString();
  }

  /**
   * Renders a {@link BitMatrix} as an SVG image, where "false" bits are rendered
   * as white, and "true" bits are rendered as black.
   */
  public static void toSVGImage(BitMatrix matrix, String svgFilename, Color bgColor, Color matrixColor) {
    int width = matrix.getWidth();
    int height = matrix.getHeight();
    
    DOMImplementation impl = SVGDOMImplementation.getDOMImplementation();
    String svgNS = SVGDOMImplementation.SVG_NAMESPACE_URI;
    Document document = impl.createDocument(svgNS, "svg", null);
    
    // Get a DOMImplementation.
    //DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();

    // Create an instance of org.w3c.dom.Document.
    // svgNS = "http://www.w3.org/2000/svg";
    // document = domImpl.createDocument(svgNS, "svg", null);
    
    // Get the root element (the 'svg' element).
    Element svgRoot = document.getDocumentElement();

    // Create an instance of the SVG Generator.
    SVGGraphics2D g2d = new SVGGraphics2D(document);
    g2d.setSVGCanvasSize(new Dimension(width, height));
    
    //Graphics2D g2d = new EpsGraphics2D("QRCode");
    g2d.setStroke(new BasicStroke(1.0f));
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
    	if (matrix.get(x, y) == true){
    	  if (g2d.getColor() != matrixColor){
    	    g2d.setColor(matrixColor);
    	  }
    	  g2d.drawRect(x, y, 1, 1);
    		Color c = matrixColor;
    		//System.out.println(c.getRed() + " " + c.getGreen() + " " + c.getBlue());
    	}
    	else {
    	  if (g2d.getColor() != bgColor){
    	    g2d.setColor(bgColor);
    	  }
    	  g2d.drawRect(x, y, 1, 1);
    	}
      }
    }
    
    try {
		g2d.stream(svgFilename);
	} catch (SVGGraphics2DIOException e) {
		e.printStackTrace();
	}
	
    //return true;
  }

  /**
   * Writes a {@link BitMatrix} to a file.
   *
   * @see #toBufferedImage(BitMatrix)
   */
  public static void writeToFile(BitMatrix matrix, String format, File file, Color bgColor, Color matrixColor)
          throws IOException {
    BufferedImage image = toBufferedImage(matrix, bgColor, matrixColor);
    ImageIO.write(image, format, file);
  }

  /**
   * Writes a {@link BitMatrix} to a stream.
   *
   * @see #toBufferedImage(BitMatrix)
   */
  public static void writeToStream(BitMatrix matrix, String format, OutputStream stream, Color bgColor, Color matrixColor)
          throws IOException {
    BufferedImage image = toBufferedImage(matrix, bgColor, matrixColor);
    ImageIO.write(image, format, stream);
  }

}
