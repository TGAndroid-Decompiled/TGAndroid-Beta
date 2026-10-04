package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f49317e;
    public a5.a f49318f;
    public float f49319g;
    public float h;
    public float f49320i;
    public float f49321j;
    public float f49322k;
    public Paint.Cap f49323l;
    public Paint.Join f49324m;
    public float f49325n;

    @Override
    public final boolean a() {
        if (!this.f49318f.n() && !this.d.n()) {
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
        return this.f49318f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f49319g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f49317e;
    }

    public float getTrimPathEnd() {
        return this.f49321j;
    }

    public float getTrimPathOffset() {
        return this.f49322k;
    }

    public float getTrimPathStart() {
        return this.f49320i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49318f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49319g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f49317e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49321j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49322k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49320i = f7;
    }
}
