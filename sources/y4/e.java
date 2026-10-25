package y4;

import a8.rc;
import android.animation.TypeEvaluator;
public final class e implements TypeEvaluator {
    public i0.d[] f51990a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (rc.a(dVarArr, dVarArr2)) {
            if (!rc.a(this.f51990a, dVarArr)) {
                this.f51990a = rc.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f51990a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f13454a = dVar2.f13454a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f13455b;
                    if (i11 < fArr.length) {
                        dVar.f13455b[i11] = (dVar3.f13455b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f51990a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
