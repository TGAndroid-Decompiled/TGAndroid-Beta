package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45573a;
    public String f45574b;
    public int f45575c;

    public l() {
        this.f45573a = null;
        this.f45575c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45573a;
    }

    public String getPathName() {
        return this.f45574b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45573a, dVarArr)) {
            this.f45573a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45573a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10580a = dVarArr[i10].f10580a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10581b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10581b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45573a = null;
        this.f45575c = 0;
        this.f45574b = lVar.f45574b;
        this.f45573a = h8.e(lVar.f45573a);
    }
}
