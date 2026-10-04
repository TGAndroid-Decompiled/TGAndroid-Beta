package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f49325e;
    public a5.a f49326f;
    public float f49327g;
    public float h;
    public float f49328i;
    public float f49329j;
    public float f49330k;
    public Paint.Cap f49331l;
    public Paint.Join f49332m;
    public float f49333n;

    @Override
    public final boolean a() {
        if (!this.f49326f.n() && !this.d.n()) {
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
        return this.f49326f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f49327g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f49325e;
    }

    public float getTrimPathEnd() {
        return this.f49329j;
    }

    public float getTrimPathOffset() {
        return this.f49330k;
    }

    public float getTrimPathStart() {
        return this.f49328i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49326f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49327g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f49325e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49329j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49330k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49328i = f7;
    }
}
