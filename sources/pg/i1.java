package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f41239a;
    public float f41240b;
    public float f41241c;
    public float d;
    public float e;
    public float f41242f;
    public float f41243g;
    public float h;
    public float f41244i;
    public float f41245j;
    public float f41246k;
    public boolean f41247l;

    public i1(l lVar) {
        this.f41239a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f41239a;
        if (lVar.o() == 4) {
            float f7 = this.f41240b;
            float f10 = this.f41246k;
            float f11 = this.f41241c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f41244i, this.f41245j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f41240b;
            float f13 = max * 1.42f;
            float f14 = this.f41241c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f41244i, this.f41245j);
            }
        }
        float f15 = (-this.f41242f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
