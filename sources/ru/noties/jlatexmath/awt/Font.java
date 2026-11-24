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

    private Font(Typeface typeface, int i, float f) {
        this.typeface = applyStyle(typeface, i);
        this.style = i;
        this.size = f;
    }

    private static Typeface applyStyle(Typeface typeface, int i) {
        int i2;
        int i3;
        boolean isBold = typeface.isBold();
        int i4 = 0;
        if (typeface.isItalic()) {
            i2 = true;
        } else {
            i2 = false;
        }
        if ((isBold | i2) != i) {
            if ((i & 1) != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if ((i & 2) != 0) {
                i4 = 2;
            }
            return Typeface.create(typeface, i3 | i4);
        }
        return typeface;
    }

    public static Font createFont(Typeface typeface, float f) {
        return new Font(typeface, 0, f);
    }

    private static Typeface createTypeface(String str, int i) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i));
        if (create == null) {
            return Typeface.DEFAULT;
        }
        return create;
    }

    private static int toAndroidStyle(int i) {
        int i2;
        int i3 = 0;
        if (i == 0) {
            return 0;
        }
        if ((i & 1) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            i3 = 2;
        }
        return i2 | i3;
    }

    public Font deriveFont(int i) {
        return new Font(this.typeface, i, this.size);
    }

    public boolean isBold() {
        if ((this.style & 1) != 0) {
            return true;
        }
        return false;
    }

    public boolean isItalic() {
        if ((this.style & 2) != 0) {
            return true;
        }
        return false;
    }

    public float size() {
        return this.size;
    }

    public int style() {
        return this.style;
    }

    public Typeface typeface() {
        return this.typeface;
    }

    @Deprecated
    public static Font createFont(int i, InputStream inputStream) {
        return null;
    }

    public Font(String str, int i, int i2) {
        this(createTypeface(str, i), i, i2);
    }
}
