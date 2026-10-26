package rg;

import android.graphics.RectF;
public final class f1 {
    public final l f47415a;
    public float f47416b;
    public float f47417c;
    public float d;
    public float e;
    public float f47418f;
    public float f47419g;
    public float h;
    public float f47420i;
    public float f47421j;
    public float f47422k;
    public boolean f47423l;

    public f1(l lVar) {
        this.f47415a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f47415a;
        if (lVar.o() == 4) {
            float f7 = this.f47416b;
            float f10 = this.f47422k;
            float f11 = this.f47417c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f47420i, this.f47421j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f47416b;
            float f13 = max * 1.42f;
            float f14 = this.f47417c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f47420i, this.f47421j);
            }
        }
        float f15 = (-this.f47418f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
