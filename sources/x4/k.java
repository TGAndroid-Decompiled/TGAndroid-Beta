package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49299a;
    public String f49300b;
    public int f49301c;

    public k() {
        this.f49299a = null;
        this.f49301c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49299a;
    }

    public String getPathName() {
        return this.f49300b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49299a, dVarArr)) {
            this.f49299a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49299a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f12290a = dVarArr[i10].f12290a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f12291b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f12291b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49299a = null;
        this.f49301c = 0;
        this.f49300b = kVar.f49300b;
        this.f49299a = x7.e(kVar.f49299a);
    }
}
