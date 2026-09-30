package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45680a;
    public String f45681b;
    public int f45682c;

    public l() {
        this.f45680a = null;
        this.f45682c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45680a;
    }

    public String getPathName() {
        return this.f45681b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45680a, dVarArr)) {
            this.f45680a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45680a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10594a = dVarArr[i10].f10594a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10595b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10595b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45680a = null;
        this.f45682c = 0;
        this.f45681b = lVar.f45681b;
        this.f45680a = h8.e(lVar.f45680a);
    }
}
