
public class GUIProperties {

    public static final boolean isCustomEnabled = false;

    public static final String PLAF_METAL = "javax.swing.plaf.metal.MetalLookAndFeel";
    public static final String PLAF_NIMBUS = "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";
    public static final String PLAF_WINDOWS = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
    public static final String PLAF_MOTIF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
    public static final String PLAF_MAC = "com.sun.java.swing.plaf.mac.MacLookAndFeel";
    public static final String PLAF_ACRYL = "com.jtattoo.plaf.acryl.AcrylLookAndFeel";
    public static final String PLAF_AERO = "com.jtattoo.plaf.aero.AeroLookAndFeel";
    public static final String PLAF_ALUMINIUM = "com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";
    public static final String PLAF_BERNSTEIN = "com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";
    public static final String PLAF_FAST = "com.jtattoo.plaf.fast.FastLookAndFeel";
    public static final String PLAF_GRAPHITE = "com.jtattoo.plaf.graphite.GraphiteLookAndFeel";
    public static final String PLAF_HIFI = "com.jtattoo.plaf.hifi.HiFiLookAndFeel";
    public static final String PLAF_LUNA = "com.jtattoo.plaf.luna.LunaLookAndFeel";
    public static final String PLAF_MCWIN = "com.jtattoo.plaf.mcwin.McWinLookAndFeel";
    public static final String PLAF_MINT = "com.jtattoo.plaf.mint.MintLookAndFeel";
    public static final String PLAF_NOIRE = "com.jtattoo.plaf.noire.NoireLookAndFeel";
    public static final String PLAF_SMART = "com.jtattoo.plaf.smart.SmartLookAndFeel";
    //public static final String PLAF_CUSTOM = "com.jtattoo.plaf.custom.pulsar.PulsarLookAndFeel";
    public static final String PLAF_CUSTOM = "de.pnwvi.plaf.PNWLookAndFeel";

    private String lookAndFeel = PLAF_ACRYL;
    private String theme = "Default";

    public GUIProperties() {
    }

    public void setLookAndFeel(String aLookAndFeel) {
        lookAndFeel = aLookAndFeel;
    }

    public String getLookAndFeel() {
        return lookAndFeel;
    }

    public void setTheme(String aTheme) {
        theme = aTheme;
    }

    public String getTheme() {
        return theme;
    }

    public boolean isMetalLook() {
        return lookAndFeel.equals(PLAF_METAL);
    }

    public boolean isNimbusLook() {
        return lookAndFeel.equals(PLAF_NIMBUS);
    }

    public boolean isWindowsLook() {
        return lookAndFeel.equals(PLAF_WINDOWS);
    }

    public boolean isMotifLook() {
        return lookAndFeel.equals(PLAF_MOTIF);
    }

    public boolean isMacLook() {
        return lookAndFeel.equals(PLAF_MAC);
    }

    public boolean isFastLook() {
        return lookAndFeel.equals(PLAF_FAST);
    }

    public boolean isGraphiteLook() {
        return lookAndFeel.equals(PLAF_GRAPHITE);
    }

    public boolean isSmartLook() {
        return lookAndFeel.equals(PLAF_SMART);
    }

    public boolean isAcrylLook() {
        return lookAndFeel.equals(PLAF_ACRYL);
    }

    public boolean isAeroLook() {
        return lookAndFeel.equals(PLAF_AERO);
    }

    public boolean isBernsteinLook() {
        return lookAndFeel.equals(PLAF_BERNSTEIN);
    }

    public boolean isAluminiumLook() {
        return lookAndFeel.equals(PLAF_ALUMINIUM);
    }

    public boolean isMcWinLook() {
        return lookAndFeel.equals(PLAF_MCWIN);
    }

    public boolean isMintLook() {
        return lookAndFeel.equals(PLAF_MINT);
    }

    public boolean isHiFiLook() {
        return lookAndFeel.equals(PLAF_HIFI);
    }

    public boolean isNoireLook() {
        return lookAndFeel.equals(PLAF_NOIRE);
    }

    public boolean isLunaLook() {
        return lookAndFeel.equals(PLAF_LUNA);
    }

    public static boolean isCustomEnabled() {
        return isCustomEnabled;
    }

    public boolean isCustomLook() {
        return lookAndFeel.equals(PLAF_CUSTOM);
    }
}

