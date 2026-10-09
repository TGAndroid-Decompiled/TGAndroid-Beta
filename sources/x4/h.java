package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50609e;
    public a5.a f50610f;
    public float f50611g;
    public float h;
    public float f50612i;
    public float f50613j;
    public float f50614k;
    public Paint.Cap f50615l;
    public Paint.Join f50616m;
    public float f50617n;

    @Override
    public final boolean a() {
        if (!this.f50610f.o() && !this.d.o()) {
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
        return this.f50610f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50611g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50609e;
    }

    public float getTrimPathEnd() {
        return this.f50613j;
    }

    public float getTrimPathOffset() {
        return this.f50614k;
    }

    public float getTrimPathStart() {
        return this.f50612i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50610f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50611g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50609e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50613j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50614k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50612i = f7;
    }
}
