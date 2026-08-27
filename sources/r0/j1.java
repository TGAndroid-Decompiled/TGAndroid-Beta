package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;

public class j1 {

    public static final m1 f46609b;

    public final m1 f46610a;

    static {
        c1 z0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            z0Var = new b1();
        } else if (i10 >= 30) {
            z0Var = new a1();
        } else {
            z0Var = i10 >= 29 ? new z0() : new y0();
        }
        f46609b = z0Var.b().f46619a.a().f46619a.b().f46619a.c();
    }

    public j1(m1 m1Var) {
        this.f46610a = m1Var;
    }

    public m1 a() {
        return this.f46610a;
    }

    public m1 b() {
        return this.f46610a;
    }

    public m1 c() {
        return this.f46610a;
    }

    public j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return o() == j1Var.o() && n() == j1Var.n() && Objects.equals(k(), j1Var.k()) && Objects.equals(i(), j1Var.i()) && Objects.equals(e(), j1Var.e());
    }

    public i0.c f(int i10) {
        return i0.c.f10488e;
    }

    public i0.c g(int i10) {
        if ((i10 & 8) == 0) {
            return i0.c.f10488e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public i0.c h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public i0.c i() {
        return i0.c.f10488e;
    }

    public i0.c j() {
        return k();
    }

    public i0.c k() {
        return i0.c.f10488e;
    }

    public i0.c l() {
        return k();
    }

    public m1 m(int i10, int i11, int i12, int i13) {
        return f46609b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(i0.c[] cVarArr) {
    }

    public void r(m1 m1Var) {
    }

    public void s(i0.c cVar) {
    }

    public void t(int i10) {
    }
}
