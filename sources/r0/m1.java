package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

public final class m1 {

    public static final m1 f46618b;

    public final j1 f46619a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f46618b = i1.f46603s;
        } else if (i10 >= 30) {
            f46618b = h1.f46593r;
        } else {
            f46618b = j1.f46609b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f46619a = new i1(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f46619a = new h1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f46619a = new g1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f46619a = new f1(this, windowInsets);
        } else {
            this.f46619a = new e1(this, windowInsets);
        }
    }

    public static i0.c e(i0.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f10489a - i10);
        int iMax2 = Math.max(0, cVar.f10490b - i11);
        int iMax3 = Math.max(0, cVar.f10491c - i12);
        int iMax4 = Math.max(0, cVar.d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : i0.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static m1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            m1 m1VarF = j0.f(view);
            j1 j1Var = m1Var.f46619a;
            j1Var.r(m1VarF);
            j1Var.d(view.getRootView());
            j1Var.t(view.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    public final int a() {
        return this.f46619a.k().d;
    }

    public final int b() {
        return this.f46619a.k().f10489a;
    }

    public final int c() {
        return this.f46619a.k().f10491c;
    }

    public final int d() {
        return this.f46619a.k().f10490b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            return Objects.equals(this.f46619a, ((m1) obj).f46619a);
        }
        return false;
    }

    public final m1 f(int i10, int i11, int i12, int i13) {
        c1 z0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            z0Var = new b1(this);
        } else if (i14 >= 30) {
            z0Var = new a1(this);
        } else {
            z0Var = i14 >= 29 ? new z0(this) : new y0(this);
        }
        z0Var.g(i0.c.b(i10, i11, i12, i13));
        return z0Var.b();
    }

    public final WindowInsets g() {
        j1 j1Var = this.f46619a;
        if (j1Var instanceof d1) {
            return ((d1) j1Var).f46579c;
        }
        return null;
    }

    public final int hashCode() {
        j1 j1Var = this.f46619a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public m1() {
        this.f46619a = new j1(this);
    }
}
