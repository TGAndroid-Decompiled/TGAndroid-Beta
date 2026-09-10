package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class i1 {
    public static final l1 f41065b;
    public final l1 f41066a;

    static {
        b1 x0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            x0Var = new a1();
        } else if (i10 >= 30) {
            x0Var = new z0();
        } else if (i10 >= 29) {
            x0Var = new y0();
        } else {
            x0Var = new x0();
        }
        f41065b = x0Var.b().f41074a.a().f41074a.b().f41074a.c();
    }

    public i1(l1 l1Var) {
        this.f41066a = l1Var;
    }

    public l1 a() {
        return this.f41066a;
    }

    public l1 b() {
        return this.f41066a;
    }

    public l1 c() {
        return this.f41066a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (o() == i1Var.o() && n() == i1Var.n() && Objects.equals(k(), i1Var.k()) && Objects.equals(i(), i1Var.i()) && Objects.equals(e(), i1Var.e())) {
            return true;
        }
        return false;
    }

    public i0.c f(int i10) {
        return i0.c.e;
    }

    public i0.c g(int i10) {
        if ((i10 & 8) == 0) {
            return i0.c.e;
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
        return i0.c.e;
    }

    public i0.c j() {
        return k();
    }

    public i0.c k() {
        return i0.c.e;
    }

    public i0.c l() {
        return k();
    }

    public l1 m(int i10, int i11, int i12, int i13) {
        return f41065b;
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

    public void r(l1 l1Var) {
    }

    public void s(i0.c cVar) {
    }

    public void t(int i10) {
    }
}
