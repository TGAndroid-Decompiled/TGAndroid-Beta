package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45278f;
    public float f45279g;
    public float h;
    public float f45280i;
    public float f45281j;
    public float f45282k;
    public Paint.Cap f45283l;
    public Paint.Join f45284m;
    public float f45285n;

    @Override
    public final boolean a() {
        if (!this.f45278f.n() && !this.d.n()) {
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
        return this.f45278f.f275b;
    }

    public float getStrokeAlpha() {
        return this.f45279g;
    }

    public int getStrokeColor() {
        return this.d.f275b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45281j;
    }

    public float getTrimPathOffset() {
        return this.f45282k;
    }

    public float getTrimPathStart() {
        return this.f45280i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45278f.f275b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45279g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f275b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45281j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45282k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45280i = f7;
    }
}
