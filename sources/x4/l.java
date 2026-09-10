package x4;

import v7.j8;
public abstract class l extends k {
    public i0.e[] f44634a;
    public String f44635b;
    public int f44636c;

    public l() {
        this.f44634a = null;
        this.f44636c = 0;
    }

    public i0.e[] getPathData() {
        return this.f44634a;
    }

    public String getPathName() {
        return this.f44635b;
    }

    public void setPathData(i0.e[] eVarArr) {
        if (!j8.a(this.f44634a, eVarArr)) {
            this.f44634a = j8.e(eVarArr);
            return;
        }
        i0.e[] eVarArr2 = this.f44634a;
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            eVarArr2[i10].f10078a = eVarArr[i10].f10078a;
            int i11 = 0;
            while (true) {
                float[] fArr = eVarArr[i10].f10079b;
                if (i11 < fArr.length) {
                    eVarArr2[i10].f10079b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f44634a = null;
        this.f44636c = 0;
        this.f44635b = lVar.f44635b;
        this.f44634a = j8.e(lVar.f44634a);
    }
}
