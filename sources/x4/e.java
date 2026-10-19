package x4;

import android.animation.TypeEvaluator;
import v7.x7;
public final class e implements TypeEvaluator {
    public i0.d[] f49235a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (x7.a(dVarArr, dVarArr2)) {
            if (!x7.a(this.f49235a, dVarArr)) {
                this.f49235a = x7.e(dVarArr);
            }
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                i0.d dVar = this.f49235a[i10];
                i0.d dVar2 = dVarArr[i10];
                i0.d dVar3 = dVarArr2[i10];
                dVar.getClass();
                dVar.f12287a = dVar2.f12287a;
                int i11 = 0;
                while (true) {
                    float[] fArr = dVar2.f12288b;
                    if (i11 < fArr.length) {
                        dVar.f12288b[i11] = (dVar3.f12288b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f49235a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
