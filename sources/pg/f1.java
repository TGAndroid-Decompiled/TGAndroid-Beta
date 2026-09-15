package pg;

import android.graphics.RectF;
public final class f1 {
    public final l f40862a;
    public float f40863b;
    public float f40864c;
    public float d;
    public float e;
    public float f40865f;
    public float f40866g;
    public float h;
    public float f40867i;
    public float f40868j;
    public float f40869k;
    public boolean f40870l;

    public f1(l lVar) {
        this.f40862a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f40862a;
        if (lVar.o() == 4) {
            float f7 = this.f40863b;
            float f10 = this.f40869k;
            float f11 = this.f40864c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f40867i, this.f40868j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f40863b;
            float f13 = max * 1.42f;
            float f14 = this.f40864c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f40867i, this.f40868j);
            }
        }
        float f15 = (-this.f40865f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
