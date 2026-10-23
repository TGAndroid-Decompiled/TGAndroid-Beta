package qg;

import android.graphics.RectF;
public final class i1 {
    public final l f44542a;
    public float f44543b;
    public float f44544c;
    public float d;
    public float e;
    public float f44545f;
    public float f44546g;
    public float h;
    public float f44547i;
    public float f44548j;
    public float f44549k;
    public boolean f44550l;

    public i1(l lVar) {
        this.f44542a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44542a;
        if (lVar.o() == 4) {
            float f7 = this.f44543b;
            float f10 = this.f44549k;
            float f11 = this.f44544c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f44547i, this.f44548j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f44543b;
            float f13 = max * 1.42f;
            float f14 = this.f44544c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44547i, this.f44548j);
            }
        }
        float f15 = (-this.f44545f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
