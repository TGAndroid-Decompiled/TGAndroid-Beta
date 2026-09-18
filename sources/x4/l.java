package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45545a;
    public String f45546b;
    public int f45547c;

    public l() {
        this.f45545a = null;
        this.f45547c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45545a;
    }

    public String getPathName() {
        return this.f45546b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45545a, dVarArr)) {
            this.f45545a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45545a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10595a = dVarArr[i10].f10595a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10596b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10596b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45545a = null;
        this.f45547c = 0;
        this.f45546b = lVar.f45546b;
        this.f45545a = g8.e(lVar.f45545a);
    }
}
