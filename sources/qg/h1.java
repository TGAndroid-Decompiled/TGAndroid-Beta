package qg;

import android.graphics.RectF;
public final class h1 {
    public final l f44553a;
    public float f44554b;
    public float f44555c;
    public float d;
    public float e;
    public float f44556f;
    public float f44557g;
    public float h;
    public float f44558i;
    public float f44559j;
    public float f44560k;
    public boolean f44561l;

    public h1(l lVar) {
        this.f44553a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44553a;
        if (lVar.o() == 4) {
            float f7 = this.f44554b;
            float f10 = this.f44560k;
            float f11 = this.f44555c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44558i, this.f44559j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44554b;
            float f13 = max * 1.42f;
            float f14 = this.f44555c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44558i, this.f44559j);
            }
        }
        float f15 = (-this.f44556f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
