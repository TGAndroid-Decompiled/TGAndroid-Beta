package qg;

import android.graphics.RectF;
public final class h1 {
    public final l f44951a;
    public float f44952b;
    public float f44953c;
    public float d;
    public float e;
    public float f44954f;
    public float f44955g;
    public float h;
    public float f44956i;
    public float f44957j;
    public float f44958k;
    public boolean f44959l;

    public h1(l lVar) {
        this.f44951a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44951a;
        if (lVar.o() == 4) {
            float f7 = this.f44952b;
            float f10 = this.f44958k;
            float f11 = this.f44953c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44956i, this.f44957j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44952b;
            float f13 = max * 1.42f;
            float f14 = this.f44953c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44956i, this.f44957j);
            }
        }
        float f15 = (-this.f44954f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
