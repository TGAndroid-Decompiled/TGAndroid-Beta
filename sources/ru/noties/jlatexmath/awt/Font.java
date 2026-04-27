package ru.noties.jlatexmath.awt;

import android.graphics.Typeface;
import java.util.Locale;

public class Font {
    private float size;
    private int style;
    private final Typeface typeface;

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

    public float size() {
        return this.size;
    }

    private static Typeface createTypeface(String str, int i) {
        Typeface typefaceCreate = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i));
        return typefaceCreate == null ? Typeface.DEFAULT : typefaceCreate;
    }
}
