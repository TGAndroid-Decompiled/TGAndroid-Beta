package pg;

import android.graphics.RectF;
public final class f1 {
    public final l f40889a;
    public float f40890b;
    public float f40891c;
    public float d;
    public float e;
    public float f40892f;
    public float f40893g;
    public float h;
    public float f40894i;
    public float f40895j;
    public float f40896k;
    public boolean f40897l;

    public f1(l lVar) {
        this.f40889a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f40889a;
        if (lVar.o() == 4) {
            float f7 = this.f40890b;
            float f10 = this.f40896k;
            float f11 = this.f40891c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f40894i, this.f40895j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f40890b;
            float f13 = max * 1.42f;
            float f14 = this.f40891c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f40894i, this.f40895j);
            }
        }
        float f15 = (-this.f40892f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
