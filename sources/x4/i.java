package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45306f;
    public float f45307g;
    public float h;
    public float f45308i;
    public float f45309j;
    public float f45310k;
    public Paint.Cap f45311l;
    public Paint.Join f45312m;
    public float f45313n;

    @Override
    public final boolean a() {
        if (!this.f45306f.n() && !this.d.n()) {
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
        return this.f45306f.f277b;
    }

    public float getStrokeAlpha() {
        return this.f45307g;
    }

    public int getStrokeColor() {
        return this.d.f277b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45309j;
    }

    public float getTrimPathOffset() {
        return this.f45310k;
    }

    public float getTrimPathStart() {
        return this.f45308i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45306f.f277b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45307g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f277b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45309j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45310k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45308i = f7;
    }
}
