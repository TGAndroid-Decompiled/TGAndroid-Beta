package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float e;
    public a5.a f49687f;
    public float f49688g;
    public float h;
    public float f49689i;
    public float f49690j;
    public float f49691k;
    public Paint.Cap f49692l;
    public Paint.Join f49693m;
    public float f49694n;

    @Override
    public final boolean a() {
        if (!this.f49687f.p() && !this.d.p()) {
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
        return this.f49687f.f281b;
    }

    public float getStrokeAlpha() {
        return this.f49688g;
    }

    public int getStrokeColor() {
        return this.d.f281b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f49690j;
    }

    public float getTrimPathOffset() {
        return this.f49691k;
    }

    public float getTrimPathStart() {
        return this.f49689i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49687f.f281b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49688g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f281b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49690j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49691k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49689i = f7;
    }
}
