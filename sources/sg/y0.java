package sg;

import android.graphics.RectF;
public final class y0 {
    public final g f55274a;
    public float f55275b;
    public float f55276c;
    public float d;
    public float f55277e;
    public float f55278f;
    public float f55279g;
    public float h;
    public float f55280i;
    public float f55281j;
    public float f55282k;
    public boolean f55283l;

    public y0(g gVar) {
        this.f55274a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55274a;
        if (gVar.o() == 4) {
            float f10 = this.f55275b;
            float f11 = this.f55282k;
            float f12 = this.f55276c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55277e);
            rectF.union(this.f55280i, this.f55281j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55277e));
            float f13 = this.f55275b;
            float f14 = max * 1.42f;
            float f15 = this.f55276c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55280i, this.f55281j);
            }
        }
        float f16 = (-this.f55278f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
