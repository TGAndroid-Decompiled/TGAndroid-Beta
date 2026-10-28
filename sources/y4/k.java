package y4;

import a8.rc;
public abstract class k extends j {
    public i0.d[] f52069a;
    public String f52070b;
    public int f52071c;

    public k() {
        this.f52069a = null;
        this.f52071c = 0;
    }

    public i0.d[] getPathData() {
        return this.f52069a;
    }

    public String getPathName() {
        return this.f52070b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!rc.a(this.f52069a, dVarArr)) {
            this.f52069a = rc.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f52069a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f13453a = dVarArr[i10].f13453a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f13454b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f13454b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f52069a = null;
        this.f52071c = 0;
        this.f52070b = kVar.f52070b;
        this.f52069a = rc.e(kVar.f52069a);
    }
}
