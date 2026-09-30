package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41142a;
    public float f41143b;
    public float f41144c;
    public float d;
    public float e;
    public float f41145f;
    public float f41146g;
    public float h;
    public float f41147i;
    public float f41148j;
    public float f41149k;
    public boolean f41150l;

    public i1(l lVar) {
        this.f41142a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41142a;
        if (lVar.o() == 4) {
            float f7 = this.f41143b;
            float f10 = this.f41149k;
            float f11 = this.f41144c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41147i, this.f41148j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41143b;
            float f13 = max * 1.42f;
            float f14 = this.f41144c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41147i, this.f41148j);
            }
        }
        float f15 = (-this.f41145f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
