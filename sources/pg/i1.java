package pg;

import android.graphics.RectF;
public final class i1 {
    public final l f44509a;
    public float f44510b;
    public float f44511c;
    public float d;
    public float f44512e;
    public float f44513f;
    public float f44514g;
    public float h;
    public float f44515i;
    public float f44516j;
    public float f44517k;
    public boolean f44518l;

    public i1(l lVar) {
        this.f44509a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f44509a;
        if (lVar.o() == 4) {
            float f7 = this.f44510b;
            float f10 = this.f44517k;
            float f11 = this.f44511c;
            rectF.set(f7 - f10, f11 - f10, f7 + f10, f11 + f10);
            rectF.union(this.d, this.f44512e);
            rectF.union(this.f44515i, this.f44516j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f44512e));
            float f12 = this.f44510b;
            float f13 = max * 1.42f;
            float f14 = this.f44511c;
            rectF.set(f12 - f13, f14 - f13, f12 + f13, f14 + f13);
            if (lVar.o() == 3) {
                rectF.union(this.f44515i, this.f44516j);
            }
        }
        float f15 = (-this.f44513f) - 3.0f;
        rectF.inset(f15, f15);
    }
}
