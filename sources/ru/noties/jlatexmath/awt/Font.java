package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.io.InputStream;
import java.util.Locale;

public class Font {
    public static final int BOLD = 1;
    public static final int ITALIC = 2;
    public static final int PLAIN = 0;
    private float size;
    private int style;
    private final Typeface typeface;

    @Deprecated
    public static Font createFont(int i, InputStream inputStream) {
        return null;
    }

    private static int toAndroidStyle(int i) {
        if (i == 0) {
            return 0;
        }
        return ((i & 1) != 0 ? 1 : 0) | ((i & 2) != 0 ? 2 : 0);
    }

    public static Font createFont(Typeface typeface, float f) {
        return new Font(typeface, 0, f);
    }

    public Font(String str, int i, int i2) {
        this(createTypeface(str, i), i, i2);
    }

    private Font(Typeface typeface, int i, float f) {
        this.typeface = applyStyle(typeface, i);
        this.style = i;
        this.size = f;
    }

    private static Typeface applyStyle(Typeface typeface, int i) {
        if (((typeface.isBold() ? 1 : 0) | (typeface.isItalic() ? 2 : 0)) != i) {
            return Typeface.create(typeface, ((i & 1) != 0 ? 1 : 0) | ((i & 2) != 0 ? 2 : 0));
        }
        return typeface;
    }

    public Font deriveFont(int i) {
        return new Font(this.typeface, i, this.size);
    }

    public Typeface typeface() {
        return this.typeface;
    }

    public int style() {
        return this.style;
    }

    public float size() {
        return this.size;
    }

    public boolean isBold() {
        return (this.style & 1) != 0;
    }

    public boolean isItalic() {
        return (this.style & 2) != 0;
    }

    private static Typeface createTypeface(String str, int i) {
        Typeface typefaceCreate = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i));
        return typefaceCreate == null ? Typeface.DEFAULT : typefaceCreate;
    }
}
