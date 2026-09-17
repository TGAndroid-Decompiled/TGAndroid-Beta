package x4;

import v7.g8;
public abstract class l extends k {
    public i0.d[] f45317a;
    public String f45318b;
    public int f45319c;

    public l() {
        this.f45317a = null;
        this.f45319c = 0;
    }

    public i0.d[] getPathData() {
        return this.f45317a;
    }

    public String getPathName() {
        return this.f45318b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!g8.a(this.f45317a, dVarArr)) {
            this.f45317a = g8.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f45317a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f10595a = dVarArr[i10].f10595a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f10596b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f10596b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public l(l lVar) {
        this.f45317a = null;
        this.f45319c = 0;
        this.f45318b = lVar.f45318b;
        this.f45317a = g8.e(lVar.f45317a);
    }
}
