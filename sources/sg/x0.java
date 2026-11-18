package sg;

import android.graphics.RectF;
public final class x0 {
    public final g f57397a;
    public float f57398b;
    public float f57399c;
    public float d;
    public float f57400e;
    public float f57401f;
    public float f57402g;
    public float h;
    public float f57403i;
    public float f57404j;
    public float f57405k;
    public boolean f57406l;

    public x0(g gVar) {
        this.f57397a = gVar;
    }

    public final void a(RectF rectF) {
        g gVar = this.f57397a;
        if (gVar.o() == 4) {
            float f10 = this.f57398b;
            float f11 = this.f57405k;
            float f12 = this.f57399c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f57400e);
            rectF.union(this.f57403i, this.f57404j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f57400e));
            float f13 = this.f57398b;
            float f14 = max * 1.42f;
            float f15 = this.f57399c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (gVar.o() == 3) {
                rectF.union(this.f57403i, this.f57404j);
            }
        }
        float f16 = (-this.f57401f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
