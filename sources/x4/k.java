package x4;

import v7.w7;
public abstract class k extends j {
    public i0.e[] f53031a;
    public String f53032b;
    public int f53033c;

    public k() {
        this.f53031a = null;
        this.f53033c = 0;
    }

    public i0.e[] getPathData() {
        return this.f53031a;
    }

    public String getPathName() {
        return this.f53032b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!w7.a(this.f53031a, eVarArr)) {
            this.f53031a = w7.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f53031a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f7769a = eVarArr[i10].f7769a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f7770b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f7770b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f53031a = null;
        this.f53033c = 0;
        this.f53032b = kVar.f53032b;
        this.f53031a = w7.e(kVar.f53031a);
    }
}
