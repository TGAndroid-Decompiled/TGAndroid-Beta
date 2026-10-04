package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f49335a;
    public String f49336b;
    public int f49337c;

    public l() {
        this.f49335a = null;
        this.f49337c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49335a;
    }

    public String getPathName() {
        return this.f49336b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f49335a, dVarArr)) {
            this.f49335a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49335a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f11529a = dVarArr[i10].f11529a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f11530b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f11530b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f49335a = null;
        this.f49337c = 0;
        this.f49336b = lVar.f49336b;
        this.f49335a = g8.e(lVar.f49335a);
    }
}
