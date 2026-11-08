package sg;

import android.graphics.RectF;
public final class z0 {
    public final g f55266a;
    public float f55267b;
    public float f55268c;
    public float d;
    public float f55269e;
    public float f55270f;
    public float f55271g;
    public float h;
    public float f55272i;
    public float f55273j;
    public float f55274k;
    public boolean f55275l;

    public z0(g gVar) {
        this.f55266a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f55266a;
        if (gVar.o() == 4) {
            float f10 = this.f55267b;
            float f11 = this.f55274k;
            float f12 = this.f55268c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f55269e);
            rectF.union(this.f55272i, this.f55273j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f55269e));
            float f13 = this.f55267b;
            float f14 = max * 1.42f;
            float f15 = this.f55268c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f55272i, this.f55273j);
            }
        }
        float f16 = (-this.f55270f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
