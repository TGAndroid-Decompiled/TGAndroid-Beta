package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class h1 {
    public static final k1 f46761b;
    public final k1 f46762a;

    static {
        a1 w0Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            w0Var = new z0();
        } else if (i10 >= 30) {
            w0Var = new y0();
        } else if (i10 >= 29) {
            w0Var = new x0();
        } else {
            w0Var = new w0();
        }
        f46761b = w0Var.b().f46775a.a().f46775a.b().f46775a.c();
    }

    public h1(k1 k1Var) {
        this.f46762a = k1Var;
    }

    public k1 a() {
        return this.f46762a;
    }

    public k1 b() {
        return this.f46762a;
    }

    public k1 c() {
        return this.f46762a;
    }

    public i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        if (o() == h1Var.o() && n() == h1Var.n() && Objects.equals(k(), h1Var.k()) && Objects.equals(i(), h1Var.i()) && Objects.equals(e(), h1Var.e())) {
            return true;
        }
        return false;
    }

    public i0.b f(int i10) {
        return i0.b.f11575e;
    }

    public i0.b g(int i10) {
        if ((i10 & 8) == 0) {
            return i0.b.f11575e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public i0.b h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public i0.b i() {
        return i0.b.f11575e;
    }

    public i0.b j() {
        return k();
    }

    public i0.b k() {
        return i0.b.f11575e;
    }

    public i0.b l() {
        return k();
    }

    public k1 m(int i10, int i11, int i12, int i13) {
        return f46761b;
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

    public void q(i0.b[] bVarArr) {
    }

    public void r(k1 k1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i10) {
    }
}
