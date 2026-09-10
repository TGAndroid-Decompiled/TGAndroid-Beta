package x4;

import android.animation.TypeEvaluator;
import v7.j8;
public final class e implements TypeEvaluator {
    public i0.e[] f44615a;

    @Override
    public final Object evaluate(float f7, Object obj, Object obj2) {
        i0.e[] eVarArr = (i0.e[]) obj;
        i0.e[] eVarArr2 = (i0.e[]) obj2;
        if (j8.a(eVarArr, eVarArr2)) {
            if (!j8.a(this.f44615a, eVarArr)) {
                this.f44615a = j8.e(eVarArr);
            }
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                i0.e eVar = this.f44615a[i10];
                i0.e eVar2 = eVarArr[i10];
                i0.e eVar3 = eVarArr2[i10];
                eVar.getClass();
                eVar.f10078a = eVar2.f10078a;
                int i11 = 0;
                while (true) {
                    float[] fArr = eVar2.f10079b;
                    if (i11 < fArr.length) {
                        eVar.f10079b[i11] = (eVar3.f10079b[i11] * f7) + ((1.0f - f7) * fArr[i11]);
                        i11++;
                    }
                }
            }
            return this.f44615a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
