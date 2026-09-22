package pg;

import android.graphics.RectF;
public final class f1 {
    public final l f40858a;
    public float f40859b;
    public float f40860c;
    public float d;
    public float e;
    public float f40861f;
    public float f40862g;
    public float h;
    public float f40863i;
    public float f40864j;
    public float f40865k;
    public boolean f40866l;

    public f1(l lVar) {
        this.f40858a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f40858a;
        if (lVar.o() == 4) {
            float f7 = this.f40859b;
            float f10 = this.f40865k;
            float f11 = this.f40860c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f40863i, this.f40864j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f40859b;
            float f13 = max * 1.42f;
            float f14 = this.f40860c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f40863i, this.f40864j);
            }
        }
        float f15 = (-this.f40861f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
