package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f45721a;
    public float f45722b;
    public float f45723c;
    public float d;
    public float f45724e;
    public float f45725f;
    public float f45726g;
    public float h;
    public float f45727i;
    public float f45728j;
    public float f45729k;
    public boolean f45730l;

    public h1(l lVar) {
        this.f45721a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45721a;
        if (lVar.o() == 4) {
            float f7 = this.f45722b;
            float f10 = this.f45729k;
            float f11 = this.f45723c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45724e);
            rectF.union(this.f45727i, this.f45728j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45724e));
            float f12 = this.f45722b;
            float f13 = max * 1.42f;
            float f14 = this.f45723c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45727i, this.f45728j);
            }
        }
        float f15 = (-this.f45725f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
