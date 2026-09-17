package x4;

import v7.g8;
public abstract class l extends k {
    public i0.e[] f48883a;
    public String f48884b;
    public int f48885c;

    public l() {
        this.f48883a = null;
        this.f48885c = 0;
    }

    public i0.e[] getPathData() {
        return this.f48883a;
    }

    public String getPathName() {
        return this.f48884b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!g8.a(this.f48883a, eVarArr)) {
            this.f48883a = g8.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f48883a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f11455a = eVarArr[i10].f11455a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f11456b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f11456b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f48883a = null;
        this.f48885c = 0;
        this.f48884b = lVar.f48884b;
        this.f48883a = g8.e(lVar.f48883a);
    }
}
