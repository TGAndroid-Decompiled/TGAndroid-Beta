package z4;

import b8.rc;
public abstract class k extends j {
    public i0.d[] f59730a;
    public String f59731b;
    public int f59732c;

    public k() {
        this.f59730a = null;
        this.f59732c = 0;
    }

    public i0.d[] getPathData() {
        return this.f59730a;
    }

    public String getPathName() {
        return this.f59731b;
    }

    public void setPathData(i0.d[] dVarArr) {
        if (!rc.a(this.f59730a, dVarArr)) {
            this.f59730a = rc.e(dVarArr);
            return;
        }
        i0.d[] dVarArr2 = this.f59730a;
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            dVarArr2[i3].f14499a = dVarArr[i3].f14499a;
            int i10 = 0;
            while (true) {
                float[] fArr = dVarArr[i3].f14500b;
                if (i10 < fArr.length) {
                    dVarArr2[i3].f14500b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }

    public k(k kVar) {
        this.f59730a = null;
        this.f59732c = 0;
        this.f59731b = kVar.f59731b;
        this.f59730a = rc.e(kVar.f59730a);
    }
}
