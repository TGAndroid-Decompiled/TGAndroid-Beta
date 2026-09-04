package x4;

import v7.g8;
public abstract class l extends k {
    public i0.e[] f48853a;
    public String f48854b;
    public int f48855c;

    public l() {
        this.f48853a = null;
        this.f48855c = 0;
    }

    public i0.e[] getPathData() {
        return this.f48853a;
    }

    public String getPathName() {
        return this.f48854b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!g8.a(this.f48853a, eVarArr)) {
            this.f48853a = g8.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f48853a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f11429a = eVarArr[i10].f11429a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f11430b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f11430b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f48853a = null;
        this.f48855c = 0;
        this.f48854b = lVar.f48854b;
        this.f48853a = g8.e(lVar.f48853a);
    }
}
