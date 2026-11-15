package sg;

import android.graphics.RectF;
public final class x0 {
    public final g f56823a;
    public float f56824b;
    public float f56825c;
    public float d;
    public float f56826e;
    public float f56827f;
    public float f56828g;
    public float h;
    public float f56829i;
    public float f56830j;
    public float f56831k;
    public boolean f56832l;

    public x0(g gVar) {
        this.f56823a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f56823a;
        if (gVar.o() == 4) {
            float f10 = this.f56824b;
            float f11 = this.f56831k;
            float f12 = this.f56825c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f56826e);
            rectF.union(this.f56829i, this.f56830j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f56826e));
            float f13 = this.f56824b;
            float f14 = max * 1.42f;
            float f15 = this.f56825c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f56829i, this.f56830j);
            }
        }
        float f16 = (-this.f56827f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
