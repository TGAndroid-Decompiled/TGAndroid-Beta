package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f43177a;
    public float f43178b;
    public float f43179c;
    public float d;
    public float e;
    public float f43180f;
    public float f43181g;
    public float h;
    public float f43182i;
    public float f43183j;
    public float f43184k;
    public boolean f43185l;

    public f1(l lVar) {
        this.f43177a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f43177a;
        if (lVar.o() == 4) {
            float f7 = this.f43178b;
            float f10 = this.f43184k;
            float f11 = this.f43179c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f43182i, this.f43183j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f43178b;
            float f13 = max * 1.42f;
            float f14 = this.f43179c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f43182i, this.f43183j);
            }
        }
        float f15 = (-this.f43180f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
