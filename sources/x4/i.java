package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45595f;
    public float f45596g;
    public float h;
    public float f45597i;
    public float f45598j;
    public float f45599k;
    public Paint.Cap f45600l;
    public Paint.Join f45601m;
    public float f45602n;

    @Override
    public final boolean a() {
        if (!this.f45595f.n() && !this.d.n()) {
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
        return this.f45595f.f276b;
    }

    public float getStrokeAlpha() {
        return this.f45596g;
    }

    public int getStrokeColor() {
        return this.d.f276b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45598j;
    }

    public float getTrimPathOffset() {
        return this.f45599k;
    }

    public float getTrimPathStart() {
        return this.f45597i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45595f.f276b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45596g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f276b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45598j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45599k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45597i = f7;
    }
}
