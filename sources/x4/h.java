package x4;

import android.graphics.Paint;
public final class h extends k {
    public a5.a d;
    public float e;
    public a5.a f49242f;
    public float f49243g;
    public float h;
    public float f49244i;
    public float f49245j;
    public float f49246k;
    public Paint.Cap f49247l;
    public Paint.Join f49248m;
    public float f49249n;

    @Override
    public final boolean a() {
        if (!this.f49242f.p() && !this.d.p()) {
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
        return this.f49242f.f281b;
    }

    public float getStrokeAlpha() {
        return this.f49243g;
    }

    public int getStrokeColor() {
        return this.d.f281b;
    }

    public float getStrokeWidth() {
        return this.e;
    }

    public float getTrimPathEnd() {
        return this.f49245j;
    }

    public float getTrimPathOffset() {
        return this.f49246k;
    }

    public float getTrimPathStart() {
        return this.f49244i;
    }

    public void setFillAlpha(float f7) {
        this.h = f7;
    }

    public void setFillColor(int i10) {
        this.f49242f.f281b = i10;
    }

    public void setStrokeAlpha(float f7) {
        this.f49243g = f7;
    }

    public void setStrokeColor(int i10) {
        this.d.f281b = i10;
    }

    public void setStrokeWidth(float f7) {
        this.e = f7;
    }

    public void setTrimPathEnd(float f7) {
        this.f49245j = f7;
    }

    public void setTrimPathOffset(float f7) {
        this.f49246k = f7;
    }

    public void setTrimPathStart(float f7) {
        this.f49244i = f7;
    }
}
