package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float f50697e;
    public a5.a f50698f;
    public float f50699g;
    public float h;
    public float f50700i;
    public float f50701j;
    public float f50702k;
    public Paint.Cap f50703l;
    public Paint.Join f50704m;
    public float f50705n;

    @Override
    public final boolean a() {
        if (!this.f50698f.o() && !this.d.o()) {
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
        return this.f50698f.f299b;
    }

    public float getStrokeAlpha() {
        return this.f50699g;
    }

    public int getStrokeColor() {
        return this.d.f299b;
    }

    public float getStrokeWidth() {
        return this.f50697e;
    }

    public float getTrimPathEnd() {
        return this.f50701j;
    }

    public float getTrimPathOffset() {
        return this.f50702k;
    }

    public float getTrimPathStart() {
        return this.f50700i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f50698f.f299b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f50699g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f299b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.f50697e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f50701j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f50702k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f50700i = f7;
    }
}
