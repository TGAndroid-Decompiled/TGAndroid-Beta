package sg;

import android.graphics.RectF;
public final class z0 {
    public final g f55174a;
    public float f55175b;
    public float f55176c;
    public float d;
    public float f55177e;
    public float f55178f;
    public float f55179g;
    public float h;
    public float f55180i;
    public float f55181j;
    public float f55182k;
    public boolean f55183l;

    public z0(g gVar) {
        this.f55174a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55174a;
        if (gVar.o() == 4) {
            float f10 = this.f55175b;
            float f11 = this.f55182k;
            float f12 = this.f55176c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55177e);
            rectF.union(this.f55180i, this.f55181j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55177e));
            float f13 = this.f55175b;
            float f14 = max * 1.42f;
            float f15 = this.f55176c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55180i, this.f55181j);
            }
        }
        float f16 = (-this.f55178f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
