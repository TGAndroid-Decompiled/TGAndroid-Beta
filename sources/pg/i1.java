package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f44502a;
    public float f44503b;
    public float f44504c;
    public float d;
    public float f44505e;
    public float f44506f;
    public float f44507g;
    public float h;
    public float f44508i;
    public float f44509j;
    public float f44510k;
    public boolean f44511l;

    public i1(l lVar) {
        this.f44502a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44502a;
        if (lVar.o() == 4) {
            float f7 = this.f44503b;
            float f10 = this.f44510k;
            float f11 = this.f44504c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44505e);
            rectF.union(this.f44508i, this.f44509j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44505e));
            float f12 = this.f44503b;
            float f13 = max * 1.42f;
            float f14 = this.f44504c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44508i, this.f44509j);
            }
        }
        float f15 = (-this.f44506f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
