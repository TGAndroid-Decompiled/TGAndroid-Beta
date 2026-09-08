package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f48864e;
    public a5.a f48865f;
    public float f48866g;
    public float h;
    public float f48867i;
    public float f48868j;
    public float f48869k;
    public Paint.Cap f48870l;
    public Paint.Join f48871m;
    public float f48872n;

    @Override
    public final boolean a() {
        if (!this.f48865f.m() && !this.d.m()) {
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
        return this.f48865f.f297b;
    }

    public float getStrokeAlpha() {
        return this.f48866g;
    }

    public int getStrokeColor() {
        return this.d.f297b;
    }

    public float getStrokeWidth() {
        return this.f48864e;
    }

    public float getTrimPathEnd() {
        return this.f48868j;
    }

    public float getTrimPathOffset() {
        return this.f48869k;
    }

    public float getTrimPathStart() {
        return this.f48867i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f48865f.f297b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f48866g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f297b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f48864e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f48868j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f48869k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f48867i = f7;
    }
}
