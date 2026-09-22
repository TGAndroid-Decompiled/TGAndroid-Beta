package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45290a;
    public String f45291b;
    public int f45292c;

    public l() {
        this.f45290a = null;
        this.f45292c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45290a;
    }

    public String getPathName() {
        return this.f45291b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45290a, dVarArr)) {
            this.f45290a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45290a;
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
        this.f45290a = null;
        this.f45292c = 0;
        this.f45291b = lVar.f45291b;
        this.f45290a = g8.e(lVar.f45290a);
    }
}
