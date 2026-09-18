package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45322a;
    public String f45323b;
    public int f45324c;

    public l() {
        this.f45322a = null;
        this.f45324c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45322a;
    }

    public String getPathName() {
        return this.f45323b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45322a, dVarArr)) {
            this.f45322a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45322a;
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
        this.f45322a = null;
        this.f45324c = 0;
        this.f45323b = lVar.f45323b;
        this.f45322a = g8.e(lVar.f45322a);
    }
}
