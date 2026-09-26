package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45555f;
    public float f45556g;
    public float h;
    public float f45557i;
    public float f45558j;
    public float f45559k;
    public Paint.Cap f45560l;
    public Paint.Join f45561m;
    public float f45562n;

    @Override
    public final boolean a() {
        if (!this.f45555f.n() && !this.d.n()) {
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
        return this.f45555f.f277b;
    }

    public float getStrokeAlpha() {
        return this.f45556g;
    }

    public int getStrokeColor() {
        return this.d.f277b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45558j;
    }

    public float getTrimPathOffset() {
        return this.f45559k;
    }

    public float getTrimPathStart() {
        return this.f45557i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45555f.f277b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45556g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f277b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45558j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45559k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45557i = f7;
    }
}
