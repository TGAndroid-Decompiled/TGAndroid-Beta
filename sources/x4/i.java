package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f45274f;
    public float f45275g;
    public float h;
    public float f45276i;
    public float f45277j;
    public float f45278k;
    public Paint.Cap f45279l;
    public Paint.Join f45280m;
    public float f45281n;

    @Override
    public final boolean a() {
        if (!this.f45274f.n() && !this.d.n()) {
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
        return this.f45274f.f277b;
    }

    public float getStrokeAlpha() {
        return this.f45275g;
    }

    public int getStrokeColor() {
        return this.d.f277b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f45277j;
    }

    public float getTrimPathOffset() {
        return this.f45278k;
    }

    public float getTrimPathStart() {
        return this.f45276i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f45274f.f277b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f45275g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f277b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f45277j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f45278k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f45276i = f7;
    }
}
