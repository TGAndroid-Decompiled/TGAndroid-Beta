package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f44427a;
    public float f44428b;
    public float f44429c;
    public float d;
    public float f44430e;
    public float f44431f;
    public float f44432g;
    public float h;
    public float f44433i;
    public float f44434j;
    public float f44435k;
    public boolean f44436l;

    public f1(l lVar) {
        this.f44427a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44427a;
        if (lVar.o() == 4) {
            float f7 = this.f44428b;
            float f10 = this.f44435k;
            float f11 = this.f44429c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44430e);
            rectF.union(this.f44433i, this.f44434j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44430e));
            float f12 = this.f44428b;
            float f13 = max * 1.42f;
            float f14 = this.f44429c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44433i, this.f44434j);
            }
        }
        float f15 = (-this.f44431f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
