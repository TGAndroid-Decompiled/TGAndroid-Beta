package x4;

import android.graphics.Paint;
public final class i extends l {
    public a5.a d;
    public float f49332e;
    public a5.a f49333f;
    public float f49334g;
    public float h;
    public float f49335i;
    public float f49336j;
    public float f49337k;
    public Paint.Cap f49338l;
    public Paint.Join f49339m;
    public float f49340n;

    @Override
    public final boolean a() {
        if (!this.f49333f.n() && !this.d.n()) {
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
        return this.f49333f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f49334g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f49332e;
    }

    public float getTrimPathEnd() {
        return this.f49336j;
    }

    public float getTrimPathOffset() {
        return this.f49337k;
    }

    public float getTrimPathStart() {
        return this.f49335i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49333f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49334g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f49332e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49336j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49337k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49335i = f7;
    }
}
