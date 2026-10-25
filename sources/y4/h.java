package y4;

import a8.ng;
import android.graphics.Paint;
public final class h extends k {
    public ng d;
    public float e;
    public ng f51992f;
    public float f51993g;
    public float h;
    public float f51994i;
    public float f51995j;
    public float f51996k;
    public Paint.Cap f51997l;
    public Paint.Join f51998m;
    public float f51999n;

    @Override
    public final boolean a() {
        if (!this.f51992f.o() && !this.d.o()) {
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
        return this.f51992f.f639b;
    }

    public float getStrokeAlpha() {
        return this.f51993g;
    }

    public int getStrokeColor() {
        return this.d.f639b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f51995j;
    }

    public float getTrimPathOffset() {
        return this.f51996k;
    }

    public float getTrimPathStart() {
        return this.f51994i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f51992f.f639b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f51993g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f639b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f51995j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f51996k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f51994i = f7;
    }
}
