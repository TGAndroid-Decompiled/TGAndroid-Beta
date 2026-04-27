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

    public static Color decode(String str) {
        return new Color(android.graphics.Color.parseColor(str));
    }

    public Color(int i) {
        this.color = i;
    }

    public Color(int i, int i2, int i3) {
        this(android.graphics.Color.rgb(i, i2, i3));
    }

    public Color(float f, float f2, float f3) {
        this((int) ((f * 255.0f) + 0.5f), (int) ((f2 * 255.0f) + 0.5f), (int) ((f3 * 255.0f) + 0.5f));
    }

    public int getColorInt() {
        return this.color;
    }
}
