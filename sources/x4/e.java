package x4;

import android.animation.TypeEvaluator;
import v7.w7;
public final class e implements TypeEvaluator {
    public i0.e[] f53031a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (w7.a(eVarArr, eVarArr2)) {
            if (!w7.a(this.f53031a, eVarArr)) {
                this.f53031a = w7.e(eVarArr);
            }
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                i0.e eVar = this.f53031a[i10];
                i0.e eVar2 = eVarArr[i10];
                i0.e eVar3 = eVarArr2[i10];
                eVar.getClass();
                eVar.f7770a = eVar2.f7770a;
                int i11 = 0;
                while (true) {
                    float[] fArr = eVar2.f7771b;
                    if (i11 < fArr.length) {
                        eVar.f7771b[i11] = (eVar3.f7771b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f53031a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
