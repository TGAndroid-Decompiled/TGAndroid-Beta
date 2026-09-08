package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f44455a;
    public float f44456b;
    public float f44457c;
    public float d;
    public float f44458e;
    public float f44459f;
    public float f44460g;
    public float h;
    public float f44461i;
    public float f44462j;
    public float f44463k;
    public boolean f44464l;

    public f1(l lVar) {
        this.f44455a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44455a;
        if (lVar.o() == 4) {
            float f7 = this.f44456b;
            float f10 = this.f44463k;
            float f11 = this.f44457c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44458e);
            rectF.union(this.f44461i, this.f44462j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44458e));
            float f12 = this.f44456b;
            float f13 = max * 1.42f;
            float f14 = this.f44457c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44461i, this.f44462j);
            }
        }
        float f15 = (-this.f44459f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
