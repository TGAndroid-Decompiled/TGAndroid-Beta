package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50856a;
    public String f50857b;
    public int f50858c;

    public k() {
        this.f50856a = null;
        this.f50858c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50856a;
    }

    public String getPathName() {
        return this.f50857b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50856a, dVarArr)) {
            this.f50856a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50856a;
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
        this.f50856a = null;
        this.f50858c = 0;
        this.f50857b = kVar.f50857b;
        this.f50856a = c8.e(kVar.f50856a);
    }
}
