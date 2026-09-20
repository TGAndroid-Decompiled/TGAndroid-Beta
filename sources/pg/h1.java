package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f41167a;
    public float f41168b;
    public float f41169c;
    public float d;
    public float e;
    public float f41170f;
    public float f41171g;
    public float h;
    public float f41172i;
    public float f41173j;
    public float f41174k;
    public boolean f41175l;

    public h1(l lVar) {
        this.f41167a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41167a;
        if (lVar.o() == 4) {
            float f7 = this.f41168b;
            float f10 = this.f41174k;
            float f11 = this.f41169c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41172i, this.f41173j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41168b;
            float f13 = max * 1.42f;
            float f14 = this.f41169c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41172i, this.f41173j);
            }
        }
        float f15 = (-this.f41170f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
