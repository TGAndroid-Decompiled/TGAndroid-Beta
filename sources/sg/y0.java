package sg;

import android.graphics.RectF;
public final class y0 {
    public final g f55275a;
    public float f55276b;
    public float f55277c;
    public float d;
    public float f55278e;
    public float f55279f;
    public float f55280g;
    public float h;
    public float f55281i;
    public float f55282j;
    public float f55283k;
    public boolean f55284l;

    public y0(g gVar) {
        this.f55275a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55275a;
        if (gVar.o() == 4) {
            float f10 = this.f55276b;
            float f11 = this.f55283k;
            float f12 = this.f55277c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55278e);
            rectF.union(this.f55281i, this.f55282j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55278e));
            float f13 = this.f55276b;
            float f14 = max * 1.42f;
            float f15 = this.f55277c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55281i, this.f55282j);
            }
        }
        float f16 = (-this.f55279f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
