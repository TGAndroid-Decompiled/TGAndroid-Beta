package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49258a;
    public String f49259b;
    public int f49260c;

    public k() {
        this.f49258a = null;
        this.f49260c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49258a;
    }

    public String getPathName() {
        return this.f49259b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49258a, dVarArr)) {
            this.f49258a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49258a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f12287a = dVarArr[i10].f12287a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f12288b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f12288b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49258a = null;
        this.f49260c = 0;
        this.f49259b = kVar.f49259b;
        this.f49258a = x7.e(kVar.f49258a);
    }
}
