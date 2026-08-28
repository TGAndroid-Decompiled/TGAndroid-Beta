package r0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
public class j1 {
    public static final m1 f46919b;
    public final m1 f46920a;

    static {
        c1 y0Var;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            y0Var = new b1();
        } else if (i9 >= 30) {
            y0Var = new a1();
        } else if (i9 >= 29) {
            y0Var = new z0();
        } else {
            y0Var = new y0();
        }
        f46919b = y0Var.b().f46929a.a().f46929a.b().f46929a.c();
    }

    public j1(m1 m1Var) {
        this.f46920a = m1Var;
    }

    public m1 a() {
        return this.f46920a;
    }

    public m1 b() {
        return this.f46920a;
    }

    public m1 c() {
        return this.f46920a;
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
        if (o() == j1Var.o() && n() == j1Var.n() && Objects.equals(k(), j1Var.k()) && Objects.equals(i(), j1Var.i()) && Objects.equals(e(), j1Var.e())) {
            return true;
        }
        return false;
    }

    public i0.b f(int i9) {
        return i0.b.f10847e;
    }

    public i0.b g(int i9) {
        if ((i9 & 8) == 0) {
            return i0.b.f10847e;
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
        return i0.b.f10847e;
    }

    public i0.b j() {
        return k();
    }

    public i0.b k() {
        return i0.b.f10847e;
    }

    public i0.b l() {
        return k();
    }

    public m1 m(int i9, int i10, int i11, int i12) {
        return f46919b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i9) {
        return true;
    }

    public void d(View view) {
    }

    public void q(i0.b[] bVarArr) {
    }

    public void r(m1 m1Var) {
    }

    public void s(i0.b bVar) {
    }

    public void t(int i9) {
    }
}
