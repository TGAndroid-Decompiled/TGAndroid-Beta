package qg;

import android.graphics.RectF;
public final class h1 {
    public final l f44529a;
    public float f44530b;
    public float f44531c;
    public float d;
    public float e;
    public float f44532f;
    public float f44533g;
    public float h;
    public float f44534i;
    public float f44535j;
    public float f44536k;
    public boolean f44537l;

    public h1(l lVar) {
        this.f44529a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44529a;
        if (lVar.o() == 4) {
            float f7 = this.f44530b;
            float f10 = this.f44536k;
            float f11 = this.f44531c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44534i, this.f44535j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44530b;
            float f13 = max * 1.42f;
            float f14 = this.f44531c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44534i, this.f44535j);
            }
        }
        float f15 = (-this.f44532f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
