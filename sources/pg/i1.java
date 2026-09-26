package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41140a;
    public float f41141b;
    public float f41142c;
    public float d;
    public float e;
    public float f41143f;
    public float f41144g;
    public float h;
    public float f41145i;
    public float f41146j;
    public float f41147k;
    public boolean f41148l;

    public i1(l lVar) {
        this.f41140a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41140a;
        if (lVar.o() == 4) {
            float f7 = this.f41141b;
            float f10 = this.f41147k;
            float f11 = this.f41142c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41145i, this.f41146j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41141b;
            float f13 = max * 1.42f;
            float f14 = this.f41142c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41145i, this.f41146j);
            }
        }
        float f15 = (-this.f41143f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
