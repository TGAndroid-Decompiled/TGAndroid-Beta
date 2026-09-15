package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45294a;
    public String f45295b;
    public int f45296c;

    public l() {
        this.f45294a = null;
        this.f45296c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45294a;
    }

    public String getPathName() {
        return this.f45295b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45294a, dVarArr)) {
            this.f45294a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45294a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10592a = dVarArr[i10].f10592a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10593b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10593b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45294a = null;
        this.f45296c = 0;
        this.f45295b = lVar.f45295b;
        this.f45294a = g8.e(lVar.f45294a);
    }
}
