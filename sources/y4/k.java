package y4;

import a8.rc;
public abstract class k extends j {
    public i0.d[] f52008a;
    public String f52009b;
    public int f52010c;

    public k() {
        this.f52008a = null;
        this.f52010c = 0;
    }

    public i0.d[] getPathData() {
        return this.f52008a;
    }

    public String getPathName() {
        return this.f52009b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!rc.a(this.f52008a, dVarArr)) {
            this.f52008a = rc.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f52008a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f13454a = dVarArr[i10].f13454a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f13455b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f13455b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f52008a = null;
        this.f52010c = 0;
        this.f52009b = kVar.f52009b;
        this.f52008a = rc.e(kVar.f52008a);
    }
}
