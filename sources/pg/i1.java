package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41126a;
    public float f41127b;
    public float f41128c;
    public float d;
    public float e;
    public float f41129f;
    public float f41130g;
    public float h;
    public float f41131i;
    public float f41132j;
    public float f41133k;
    public boolean f41134l;

    public i1(l lVar) {
        this.f41126a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41126a;
        if (lVar.o() == 4) {
            float f7 = this.f41127b;
            float f10 = this.f41133k;
            float f11 = this.f41128c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41131i, this.f41132j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41127b;
            float f13 = max * 1.42f;
            float f14 = this.f41128c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41131i, this.f41132j);
            }
        }
        float f15 = (-this.f41129f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
