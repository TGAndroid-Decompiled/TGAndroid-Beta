package ru.noties.jlatexmath.awt;
public class BasicStroke implements Stroke {
    public static final int CAP_BUTT = 0;
    public static final int JOIN_MITER = 0;
    private final float miterLimit;
    private final float width;

    public BasicStroke(float f10, int i9, int i10) {
        this(f10, i9, i10, 10.0f);
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

    public BasicStroke(float f10, int i9, int i10, float f11) {
        this.width = f10;
        this.miterLimit = f11;
    }
}
