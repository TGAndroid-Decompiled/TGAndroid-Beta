package rg;

import android.graphics.RectF;
public final class f1 {
    public final l f47450a;
    public float f47451b;
    public float f47452c;
    public float d;
    public float e;
    public float f47453f;
    public float f47454g;
    public float h;
    public float f47455i;
    public float f47456j;
    public float f47457k;
    public boolean f47458l;

    public f1(l lVar) {
        this.f47450a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f47450a;
        if (lVar.o() == 4) {
            float f7 = this.f47451b;
            float f10 = this.f47457k;
            float f11 = this.f47452c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f47455i, this.f47456j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f47451b;
            float f13 = max * 1.42f;
            float f14 = this.f47452c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f47455i, this.f47456j);
            }
        }
        float f15 = (-this.f47453f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
