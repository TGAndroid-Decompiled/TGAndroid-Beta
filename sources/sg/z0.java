package sg;

import android.graphics.RectF;
public final class z0 {
    public final g f55150a;
    public float f55151b;
    public float f55152c;
    public float d;
    public float f55153e;
    public float f55154f;
    public float f55155g;
    public float h;
    public float f55156i;
    public float f55157j;
    public float f55158k;
    public boolean f55159l;

    public z0(g gVar) {
        this.f55150a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55150a;
        if (gVar.o() == 4) {
            float f10 = this.f55151b;
            float f11 = this.f55158k;
            float f12 = this.f55152c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55153e);
            rectF.union(this.f55156i, this.f55157j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55153e));
            float f13 = this.f55151b;
            float f14 = max * 1.42f;
            float f15 = this.f55152c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55156i, this.f55157j);
            }
        }
        float f16 = (-this.f55154f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
