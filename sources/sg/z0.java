package sg;

import android.graphics.RectF;
public final class z0 {
    public final g f55175a;
    public float f55176b;
    public float f55177c;
    public float d;
    public float f55178e;
    public float f55179f;
    public float f55180g;
    public float h;
    public float f55181i;
    public float f55182j;
    public float f55183k;
    public boolean f55184l;

    public z0(g gVar) {
        this.f55175a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55175a;
        if (gVar.o() == 4) {
            float f10 = this.f55176b;
            float f11 = this.f55183k;
            float f12 = this.f55177c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55178e);
            rectF.union(this.f55181i, this.f55182j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55178e));
            float f13 = this.f55176b;
            float f14 = max * 1.42f;
            float f15 = this.f55177c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55181i, this.f55182j);
            }
        }
        float f16 = (-this.f55179f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
