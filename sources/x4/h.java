package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float e;
    public a5.a f49237f;
    public float f49238g;
    public float h;
    public float f49239i;
    public float f49240j;
    public float f49241k;
    public Paint.Cap f49242l;
    public Paint.Join f49243m;
    public float f49244n;

    @Override
    public final boolean a() {
        if (!this.f49237f.p() && !this.d.p()) {
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
        return this.f49237f.f281b;
    }

    public float getStrokeAlpha() {
        return this.f49238g;
    }

    public int getStrokeColor() {
        return this.d.f281b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f49240j;
    }

    public float getTrimPathOffset() {
        return this.f49241k;
    }

    public float getTrimPathStart() {
        return this.f49239i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49237f.f281b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49238g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f281b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49240j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49241k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49239i = f7;
    }
}
