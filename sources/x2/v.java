package x2;

import b2.s1;
import i2.n1;
import j$.util.Objects;
public final class v {
    public final int f50542a;
    public final n1[] f50543b;
    public final r[] f50544c;
    public final s1 d;
    public final Object f50545e;

    public v(n1[] n1VarArr, r[] rVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (n1VarArr.length == rVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f50543b = n1VarArr;
        this.f50544c = (r[]) rVarArr.clone();
        this.d = s1Var;
        this.f50545e = obj;
        this.f50542a = n1VarArr.length;
    }

    public final boolean a(v vVar, int i10) {
        if (vVar == null || !Objects.equals(this.f50543b[i10], vVar.f50543b[i10]) || !Objects.equals(this.f50544c[i10], vVar.f50544c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f50543b[i10] != null) {
            return true;
        }
        return false;
    }
}
