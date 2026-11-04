package tg;

import android.graphics.RectF;
public final class x0 {
    public final g f55364a;
    public float f55365b;
    public float f55366c;
    public float d;
    public float f55367e;
    public float f55368f;
    public float f55369g;
    public float h;
    public float f55370i;
    public float f55371j;
    public float f55372k;
    public boolean f55373l;

    public x0(g gVar) {
        this.f55364a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55364a;
        if (gVar.o() == 4) {
            float f10 = this.f55365b;
            float f11 = this.f55372k;
            float f12 = this.f55366c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55367e);
            rectF.union(this.f55370i, this.f55371j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55367e));
            float f13 = this.f55365b;
            float f14 = max * 1.42f;
            float f15 = this.f55366c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55370i, this.f55371j);
            }
        }
        float f16 = (-this.f55368f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
