package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50607e;
    public a5.a f50608f;
    public float f50609g;
    public float h;
    public float f50610i;
    public float f50611j;
    public float f50612k;
    public Paint.Cap f50613l;
    public Paint.Join f50614m;
    public float f50615n;

    @Override
    public final boolean a() {
        if (!this.f50608f.o() && !this.d.o()) {
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
        return this.f50608f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50609g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50607e;
    }

    public float getTrimPathEnd() {
        return this.f50611j;
    }

    public float getTrimPathOffset() {
        return this.f50612k;
    }

    public float getTrimPathStart() {
        return this.f50610i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50608f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50609g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50607e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50611j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50612k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50610i = f7;
    }
}
