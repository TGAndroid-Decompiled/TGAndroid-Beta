package y4;

import a8.ng;
import android.graphics.Paint;
public final class h extends k {
    public ng d;
    public float e;
    public ng f52053f;
    public float f52054g;
    public float h;
    public float f52055i;
    public float f52056j;
    public float f52057k;
    public Paint.Cap f52058l;
    public Paint.Join f52059m;
    public float f52060n;

    @Override
    public final boolean a() {
        if (!this.f52053f.o() && !this.d.o()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: y4.h.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f52053f.f639b;
    }

    public float getStrokeAlpha() {
        return this.f52054g;
    }

    public int getStrokeColor() {
        return this.d.f639b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f52056j;
    }

    public float getTrimPathOffset() {
        return this.f52057k;
    }

    public float getTrimPathStart() {
        return this.f52055i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f52053f.f639b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f52054g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f639b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f52056j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f52057k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f52055i = f7;
    }
}
