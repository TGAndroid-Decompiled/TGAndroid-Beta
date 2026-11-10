package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class h1 {
    public static final k1 f54200b;
    public final k1 f54201a;

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
        f54200b = w0Var.b().f54213a.a().f54213a.b().f54213a.c();
    }

    public h1(k1 k1Var) {
        this.f54201a = k1Var;
    }

    public k1 a() {
        return this.f54201a;
    }

    public k1 b() {
        return this.f54201a;
    }

    public k1 c() {
        return this.f54201a;
    }

    public h e() {
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

    public i0.b f(int i7) {
        return i0.b.f15121e;
    }

    public i0.b g(int i7) {
        if ((i7 & 8) == 0) {
            return i0.b.f15121e;
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
        return i0.b.f15121e;
    }

    public i0.b j() {
        return k();
    }

    public i0.b k() {
        return i0.b.f15121e;
    }

    public i0.b l() {
        return k();
    }

    public k1 m(int i7, int i10, int i11, int i12) {
        return f54200b;
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

    public void r(k1 k1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i7) {
    }
}
