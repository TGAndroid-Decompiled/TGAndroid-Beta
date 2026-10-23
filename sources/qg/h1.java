package qg;

import android.graphics.RectF;
public final class h1 {
    public final l f44952a;
    public float f44953b;
    public float f44954c;
    public float d;
    public float e;
    public float f44955f;
    public float f44956g;
    public float h;
    public float f44957i;
    public float f44958j;
    public float f44959k;
    public boolean f44960l;

    public h1(l lVar) {
        this.f44952a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44952a;
        if (lVar.o() == 4) {
            float f7 = this.f44953b;
            float f10 = this.f44959k;
            float f11 = this.f44954c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44957i, this.f44958j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44953b;
            float f13 = max * 1.42f;
            float f14 = this.f44954c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44957i, this.f44958j);
            }
        }
        float f15 = (-this.f44955f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
