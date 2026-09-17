package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f44428a;
    public float f44429b;
    public float f44430c;
    public float d;
    public float f44431e;
    public float f44432f;
    public float f44433g;
    public float h;
    public float f44434i;
    public float f44435j;
    public float f44436k;
    public boolean f44437l;

    public f1(l lVar) {
        this.f44428a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44428a;
        if (lVar.o() == 4) {
            float f7 = this.f44429b;
            float f10 = this.f44436k;
            float f11 = this.f44430c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44431e);
            rectF.union(this.f44434i, this.f44435j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44431e));
            float f12 = this.f44429b;
            float f13 = max * 1.42f;
            float f14 = this.f44430c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44434i, this.f44435j);
            }
        }
        float f15 = (-this.f44432f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
