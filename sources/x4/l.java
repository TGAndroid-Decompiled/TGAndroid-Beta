package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45244a;
    public String f45245b;
    public int f45246c;

    public l() {
        this.f45244a = null;
        this.f45246c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45244a;
    }

    public String getPathName() {
        return this.f45245b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45244a, dVarArr)) {
            this.f45244a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45244a;
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
        this.f45244a = null;
        this.f45246c = 0;
        this.f45245b = lVar.f45245b;
        this.f45244a = g8.e(lVar.f45244a);
    }
}
