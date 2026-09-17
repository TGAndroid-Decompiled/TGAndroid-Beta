package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f44456a;
    public float f44457b;
    public float f44458c;
    public float d;
    public float f44459e;
    public float f44460f;
    public float f44461g;
    public float h;
    public float f44462i;
    public float f44463j;
    public float f44464k;
    public boolean f44465l;

    public f1(l lVar) {
        this.f44456a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44456a;
        if (lVar.o() == 4) {
            float f7 = this.f44457b;
            float f10 = this.f44464k;
            float f11 = this.f44458c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44459e);
            rectF.union(this.f44462i, this.f44463j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44459e));
            float f12 = this.f44457b;
            float f13 = max * 1.42f;
            float f14 = this.f44458c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44462i, this.f44463j);
            }
        }
        float f15 = (-this.f44460f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
