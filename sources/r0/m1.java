package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
public final class m1 {
    public static final m1 f46928b;
    public final j1 f46929a;

    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            f46928b = i1.f46913s;
        } else if (i9 >= 30) {
            f46928b = h1.f46903r;
        } else {
            f46928b = j1.f46919b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            this.f46929a = new i1(this, windowInsets);
        } else if (i9 >= 30) {
            this.f46929a = new h1(this, windowInsets);
        } else if (i9 >= 29) {
            this.f46929a = new g1(this, windowInsets);
        } else if (i9 >= 28) {
            this.f46929a = new f1(this, windowInsets);
        } else {
            this.f46929a = new e1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f10848a - i9);
        int max2 = Math.max(0, bVar.f10849b - i10);
        int max3 = Math.max(0, bVar.f10850c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        if (max == i9 && max2 == i10 && max3 == i11 && max4 == i12) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static m1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            m1 f10 = j0.f(view);
            j1 j1Var = m1Var.f46929a;
            j1Var.r(f10);
            j1Var.d(view.getRootView());
            j1Var.t(view.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    public final int a() {
        return this.f46929a.k().d;
    }

    public final int b() {
        return this.f46929a.k().f10848a;
    }

    public final int c() {
        return this.f46929a.k().f10850c;
    }

    public final int d() {
        return this.f46929a.k().f10849b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        return Objects.equals(this.f46929a, ((m1) obj).f46929a);
    }

    public final m1 f(int i9, int i10, int i11, int i12) {
        c1 y0Var;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            y0Var = new b1(this);
        } else if (i13 >= 30) {
            y0Var = new a1(this);
        } else if (i13 >= 29) {
            y0Var = new z0(this);
        } else {
            y0Var = new y0(this);
        }
        y0Var.g(i0.b.b(i9, i10, i11, i12));
        return y0Var.b();
    }

    public final WindowInsets g() {
        j1 j1Var = this.f46929a;
        if (j1Var instanceof d1) {
            return ((d1) j1Var).f46889c;
        }
        return null;
    }

    public final int hashCode() {
        j1 j1Var = this.f46929a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public m1() {
        this.f46929a = new j1(this);
    }
}
