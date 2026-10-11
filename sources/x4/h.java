package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50731e;
    public a5.a f50732f;
    public float f50733g;
    public float h;
    public float f50734i;
    public float f50735j;
    public float f50736k;
    public Paint.Cap f50737l;
    public Paint.Join f50738m;
    public float f50739n;

    @Override
    public final boolean a() {
        if (!this.f50732f.o() && !this.d.o()) {
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
        return this.f50732f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50733g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50731e;
    }

    public float getTrimPathEnd() {
        return this.f50735j;
    }

    public float getTrimPathOffset() {
        return this.f50736k;
    }

    public float getTrimPathStart() {
        return this.f50734i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50732f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50733g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50731e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50735j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50736k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50734i = f7;
    }
}
