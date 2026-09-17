package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f48836e;
    public a5.a f48837f;
    public float f48838g;
    public float h;
    public float f48839i;
    public float f48840j;
    public float f48841k;
    public Paint.Cap f48842l;
    public Paint.Join f48843m;
    public float f48844n;

    @Override
    public final boolean a() {
        if (!this.f48837f.m() && !this.d.m()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: x4.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f48837f.f285b;
    }

    public float getStrokeAlpha() {
        return this.f48838g;
    }

    public int getStrokeColor() {
        return this.d.f285b;
    }

    public float getStrokeWidth() {
        return this.f48836e;
    }

    public float getTrimPathEnd() {
        return this.f48840j;
    }

    public float getTrimPathOffset() {
        return this.f48841k;
    }

    public float getTrimPathStart() {
        return this.f48839i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f48837f.f285b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f48838g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f285b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f48836e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f48840j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f48841k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f48839i = f7;
    }
}
