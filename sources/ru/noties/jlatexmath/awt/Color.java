package ru.noties.jlatexmath.awt;
public class Color {
    public static final Color BLACK;
    public static final Color RED;
    public static final Color black;
    public static final Color blue;
    public static final Color cyan;
    public static final Color green;
    public static final Color magenta;
    public static final Color red;
    public static final Color white;
    public static final Color yellow;
    private final int color;

    static {
        Color color = new Color(-16777216);
        black = color;
        white = new Color(-1);
        Color color2 = new Color(-65536);
        red = color2;
        green = new Color(-16711936);
        blue = new Color(-16776961);
        cyan = new Color(android.graphics.Color.parseColor("cyan"));
        magenta = new Color(android.graphics.Color.parseColor("magenta"));
        yellow = new Color(android.graphics.Color.parseColor("yellow"));
        BLACK = color;
        RED = color2;
    }

    public Color(int i9) {
        this.color = i9;
    }

    public static Color decode(String str) {
        return new Color(android.graphics.Color.parseColor(str));
    }

    public int getAlpha() {
        return 255;
    }

    public int getBlue() {
        return android.graphics.Color.blue(this.color);
    }

    public int getColorInt() {
        return this.color;
    }

    public int getGreen() {
        return android.graphics.Color.green(this.color);
    }

    public int getRed() {
        return android.graphics.Color.red(this.color);
    }

    public Color(int i9, int i10, int i11) {
        this(android.graphics.Color.rgb(i9, i10, i11));
    }

    public Color(float f10, float f11, float f12) {
        this((int) ((f10 * 255.0f) + 0.5f), (int) ((f11 * 255.0f) + 0.5f), (int) ((f12 * 255.0f) + 0.5f));
    }
}
