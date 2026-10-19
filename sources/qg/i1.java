package qg;

import android.graphics.RectF;
public final class i1 {
    public final l f44530a;
    public float f44531b;
    public float f44532c;
    public float d;
    public float e;
    public float f44533f;
    public float f44534g;
    public float h;
    public float f44535i;
    public float f44536j;
    public float f44537k;
    public boolean f44538l;

    public i1(l lVar) {
        this.f44530a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44530a;
        if (lVar.o() == 4) {
            float f7 = this.f44531b;
            float f10 = this.f44537k;
            float f11 = this.f44532c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44535i, this.f44536j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44531b;
            float f13 = max * 1.42f;
            float f14 = this.f44532c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44535i, this.f44536j);
            }
        }
        float f15 = (-this.f44533f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
