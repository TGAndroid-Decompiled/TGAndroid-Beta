package qg;

import android.graphics.RectF;
public final class f1 {
    public final l f43435a;
    public float f43436b;
    public float f43437c;
    public float d;
    public float e;
    public float f43438f;
    public float f43439g;
    public float h;
    public float f43440i;
    public float f43441j;
    public float f43442k;
    public boolean f43443l;

    public f1(l lVar) {
        this.f43435a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f43435a;
        if (lVar.o() == 4) {
            float f7 = this.f43436b;
            float f10 = this.f43442k;
            float f11 = this.f43437c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.e);
            rectF.union(this.f43440i, this.f43441j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.e));
            float f12 = this.f43436b;
            float f13 = max * 1.42f;
            float f14 = this.f43437c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f43440i, this.f43441j);
            }
        }
        float f15 = (-this.f43438f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
