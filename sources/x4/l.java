package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45618a;
    public String f45619b;
    public int f45620c;

    public l() {
        this.f45618a = null;
        this.f45620c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45618a;
    }

    public String getPathName() {
        return this.f45619b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45618a, dVarArr)) {
            this.f45618a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45618a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10583a = dVarArr[i10].f10583a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10584b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10584b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45618a = null;
        this.f45620c = 0;
        this.f45619b = lVar.f45619b;
        this.f45618a = h8.e(lVar.f45618a);
    }
}
