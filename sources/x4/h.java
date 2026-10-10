package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50653e;
    public a5.a f50654f;
    public float f50655g;
    public float h;
    public float f50656i;
    public float f50657j;
    public float f50658k;
    public Paint.Cap f50659l;
    public Paint.Join f50660m;
    public float f50661n;

    @Override
    public final boolean a() {
        if (!this.f50654f.o() && !this.d.o()) {
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
        return this.f50654f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50655g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50653e;
    }

    public float getTrimPathEnd() {
        return this.f50657j;
    }

    public float getTrimPathOffset() {
        return this.f50658k;
    }

    public float getTrimPathStart() {
        return this.f50656i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50654f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50655g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50653e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50657j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50658k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50656i = f7;
    }
}
