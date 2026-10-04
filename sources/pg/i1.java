package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f44495a;
    public float f44496b;
    public float f44497c;
    public float d;
    public float f44498e;
    public float f44499f;
    public float f44500g;
    public float h;
    public float f44501i;
    public float f44502j;
    public float f44503k;
    public boolean f44504l;

    public i1(l lVar) {
        this.f44495a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44495a;
        if (lVar.o() == 4) {
            float f7 = this.f44496b;
            float f10 = this.f44503k;
            float f11 = this.f44497c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44498e);
            rectF.union(this.f44501i, this.f44502j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44498e));
            float f12 = this.f44496b;
            float f13 = max * 1.42f;
            float f14 = this.f44497c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44501i, this.f44502j);
            }
        }
        float f15 = (-this.f44499f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
