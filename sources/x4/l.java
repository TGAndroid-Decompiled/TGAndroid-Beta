package x4;

import v7.h8;
public abstract class l extends k {
    public i0.d[] f45590a;
    public String f45591b;
    public int f45592c;

    public l() {
        this.f45590a = null;
        this.f45592c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45590a;
    }

    public String getPathName() {
        return this.f45591b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!h8.a(this.f45590a, dVarArr)) {
            this.f45590a = h8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45590a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10596a = dVarArr[i10].f10596a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10597b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10597b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45590a = null;
        this.f45592c = 0;
        this.f45591b = lVar.f45591b;
        this.f45590a = h8.e(lVar.f45590a);
    }
}
