package sg;

import android.graphics.RectF;
public final class z0 {
    public final g f55267a;
    public float f55268b;
    public float f55269c;
    public float d;
    public float f55270e;
    public float f55271f;
    public float f55272g;
    public float h;
    public float f55273i;
    public float f55274j;
    public float f55275k;
    public boolean f55276l;

    public z0(g gVar) {
        this.f55267a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55267a;
        if (gVar.o() == 4) {
            float f10 = this.f55268b;
            float f11 = this.f55275k;
            float f12 = this.f55269c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55270e);
            rectF.union(this.f55273i, this.f55274j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55270e));
            float f13 = this.f55268b;
            float f14 = max * 1.42f;
            float f15 = this.f55269c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55273i, this.f55274j);
            }
        }
        float f16 = (-this.f55271f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
