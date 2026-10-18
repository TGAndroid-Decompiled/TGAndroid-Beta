package qg;

import android.graphics.RectF;
public final class h1 {
    public final l f44573a;
    public float f44574b;
    public float f44575c;
    public float d;
    public float e;
    public float f44576f;
    public float f44577g;
    public float h;
    public float f44578i;
    public float f44579j;
    public float f44580k;
    public boolean f44581l;

    public h1(l lVar) {
        this.f44573a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44573a;
        if (lVar.o() == 4) {
            float f7 = this.f44574b;
            float f10 = this.f44580k;
            float f11 = this.f44575c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44578i, this.f44579j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44574b;
            float f13 = max * 1.42f;
            float f14 = this.f44575c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44578i, this.f44579j);
            }
        }
        float f15 = (-this.f44576f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
