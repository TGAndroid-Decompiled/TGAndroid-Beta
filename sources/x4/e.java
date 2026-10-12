package x4;

import android.animation.TypeEvaluator;
import v7.c8;
public final class e implements TypeEvaluator {
    public i0.d[] f50836a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (c8.a(dVarArr, dVarArr2)) {
            if (!c8.a(this.f50836a, dVarArr)) {
                this.f50836a = c8.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f50836a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f11578a = dVar2.f11578a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f11579b;
                    if (i11 < fArr.length) {
                        dVar.f11579b[i11] = (dVar3.f11579b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f50836a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
