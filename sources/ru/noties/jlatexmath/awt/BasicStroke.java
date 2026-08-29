package ru.noties.jlatexmath.awt;
public class BasicStroke implements Stroke {
    public static final int CAP_BUTT = 0;
    public static final int JOIN_MITER = 0;
    private final float miterLimit;
    private final float width;

    public BasicStroke(float f9, int i10, int i11) {
        this(f9, i10, i11, 10.0f);
    }

    @Override
    public float miterLimit() {
        return this.miterLimit;
    }

    public String toString() {
        return "BasicStroke{width=" + this.width + ", miterLimit=" + this.miterLimit + '}';
    }

    @Override
    public float width() {
        return this.width;
    }

    public BasicStroke(float f9, int i10, int i11, float f10) {
        this.width = f9;
        this.miterLimit = f10;
    }
}
