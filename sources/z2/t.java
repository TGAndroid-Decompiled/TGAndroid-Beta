package z2;

import b8.zb;
import d2.v1;
import j$.util.Objects;
import k2.q1;
public final class t {
    public final int f59646a;
    public final q1[] f59647b;
    public final p[] f59648c;
    public final v1 d;
    public final Object f59649e;

    public t(q1[] q1VarArr, p[] pVarArr, v1 v1Var, Object obj) {
        boolean z10;
        if (q1VarArr.length == pVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.f59647b = q1VarArr;
        this.f59648c = (p[]) pVarArr.clone();
        this.d = v1Var;
        this.f59649e = obj;
        this.f59646a = q1VarArr.length;
    }

    public final boolean a(t tVar, int i3) {
        if (tVar == null || !Objects.equals(this.f59647b[i3], tVar.f59647b[i3]) || !Objects.equals(this.f59648c[i3], tVar.f59648c[i3])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i3) {
        if (this.f59647b[i3] != null) {
            return true;
        }
        return false;
    }
}
