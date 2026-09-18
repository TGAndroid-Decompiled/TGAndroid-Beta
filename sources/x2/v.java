package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;
public final class v {
    public final int f45246a;
    public final m1[] f45247b;
    public final r[] f45248c;
    public final s1 d;
    public final Object e;

    public v(m1[] m1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (m1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45247b = m1VarArr;
        this.f45248c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.f45246a = m1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f45247b[i10], vVar.f45247b[i10]) || !Objects.equals(this.f45248c[i10], vVar.f45248c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f45247b[i10] != null) {
            return true;
        }
        return false;
    }
}
