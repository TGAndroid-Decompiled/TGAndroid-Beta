package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f45653a;
    public float f45654b;
    public float f45655c;
    public float d;
    public float f45656e;
    public float f45657f;
    public float f45658g;
    public float h;
    public float f45659i;
    public float f45660j;
    public float f45661k;
    public boolean f45662l;

    public h1(l lVar) {
        this.f45653a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45653a;
        if (lVar.o() == 4) {
            float f7 = this.f45654b;
            float f10 = this.f45661k;
            float f11 = this.f45655c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45656e);
            rectF.union(this.f45659i, this.f45660j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45656e));
            float f12 = this.f45654b;
            float f13 = max * 1.42f;
            float f14 = this.f45655c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45659i, this.f45660j);
            }
        }
        float f15 = (-this.f45657f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
