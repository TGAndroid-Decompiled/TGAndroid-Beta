package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50715a;
    public String f50716b;
    public int f50717c;

    public k() {
        this.f50715a = null;
        this.f50717c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50715a;
    }

    public String getPathName() {
        return this.f50716b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50715a, dVarArr)) {
            this.f50715a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50715a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11579a = dVarArr[i10].f11579a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11580b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11580b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f50715a = null;
        this.f50717c = 0;
        this.f50716b = kVar.f50716b;
        this.f50715a = c8.e(kVar.f50715a);
    }
}
