package rg;

import android.graphics.RectF;
public final class f1 {
    public final l f47412a;
    public float f47413b;
    public float f47414c;
    public float d;
    public float e;
    public float f47415f;
    public float f47416g;
    public float h;
    public float f47417i;
    public float f47418j;
    public float f47419k;
    public boolean f47420l;

    public f1(l lVar) {
        this.f47412a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f47412a;
        if (lVar.o() == 4) {
            float f7 = this.f47413b;
            float f10 = this.f47419k;
            float f11 = this.f47414c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f47417i, this.f47418j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f47413b;
            float f13 = max * 1.42f;
            float f14 = this.f47414c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f47417i, this.f47418j);
            }
        }
        float f15 = (-this.f47415f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
