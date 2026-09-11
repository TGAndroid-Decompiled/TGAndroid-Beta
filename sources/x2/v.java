package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;
public final class v {
    public final int f48769a;
    public final m1[] f48770b;
    public final r[] f48771c;
    public final s1 d;
    public final Object f48772e;

    public v(m1[] m1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (m1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f48770b = m1VarArr;
        this.f48771c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f48772e = obj;
        this.f48769a = m1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f48770b[i10], vVar.f48770b[i10]) || !Objects.equals(this.f48771c[i10], vVar.f48771c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f48770b[i10] != null) {
            return true;
        }
        return false;
    }
}
