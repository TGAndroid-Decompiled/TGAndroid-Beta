package yf;

import android.graphics.RectF;

public final class e1 {

    public final l f49921a;

    public float f49922b;

    public float f49923c;
    public float d;

    public float f49924e;

    public float f49925f;

    public float f49926g;
    public float h;

    public float f49927i;

    public float f49928j;

    public float f49929k;

    public boolean f49930l;

    public e1(l lVar) {
        this.f49921a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f49921a;
        if (lVar.o() == 4) {
            float f10 = this.f49922b;
            float f11 = this.f49929k;
            float f12 = this.f49923c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f49924e);
            rectF.union(this.f49927i, this.f49928j);
        } else {
            float fMax = Math.max(Math.abs(this.d), Math.abs(this.f49924e));
            float f13 = this.f49922b;
            float f14 = fMax * 1.42f;
            float f15 = this.f49923c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.f49927i, this.f49928j);
            }
        }
        float f16 = (-this.f49925f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
