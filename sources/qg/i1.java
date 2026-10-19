package qg;

import android.graphics.RectF;
public final class i1 {
    public final l f44528a;
    public float f44529b;
    public float f44530c;
    public float d;
    public float e;
    public float f44531f;
    public float f44532g;
    public float h;
    public float f44533i;
    public float f44534j;
    public float f44535k;
    public boolean f44536l;

    public i1(l lVar) {
        this.f44528a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44528a;
        if (lVar.o() == 4) {
            float f7 = this.f44529b;
            float f10 = this.f44535k;
            float f11 = this.f44530c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44533i, this.f44534j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44529b;
            float f13 = max * 1.42f;
            float f14 = this.f44530c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44533i, this.f44534j);
            }
        }
        float f15 = (-this.f44531f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
