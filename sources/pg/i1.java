package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f44494a;
    public float f44495b;
    public float f44496c;
    public float d;
    public float f44497e;
    public float f44498f;
    public float f44499g;
    public float h;
    public float f44500i;
    public float f44501j;
    public float f44502k;
    public boolean f44503l;

    public i1(l lVar) {
        this.f44494a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44494a;
        if (lVar.o() == 4) {
            float f7 = this.f44495b;
            float f10 = this.f44502k;
            float f11 = this.f44496c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44497e);
            rectF.union(this.f44500i, this.f44501j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44497e));
            float f12 = this.f44495b;
            float f13 = max * 1.42f;
            float f14 = this.f44496c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44500i, this.f44501j);
            }
        }
        float f15 = (-this.f44498f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
