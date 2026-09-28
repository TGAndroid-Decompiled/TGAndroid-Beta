package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41141a;
    public float f41142b;
    public float f41143c;
    public float d;
    public float e;
    public float f41144f;
    public float f41145g;
    public float h;
    public float f41146i;
    public float f41147j;
    public float f41148k;
    public boolean f41149l;

    public i1(l lVar) {
        this.f41141a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41141a;
        if (lVar.o() == 4) {
            float f7 = this.f41142b;
            float f10 = this.f41148k;
            float f11 = this.f41143c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41146i, this.f41147j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41142b;
            float f13 = max * 1.42f;
            float f14 = this.f41143c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41146i, this.f41147j);
            }
        }
        float f15 = (-this.f41144f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
