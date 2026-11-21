package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class i1 {
    public static final l1 f56289b;
    public final l1 f56290a;

    static {
        a1 w0Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            w0Var = new z0();
        } else if (i7 >= 30) {
            w0Var = new y0();
        } else if (i7 >= 29) {
            w0Var = new x0();
        } else {
            w0Var = new w0();
        }
        f56289b = w0Var.b().f56299a.a().f56299a.b().f56299a.c();
    }

    public i1(l1 l1Var) {
        this.f56290a = l1Var;
    }

    public l1 a() {
        return this.f56290a;
    }

    public l1 b() {
        return this.f56290a;
    }

    public l1 c() {
        return this.f56290a;
    }

    public h e() {
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

    public i0.b f(int i7) {
        return i0.b.f15913e;
    }

    public i0.b g(int i7) {
        if ((i7 & 8) == 0) {
            return i0.b.f15913e;
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
        return i0.b.f15913e;
    }

    public i0.b j() {
        return k();
    }

    public i0.b k() {
        return i0.b.f15913e;
    }

    public i0.b l() {
        return k();
    }

    public l1 m(int i7, int i10, int i11, int i12) {
        return f56289b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i7) {
        return true;
    }

    public void d(View view) {
    }

    public void q(i0.b[] bVarArr) {
    }

    public void r(l1 l1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i7) {
    }
}
