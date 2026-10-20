package qg;

import android.graphics.RectF;
public final class i1 {
    public final l f44538a;
    public float f44539b;
    public float f44540c;
    public float d;
    public float e;
    public float f44541f;
    public float f44542g;
    public float h;
    public float f44543i;
    public float f44544j;
    public float f44545k;
    public boolean f44546l;

    public i1(l lVar) {
        this.f44538a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44538a;
        if (lVar.o() == 4) {
            float f7 = this.f44539b;
            float f10 = this.f44545k;
            float f11 = this.f44540c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44543i, this.f44544j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44539b;
            float f13 = max * 1.42f;
            float f14 = this.f44540c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44543i, this.f44544j);
            }
        }
        float f15 = (-this.f44541f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
