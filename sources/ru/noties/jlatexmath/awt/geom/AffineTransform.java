package ru.noties.jlatexmath.awt.geom;

import android.graphics.Canvas;
public class AffineTransform implements Cloneable {
    private final Canvas canvas;
    private final AffineTransform parent;
    private int save = -1;
    private double scaleX = 1.0d;
    private double scaleY = 1.0d;
    private float translateX;
    private float translateY;

    private AffineTransform(AffineTransform affineTransform, Canvas canvas) {
        this.parent = affineTransform;
        this.canvas = canvas;
    }

    public static AffineTransform create(Canvas canvas) {
        return new AffineTransform(null, canvas);
    }

    public Canvas getCanvas() {
        return this.canvas;
    }

    public double getScaleX() {
        return this.scaleX;
    }

    public double getScaleY() {
        return this.scaleY;
    }

    public AffineTransform restore() {
        int i10 = this.save;
        if (i10 != -1) {
            this.canvas.restoreToCount(i10);
            this.save = -1;
        }
        AffineTransform affineTransform = this.parent;
        if (affineTransform != null) {
            return affineTransform;
        }
        throw new IllegalStateException("Cannot restore root transform instance");
    }

    public AffineTransform save() {
        AffineTransform affineTransform = new AffineTransform(this, this.canvas);
        affineTransform.setScale(this.scaleX, this.scaleY);
        affineTransform.setTranslate(this.translateX, this.translateY);
        affineTransform.save = this.canvas.save();
        return affineTransform;
    }

    public void scale(double d, double d10) {
        setScale(d, d10);
        this.canvas.scale((float) d, (float) d10);
    }

    public void setScale(double d, double d10) {
        this.scaleX = d;
        this.scaleY = d10;
    }

    public void setTranslate(float f9, float f10) {
        this.translateX = f9;
        this.translateY = f10;
    }

    public void translate(float f9, float f10) {
        this.canvas.translate(f9, f10);
        setTranslate(f9, f10);
    }

    public float translateX() {
        return this.translateX;
    }

    public float translateY() {
        return this.translateY;
    }

    public AffineTransform clone() {
        AffineTransform affineTransform = new AffineTransform(this, this.canvas);
        affineTransform.setScale(this.scaleX, this.scaleY);
        affineTransform.setTranslate(this.translateX, this.translateY);
        affineTransform.save = this.canvas.save();
        return affineTransform;
    }
}
