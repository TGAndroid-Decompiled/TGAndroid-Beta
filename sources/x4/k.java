package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50864a;
    public String f50865b;
    public int f50866c;

    public k() {
        this.f50864a = null;
        this.f50866c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50864a;
    }

    public String getPathName() {
        return this.f50865b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50864a, dVarArr)) {
            this.f50864a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50864a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11578a = dVarArr[i10].f11578a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11579b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11579b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f50864a = null;
        this.f50866c = 0;
        this.f50865b = kVar.f50865b;
        this.f50864a = c8.e(kVar.f50864a);
    }
}
