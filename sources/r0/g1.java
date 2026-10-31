package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class g1 {
    public static final j1 f46120b;
    public final j1 f46121a;

    static {
        z0 v0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            v0Var = new y0();
        } else if (i10 >= 30) {
            v0Var = new x0();
        } else if (i10 >= 29) {
            v0Var = new w0();
        } else {
            v0Var = new v0();
        }
        f46120b = v0Var.b().f46132a.a().f46132a.b().f46132a.c();
    }

    public g1(j1 j1Var) {
        this.f46121a = j1Var;
    }

    public j1 a() {
        return this.f46121a;
    }

    public j1 b() {
        return this.f46121a;
    }

    public j1 c() {
        return this.f46121a;
    }

    public h e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (o() == g1Var.o() && n() == g1Var.n() && Objects.equals(k(), g1Var.k()) && Objects.equals(i(), g1Var.i()) && Objects.equals(e(), g1Var.e())) {
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

    public j1 m(int i10, int i11, int i12, int i13) {
        return f46120b;
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

    public void r(j1 j1Var) {
    }

    public void s(i0.c cVar) {
    }

    public void t(int i10) {
    }
}
