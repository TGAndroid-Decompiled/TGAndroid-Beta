package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45572a;
    public String f45573b;
    public int f45574c;

    public l() {
        this.f45572a = null;
        this.f45574c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45572a;
    }

    public String getPathName() {
        return this.f45573b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45572a, dVarArr)) {
            this.f45572a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45572a;
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
        this.f45572a = null;
        this.f45574c = 0;
        this.f45573b = lVar.f45573b;
        this.f45572a = h8.e(lVar.f45572a);
    }
}
