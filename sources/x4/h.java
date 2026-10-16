package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float e;
    public a5.a f47849f;
    public float f47850g;
    public float h;
    public float f47851i;
    public float f47852j;
    public float f47853k;
    public Paint.Cap f47854l;
    public Paint.Join f47855m;
    public float f47856n;

    @Override
    public final boolean a() {
        if (!this.f47849f.p() && !this.d.p()) {
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
        return this.f47849f.f281b;
    }

    public float getStrokeAlpha() {
        return this.f47850g;
    }

    public int getStrokeColor() {
        return this.d.f281b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f47852j;
    }

    public float getTrimPathOffset() {
        return this.f47853k;
    }

    public float getTrimPathStart() {
        return this.f47851i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f47849f.f281b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f47850g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f281b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f47852j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f47853k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f47851i = f7;
    }
}
