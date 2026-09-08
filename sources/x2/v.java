package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;
public final class v {
    public final int f48798a;
    public final m1[] f48799b;
    public final r[] f48800c;
    public final s1 d;
    public final Object f48801e;

    public v(m1[] m1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (m1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f48799b = m1VarArr;
        this.f48800c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f48801e = obj;
        this.f48798a = m1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f48799b[i10], vVar.f48799b[i10]) || !Objects.equals(this.f48800c[i10], vVar.f48800c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f48799b[i10] != null) {
            return true;
        }
        return false;
    }
}
