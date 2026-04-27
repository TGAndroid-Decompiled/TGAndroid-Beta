package ru.noties.jlatexmath.awt;

public class BasicStroke implements Stroke {
    private final float miterLimit;
    private final float width;

    public BasicStroke(float f, int i, int i2) {
        this(f, i, i2, 10.0f);
    }

    public BasicStroke(float f, int i, int i2, float f2) {
        this.width = f;
        this.miterLimit = f2;
    }

    @Override
    public float width() {
        return this.width;
    }

    public String toString() {
        return "BasicStroke{width=" + this.width + ", miterLimit=" + this.miterLimit + '}';
    }
}
