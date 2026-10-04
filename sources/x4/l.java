package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f49334a;
    public String f49335b;
    public int f49336c;

    public l() {
        this.f49334a = null;
        this.f49336c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49334a;
    }

    public String getPathName() {
        return this.f49335b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f49334a, dVarArr)) {
            this.f49334a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49334a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11529a = dVarArr[i10].f11529a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11530b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11530b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f49334a = null;
        this.f49336c = 0;
        this.f49335b = lVar.f49335b;
        this.f49334a = g8.e(lVar.f49334a);
    }
}
