package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50627a;
    public String f50628b;
    public int f50629c;

    public k() {
        this.f50627a = null;
        this.f50629c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50627a;
    }

    public String getPathName() {
        return this.f50628b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50627a, dVarArr)) {
            this.f50627a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50627a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11580a = dVarArr[i10].f11580a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11581b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11581b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f50627a = null;
        this.f50629c = 0;
        this.f50628b = kVar.f50628b;
        this.f50627a = c8.e(kVar.f50627a);
    }
}
