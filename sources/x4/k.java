package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50671a;
    public String f50672b;
    public int f50673c;

    public k() {
        this.f50671a = null;
        this.f50673c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50671a;
    }

    public String getPathName() {
        return this.f50672b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50671a, dVarArr)) {
            this.f50671a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50671a;
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
        this.f50671a = null;
        this.f50673c = 0;
        this.f50672b = kVar.f50672b;
        this.f50671a = c8.e(kVar.f50671a);
    }
}
