package pg;

import android.graphics.RectF;
public final class g1 {
    public final l f45533a;
    public float f45534b;
    public float f45535c;
    public float d;
    public float f45536e;
    public float f45537f;
    public float f45538g;
    public float h;
    public float f45539i;
    public float f45540j;
    public float f45541k;
    public boolean f45542l;

    public g1(l lVar) {
        this.f45533a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f45533a;
        if (lVar.o() == 4) {
            float f7 = this.f45534b;
            float f10 = this.f45541k;
            float f11 = this.f45535c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f45536e);
            rectF.union(this.f45539i, this.f45540j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f45536e));
            float f12 = this.f45534b;
            float f13 = max * 1.42f;
            float f14 = this.f45535c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f45539i, this.f45540j);
            }
        }
        float f15 = (-this.f45537f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
