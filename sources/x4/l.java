package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f49343a;
    public String f49344b;
    public int f49345c;

    public l() {
        this.f49343a = null;
        this.f49345c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49343a;
    }

    public String getPathName() {
        return this.f49344b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f49343a, dVarArr)) {
            this.f49343a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49343a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11530a = dVarArr[i10].f11530a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11531b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11531b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f49343a = null;
        this.f49345c = 0;
        this.f49344b = lVar.f49344b;
        this.f49343a = g8.e(lVar.f49343a);
    }
}
