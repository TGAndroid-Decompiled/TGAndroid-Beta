package x4;

import v7.c8;
public abstract class k extends j {
    public i0.d[] f50625a;
    public String f50626b;
    public int f50627c;

    public k() {
        this.f50625a = null;
        this.f50627c = 0;
    }

    public i0.d[] getPathData() {
        return this.f50625a;
    }

    public String getPathName() {
        return this.f50626b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!c8.a(this.f50625a, dVarArr)) {
            this.f50625a = c8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f50625a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11580a = dVarArr[i10].f11580a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11581b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11581b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f50625a = null;
        this.f50627c = 0;
        this.f50626b = kVar.f50626b;
        this.f50625a = c8.e(kVar.f50625a);
    }
}
