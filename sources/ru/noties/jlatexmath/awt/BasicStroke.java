package ru.noties.jlatexmath.awt;

public class BasicStroke implements Stroke {
    public static final int CAP_BUTT = 0;
    public static final int JOIN_MITER = 0;
    private final float miterLimit;
    private final float width;

    public BasicStroke(float f, int i, int i2) {
        this(f, i, i2, 10.0f);
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

    public BasicStroke(float f, int i, int i2, float f2) {
        this.width = f;
        this.miterLimit = f2;
    }
}
