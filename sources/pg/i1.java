package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41138a;
    public float f41139b;
    public float f41140c;
    public float d;
    public float e;
    public float f41141f;
    public float f41142g;
    public float h;
    public float f41143i;
    public float f41144j;
    public float f41145k;
    public boolean f41146l;

    public i1(l lVar) {
        this.f41138a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41138a;
        if (lVar.o() == 4) {
            float f7 = this.f41139b;
            float f10 = this.f41145k;
            float f11 = this.f41140c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41143i, this.f41144j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41139b;
            float f13 = max * 1.42f;
            float f14 = this.f41140c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41143i, this.f41144j);
            }
        }
        float f15 = (-this.f41141f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
