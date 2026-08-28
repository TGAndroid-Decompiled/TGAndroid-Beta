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

    public Font(String str, int i9, int i10) {
        this(createTypeface(str, i9), i9, i10);
    }

    private static Typeface applyStyle(Typeface typeface, int i9) {
        int i10;
        int i11;
        boolean isBold = typeface.isBold();
        int i12 = 0;
        if (typeface.isItalic()) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        if ((isBold | i10) != i9) {
            if ((i9 & 1) != 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if ((i9 & 2) != 0) {
                i12 = 2;
            }
            return Typeface.create(typeface, i11 | i12);
        }
        return typeface;
    }

    @Deprecated
    public static Font createFont(int i9, InputStream inputStream) {
        return null;
    }

    private static Typeface createTypeface(String str, int i9) {
        Typeface create = Typeface.create(str.toLowerCase(Locale.US), toAndroidStyle(i9));
        if (create == null) {
            return Typeface.DEFAULT;
        }
        return create;
    }

    private static int toAndroidStyle(int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 0) {
            return 0;
        }
        if ((i9 & 1) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((i9 & 2) != 0) {
            i11 = 2;
        }
        return i10 | i11;
    }

    public Font deriveFont(int i9) {
        return new Font(this.typeface, i9, this.size);
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

    private Font(Typeface typeface, int i9, float f10) {
        this.typeface = applyStyle(typeface, i9);
        this.style = i9;
        this.size = f10;
    }

    public static Font createFont(Typeface typeface, float f10) {
        return new Font(typeface, 0, f10);
    }
}
