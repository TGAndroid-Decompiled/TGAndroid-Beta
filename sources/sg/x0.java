package sg;

import android.graphics.RectF;
public final class x0 {
    public final g f57442a;
    public float f57443b;
    public float f57444c;
    public float d;
    public float f57445e;
    public float f57446f;
    public float f57447g;
    public float h;
    public float f57448i;
    public float f57449j;
    public float f57450k;
    public boolean f57451l;

    public x0(g gVar) {
        this.f57442a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f57442a;
        if (gVar.o() == 4) {
            float f10 = this.f57443b;
            float f11 = this.f57450k;
            float f12 = this.f57444c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f57445e);
            rectF.union(this.f57448i, this.f57449j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f57445e));
            float f13 = this.f57443b;
            float f14 = max * 1.42f;
            float f15 = this.f57444c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f57448i, this.f57449j);
            }
        }
        float f16 = (-this.f57446f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
