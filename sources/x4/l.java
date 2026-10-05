package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f49350a;
    public String f49351b;
    public int f49352c;

    public l() {
        this.f49350a = null;
        this.f49352c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49350a;
    }

    public String getPathName() {
        return this.f49351b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f49350a, dVarArr)) {
            this.f49350a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49350a;
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
        this.f49350a = null;
        this.f49352c = 0;
        this.f49351b = lVar.f49351b;
        this.f49350a = g8.e(lVar.f49350a);
    }
}
