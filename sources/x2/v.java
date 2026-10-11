package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;
public final class v {
    public final int f50666a;
    public final n1[] f50667b;
    public final r[] f50668c;
    public final s1 d;
    public final Object f50669e;

    public v(n1[] n1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (n1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f50667b = n1VarArr;
        this.f50668c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f50669e = obj;
        this.f50666a = n1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f50667b[i10], vVar.f50667b[i10]) || !Objects.equals(this.f50668c[i10], vVar.f50668c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f50667b[i10] != null) {
            return true;
        }
        return false;
    }
}
