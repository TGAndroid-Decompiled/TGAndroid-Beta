package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f47866a;
    public String f47867b;
    public int f47868c;

    public k() {
        this.f47866a = null;
        this.f47868c = 0;
    }

    public i0.d[] getPathData() {
        return this.f47866a;
    }

    public String getPathName() {
        return this.f47867b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f47866a, dVarArr)) {
            this.f47866a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f47866a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10892a = dVarArr[i10].f10892a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10893b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10893b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f47866a = null;
        this.f47868c = 0;
        this.f47867b = kVar.f47867b;
        this.f47866a = x7.e(kVar.f47866a);
    }
}
