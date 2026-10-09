package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f45651a;
    public float f45652b;
    public float f45653c;
    public float d;
    public float f45654e;
    public float f45655f;
    public float f45656g;
    public float h;
    public float f45657i;
    public float f45658j;
    public float f45659k;
    public boolean f45660l;

    public h1(l lVar) {
        this.f45651a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45651a;
        if (lVar.o() == 4) {
            float f7 = this.f45652b;
            float f10 = this.f45659k;
            float f11 = this.f45653c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45654e);
            rectF.union(this.f45657i, this.f45658j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45654e));
            float f12 = this.f45652b;
            float f13 = max * 1.42f;
            float f14 = this.f45653c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45657i, this.f45658j);
            }
        }
        float f15 = (-this.f45655f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
