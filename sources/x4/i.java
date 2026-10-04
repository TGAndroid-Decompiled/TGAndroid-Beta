package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f49316e;
    public a5.a f49317f;
    public float f49318g;
    public float h;
    public float f49319i;
    public float f49320j;
    public float f49321k;
    public Paint.Cap f49322l;
    public Paint.Join f49323m;
    public float f49324n;

    @Override
    public final boolean a() {
        if (!this.f49317f.n() && !this.d.n()) {
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
        return this.f49317f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f49318g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f49316e;
    }

    public float getTrimPathEnd() {
        return this.f49320j;
    }

    public float getTrimPathOffset() {
        return this.f49321k;
    }

    public float getTrimPathStart() {
        return this.f49319i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49317f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49318g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f49316e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49320j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49321k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49319i = f7;
    }
}
