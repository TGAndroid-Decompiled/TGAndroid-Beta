package x4;

import v7.x7;
public abstract class k extends j {
    public i0.d[] f49704a;
    public String f49705b;
    public int f49706c;

    public k() {
        this.f49704a = null;
        this.f49706c = 0;
    }

    public i0.d[] getPathData() {
        return this.f49704a;
    }

    public String getPathName() {
        return this.f49705b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!x7.a(this.f49704a, dVarArr)) {
            this.f49704a = x7.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f49704a;
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
        this.f49704a = null;
        this.f49706c = 0;
        this.f49705b = kVar.f49705b;
        this.f49704a = x7.e(kVar.f49704a);
    }
}
