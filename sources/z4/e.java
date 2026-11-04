package z4;

import android.animation.TypeEvaluator;
import b8.rc;
public final class e implements TypeEvaluator {
    public i0.d[] f59710a;

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        i0.d[] dVarArr = (i0.d[]) obj;
        i0.d[] dVarArr2 = (i0.d[]) obj2;
        if (rc.a(dVarArr, dVarArr2)) {
            if (!rc.a(this.f59710a, dVarArr)) {
                this.f59710a = rc.e(dVarArr);
            }
            for (int i3 = 0; i3 < dVarArr.length; i3++) {
                i0.d dVar = this.f59710a[i3];
                i0.d dVar2 = dVarArr[i3];
                i0.d dVar3 = dVarArr2[i3];
                dVar.getClass();
                dVar.f14499a = dVar2.f14499a;
                int i10 = 0;
                while (true) {
                    float[] fArr = dVar2.f14500b;
                    if (i10 < fArr.length) {
                        dVar.f14500b[i10] = (dVar3.f14500b[i10] * f10) + ((1.0f - f10) * fArr[i10]);
                        i10++;
                    }
                }
            }
            return this.f59710a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
