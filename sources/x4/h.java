package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50838e;
    public a5.a f50839f;
    public float f50840g;
    public float h;
    public float f50841i;
    public float f50842j;
    public float f50843k;
    public Paint.Cap f50844l;
    public Paint.Join f50845m;
    public float f50846n;

    @Override
    public final boolean a() {
        if (!this.f50839f.o() && !this.d.o()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: x4.h.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f50839f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50840g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50838e;
    }

    public float getTrimPathEnd() {
        return this.f50842j;
    }

    public float getTrimPathOffset() {
        return this.f50843k;
    }

    public float getTrimPathStart() {
        return this.f50841i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50839f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50840g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50838e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50842j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50843k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50841i = f7;
    }
}
