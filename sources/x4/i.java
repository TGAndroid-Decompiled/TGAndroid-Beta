package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float e;
    public a5.a f44618f;
    public float f44619g;
    public float h;
    public float f44620i;
    public float f44621j;
    public float f44622k;
    public Paint.Cap f44623l;
    public Paint.Join f44624m;
    public float f44625n;

    @Override
    public final boolean a() {
        if (!this.f44618f.l() && !this.d.l()) {
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
        return this.f44618f.f275b;
    }

    public float getStrokeAlpha() {
        return this.f44619g;
    }

    public int getStrokeColor() {
        return this.d.f275b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f44621j;
    }

    public float getTrimPathOffset() {
        return this.f44622k;
    }

    public float getTrimPathStart() {
        return this.f44620i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f44618f.f275b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f44619g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f275b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f44621j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f44622k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f44620i = f7;
    }
}
