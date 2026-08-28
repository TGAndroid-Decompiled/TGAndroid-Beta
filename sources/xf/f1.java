package xf;

import android.graphics.RectF;
public final class f1 {
    public final l f49219a;
    public float f49220b;
    public float f49221c;
    public float d;
    public float f49222e;
    public float f49223f;
    public float f49224g;
    public float h;
    public float f49225i;
    public float f49226j;
    public float f49227k;
    public boolean f49228l;

    public f1(l lVar) {
        this.f49219a = lVar;
    }

    public final void a(RectF rectF) {
        l lVar = this.f49219a;
        if (lVar.o() == 4) {
            float f10 = this.f49220b;
            float f11 = this.f49227k;
            float f12 = this.f49221c;
            rectF.set(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
            rectF.union(this.d, this.f49222e);
            rectF.union(this.f49225i, this.f49226j);
        } else {
            float max = Math.max(Math.abs(this.d), Math.abs(this.f49222e));
            float f13 = this.f49220b;
            float f14 = max * 1.42f;
            float f15 = this.f49221c;
            rectF.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
            if (lVar.o() == 3) {
                rectF.union(this.f49225i, this.f49226j);
            }
        }
        float f16 = (-this.f49223f) - 3.0f;
        rectF.inset(f16, f16);
    }
}
