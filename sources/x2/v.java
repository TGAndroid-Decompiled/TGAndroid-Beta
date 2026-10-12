package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;
public final class v {
    public final int f50773a;
    public final n1[] f50774b;
    public final r[] f50775c;
    public final s1 d;
    public final Object f50776e;

    public v(n1[] n1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (n1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f50774b = n1VarArr;
        this.f50775c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f50776e = obj;
        this.f50773a = n1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f50774b[i10], vVar.f50774b[i10]) || !Objects.equals(this.f50775c[i10], vVar.f50775c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f50774b[i10] != null) {
            return true;
        }
        return false;
    }
}
