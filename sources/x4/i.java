package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f48835e;
    public a5.a f48836f;
    public float f48837g;
    public float h;
    public float f48838i;
    public float f48839j;
    public float f48840k;
    public Paint.Cap f48841l;
    public Paint.Join f48842m;
    public float f48843n;

    @Override
    public final boolean a() {
        if (!this.f48836f.m() && !this.d.m()) {
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
        return this.f48836f.f285b;
    }

    public float getStrokeAlpha() {
        return this.f48837g;
    }

    public int getStrokeColor() {
        return this.d.f285b;
    }

    public float getStrokeWidth() {
        return this.f48835e;
    }

    public float getTrimPathEnd() {
        return this.f48839j;
    }

    public float getTrimPathOffset() {
        return this.f48840k;
    }

    public float getTrimPathStart() {
        return this.f48838i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f48836f.f285b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f48837g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f285b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f48835e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f48839j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f48840k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f48838i = f7;
    }
}
