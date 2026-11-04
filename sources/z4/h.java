package z4;

import android.graphics.Paint;
import b8.kg;
public final class h extends k {
    public kg d;
    public float f59712e;
    public kg f59713f;
    public float f59714g;
    public float h;
    public float f59715i;
    public float f59716j;
    public float f59717k;
    public Paint.Cap f59718l;
    public Paint.Join f59719m;
    public float f59720n;

    @Override
    public final boolean a() {
        if (!this.f59713f.o() && !this.d.o()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean b(int[] r7) {
        throw new UnsupportedOperationException("Method not decompiled: z4.h.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f59713f.f2722b;
    }

    public float getStrokeAlpha() {
        return this.f59714g;
    }

    public int getStrokeColor() {
        return this.d.f2722b;
    }

    public float getStrokeWidth() {
        return this.f59712e;
    }

    public float getTrimPathEnd() {
        return this.f59716j;
    }

    public float getTrimPathOffset() {
        return this.f59717k;
    }

    public float getTrimPathStart() {
        return this.f59715i;
    }

    public void setFillAlpha(float f10) {
        this.h = f10;
    }

    public void setFillColor(int i3) {
        this.f59713f.f2722b = i3;
    }

    public void setStrokeAlpha(float f10) {
        this.f59714g = f10;
    }

    public void setStrokeColor(int i3) {
        this.d.f2722b = i3;
    }

    public void setStrokeWidth(float f10) {
        this.f59712e = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f59716j = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f59717k = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f59715i = f10;
    }
}
