package x4;

import v7.x7;
public abstract class k extends j {
    public i0.e[] f49274a;
    public String f49275b;
    public int f49276c;

    public k() {
        this.f49274a = null;
        this.f49276c = 0;
    }

    public i0.e[] getPathData() {
        return this.f49274a;
    }

    public String getPathName() {
        return this.f49275b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!x7.a(this.f49274a, eVarArr)) {
            this.f49274a = x7.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f49274a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f12288a = eVarArr[i10].f12288a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f12289b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f12289b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49274a = null;
        this.f49276c = 0;
        this.f49275b = kVar.f49275b;
        this.f49274a = x7.e(kVar.f49274a);
    }
}
