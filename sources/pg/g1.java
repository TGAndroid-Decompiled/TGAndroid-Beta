package pg;

import android.graphics.RectF;
public final class g1 {
    public final l f45538a;
    public float f45539b;
    public float f45540c;
    public float d;
    public float f45541e;
    public float f45542f;
    public float f45543g;
    public float h;
    public float f45544i;
    public float f45545j;
    public float f45546k;
    public boolean f45547l;

    public g1(l lVar) {
        this.f45538a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45538a;
        if (lVar.o() == 4) {
            float f7 = this.f45539b;
            float f10 = this.f45546k;
            float f11 = this.f45540c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45541e);
            rectF.union(this.f45544i, this.f45545j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45541e));
            float f12 = this.f45539b;
            float f13 = max * 1.42f;
            float f14 = this.f45540c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45544i, this.f45545j);
            }
        }
        float f15 = (-this.f45542f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
