package pg;

import android.graphics.RectF;
public final class h1 {
    public final l f45687a;
    public float f45688b;
    public float f45689c;
    public float d;
    public float f45690e;
    public float f45691f;
    public float f45692g;
    public float h;
    public float f45693i;
    public float f45694j;
    public float f45695k;
    public boolean f45696l;

    public h1(l lVar) {
        this.f45687a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45687a;
        if (lVar.o() == 4) {
            float f7 = this.f45688b;
            float f10 = this.f45695k;
            float f11 = this.f45689c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45690e);
            rectF.union(this.f45693i, this.f45694j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45690e));
            float f12 = this.f45688b;
            float f13 = max * 1.42f;
            float f14 = this.f45689c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45693i, this.f45694j);
            }
        }
        float f15 = (-this.f45691f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
