package org.uecide;

import java.io.*;
import java.awt.*;

class Metalique extends ThemeControl {
    public static void init() {
        loadFont("/org/uecide/fonts/Hack-Regular.ttf");
    }

    static void loadFont(String path) {
        try {
            InputStream is = Base.class.getResourceAsStream(path);
            Font f = Font.createFont(Font.TRUETYPE_FONT, is);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(f);
            Debug.message("Loaded font " + f);
        } catch (Exception e) {
            Base.error(e);
        }
    }
}
