package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49251a;
    public String f49252b;
    public int f49253c;

    public k() {
        this.f49251a = null;
        this.f49253c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49251a;
    }

    public String getPathName() {
        return this.f49252b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49251a, dVarArr)) {
            this.f49251a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49251a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f12289a = dVarArr[i10].f12289a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f12290b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f12290b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49251a = null;
        this.f49253c = 0;
        this.f49252b = kVar.f49252b;
        this.f49251a = x7.e(kVar.f49251a);
    }
}
