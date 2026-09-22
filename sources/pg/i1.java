package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41189a;
    public float f41190b;
    public float f41191c;
    public float d;
    public float e;
    public float f41192f;
    public float f41193g;
    public float h;
    public float f41194i;
    public float f41195j;
    public float f41196k;
    public boolean f41197l;

    public i1(l lVar) {
        this.f41189a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41189a;
        if (lVar.o() == 4) {
            float f7 = this.f41190b;
            float f10 = this.f41196k;
            float f11 = this.f41191c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41194i, this.f41195j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41190b;
            float f13 = max * 1.42f;
            float f14 = this.f41191c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41194i, this.f41195j);
            }
        }
        float f15 = (-this.f41192f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
