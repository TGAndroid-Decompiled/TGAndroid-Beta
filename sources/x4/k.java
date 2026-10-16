package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f47865a;
    public String f47866b;
    public int f47867c;

    public k() {
        this.f47865a = null;
        this.f47867c = 0;
    }

    public i0.d[] getPathData() {
        return this.f47865a;
    }

    public String getPathName() {
        return this.f47866b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f47865a, dVarArr)) {
            this.f47865a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f47865a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10896a = dVarArr[i10].f10896a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10897b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10897b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f47865a = null;
        this.f47867c = 0;
        this.f47866b = kVar.f47866b;
        this.f47865a = x7.e(kVar.f47865a);
    }
}
