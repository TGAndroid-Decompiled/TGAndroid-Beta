package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45558f;
    public float f45559g;
    public float h;
    public float f45560i;
    public float f45561j;
    public float f45562k;
    public Paint.Cap f45563l;
    public Paint.Join f45564m;
    public float f45565n;

    @Override
    public final boolean a() {
        if (!this.f45558f.n() && !this.d.n()) {
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
        return this.f45558f.f277b;
    }

    public float getStrokeAlpha() {
        return this.f45559g;
    }

    public int getStrokeColor() {
        return this.d.f277b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45561j;
    }

    public float getTrimPathOffset() {
        return this.f45562k;
    }

    public float getTrimPathStart() {
        return this.f45560i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45558f.f277b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45559g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f277b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45561j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45562k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45560i = f7;
    }
}
