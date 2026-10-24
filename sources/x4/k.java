package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49703a;
    public String f49704b;
    public int f49705c;

    public k() {
        this.f49703a = null;
        this.f49705c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49703a;
    }

    public String getPathName() {
        return this.f49704b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49703a, dVarArr)) {
            this.f49703a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49703a;
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10].f12319a = dVarArr[i10].f12319a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVarArr[i10].f12320b;
                if (i11 < fArr.length) {
                    dVarArr2[i10].f12320b[i11] = fArr[i11];
                    i11++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f49703a = null;
        this.f49705c = 0;
        this.f49704b = kVar.f49704b;
        this.f49703a = x7.e(kVar.f49703a);
    }
}
