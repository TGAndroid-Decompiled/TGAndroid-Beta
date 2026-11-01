package x4;

import v7.w7;
public abstract class k extends j {
    public i0.e[] f53049a;
    public String f53050b;
    public int f53051c;

    public k() {
        this.f53049a = null;
        this.f53051c = 0;
    }

    public i0.e[] getPathData() {
        return this.f53049a;
    }

    public String getPathName() {
        return this.f53050b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!w7.a(this.f53049a, eVarArr)) {
            this.f53049a = w7.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f53049a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f7770a = eVarArr[i10].f7770a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f7771b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f7771b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f53049a = null;
        this.f53051c = 0;
        this.f53050b = kVar.f53050b;
        this.f53049a = w7.e(kVar.f53049a);
    }
}
