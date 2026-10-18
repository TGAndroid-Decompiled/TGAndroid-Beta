package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49252a;
    public String f49253b;
    public int f49254c;

    public k() {
        this.f49252a = null;
        this.f49254c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49252a;
    }

    public String getPathName() {
        return this.f49253b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49252a, dVarArr)) {
            this.f49252a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49252a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f12288a = dVarArr[i10].f12288a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f12289b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f12289b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49252a = null;
        this.f49254c = 0;
        this.f49253b = kVar.f49253b;
        this.f49252a = x7.e(kVar.f49252a);
    }
}
