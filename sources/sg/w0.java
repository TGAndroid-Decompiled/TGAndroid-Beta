package sg;

import android.graphics.RectF;
public final class w0 {
    public final g f57512a;
    public float f57513b;
    public float f57514c;
    public float d;
    public float f57515e;
    public float f57516f;
    public float f57517g;
    public float h;
    public float f57518i;
    public float f57519j;
    public float f57520k;
    public boolean f57521l;

    public w0(g gVar) {
        this.f57512a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f57512a;
        if (gVar.o() == 4) {
            float f10 = this.f57513b;
            float f11 = this.f57520k;
            float f12 = this.f57514c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f57515e);
            rectF.union(this.f57518i, this.f57519j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f57515e));
            float f13 = this.f57513b;
            float f14 = max * 1.42f;
            float f15 = this.f57514c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f57518i, this.f57519j);
            }
        }
        float f16 = (-this.f57516f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
