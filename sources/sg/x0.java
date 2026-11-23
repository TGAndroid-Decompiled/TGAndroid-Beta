package sg;

import android.graphics.RectF;
public final class x0 {
    public final g f57407a;
    public float f57408b;
    public float f57409c;
    public float d;
    public float f57410e;
    public float f57411f;
    public float f57412g;
    public float h;
    public float f57413i;
    public float f57414j;
    public float f57415k;
    public boolean f57416l;

    public x0(g gVar) {
        this.f57407a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f57407a;
        if (gVar.o() == 4) {
            float f10 = this.f57408b;
            float f11 = this.f57415k;
            float f12 = this.f57409c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f57410e);
            rectF.union(this.f57413i, this.f57414j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f57410e));
            float f13 = this.f57408b;
            float f14 = max * 1.42f;
            float f15 = this.f57409c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f57413i, this.f57414j);
            }
        }
        float f16 = (-this.f57411f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
