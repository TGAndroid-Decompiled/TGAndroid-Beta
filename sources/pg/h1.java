package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f45697a;
    public float f45698b;
    public float f45699c;
    public float d;
    public float f45700e;
    public float f45701f;
    public float f45702g;
    public float h;
    public float f45703i;
    public float f45704j;
    public float f45705k;
    public boolean f45706l;

    public h1(l lVar) {
        this.f45697a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45697a;
        if (lVar.o() == 4) {
            float f7 = this.f45698b;
            float f10 = this.f45705k;
            float f11 = this.f45699c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45700e);
            rectF.union(this.f45703i, this.f45704j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45700e));
            float f12 = this.f45698b;
            float f13 = max * 1.42f;
            float f14 = this.f45699c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45703i, this.f45704j);
            }
        }
        float f15 = (-this.f45701f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
