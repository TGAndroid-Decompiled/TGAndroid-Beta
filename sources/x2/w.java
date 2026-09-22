package x2;

import b2.s1;
import i2.m1;
import j$.util.Objects;
public final class w {
    public final int f45535a;
    public final m1[] f45536b;
    public final s[] f45537c;
    public final s1 d;
    public final Object e;

    public w(m1[] m1VarArr, s[] sVarArr, s1 s1Var, Object obj) {
        boolean z10;
        if (m1VarArr.length == sVarArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        this.f45536b = m1VarArr;
        this.f45537c = (s[]) sVarArr.clone();
        this.d = s1Var;
        this.e = obj;
        this.f45535a = m1VarArr.length;
    }

    public final boolean a(w wVar, int i10) {
        if (wVar == null || !Objects.equals(this.f45536b[i10], wVar.f45536b[i10]) || !Objects.equals(this.f45537c[i10], wVar.f45537c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f45536b[i10] != null) {
            return true;
        }
        return false;
    }
}
