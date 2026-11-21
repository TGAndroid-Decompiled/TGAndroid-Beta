package sg;

import android.graphics.RectF;
public final class x0 {
    public final g f57438a;
    public float f57439b;
    public float f57440c;
    public float d;
    public float f57441e;
    public float f57442f;
    public float f57443g;
    public float h;
    public float f57444i;
    public float f57445j;
    public float f57446k;
    public boolean f57447l;

    public x0(g gVar) {
        this.f57438a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f57438a;
        if (gVar.o() == 4) {
            float f10 = this.f57439b;
            float f11 = this.f57446k;
            float f12 = this.f57440c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f57441e);
            rectF.union(this.f57444i, this.f57445j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f57441e));
            float f13 = this.f57439b;
            float f14 = max * 1.42f;
            float f15 = this.f57440c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f57444i, this.f57445j);
            }
        }
        float f16 = (-this.f57442f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
