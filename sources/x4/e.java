package x4;

import android.animation.TypeEvaluator;
import v7.g8;
public final class e implements TypeEvaluator {
    public i0.d[] f49313a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (g8.a(dVarArr, dVarArr2)) {
            if (!g8.a(this.f49313a, dVarArr)) {
                this.f49313a = g8.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f49313a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f11529a = dVar2.f11529a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f11530b;
                    if (i11 < fArr.length) {
                        dVar.f11530b[i11] = (dVar3.f11530b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f49313a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
