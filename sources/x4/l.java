package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45574a;
    public String f45575b;
    public int f45576c;

    public l() {
        this.f45574a = null;
        this.f45576c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45574a;
    }

    public String getPathName() {
        return this.f45575b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45574a, dVarArr)) {
            this.f45574a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45574a;
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
        this.f45574a = null;
        this.f45576c = 0;
        this.f45575b = lVar.f45575b;
        this.f45574a = h8.e(lVar.f45574a);
    }
}
