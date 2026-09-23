package pg;

import android.graphics.RectF;
public final class g1 {
    public final l f40816a;
    public float f40817b;
    public float f40818c;
    public float d;
    public float e;
    public float f40819f;
    public float f40820g;
    public float h;
    public float f40821i;
    public float f40822j;
    public float f40823k;
    public boolean f40824l;

    public g1(l lVar) {
        this.f40816a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f40816a;
        if (lVar.o() == 4) {
            float f7 = this.f40817b;
            float f10 = this.f40823k;
            float f11 = this.f40818c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f40821i, this.f40822j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f40817b;
            float f13 = max * 1.42f;
            float f14 = this.f40818c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f40821i, this.f40822j);
            }
        }
        float f15 = (-this.f40819f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
