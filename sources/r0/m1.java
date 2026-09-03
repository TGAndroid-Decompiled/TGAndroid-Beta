package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
public final class m1 {
    public static final m1 f43153b;
    public final j1 f43154a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f43153b = i1.f43140s;
        } else if (i10 >= 30) {
            f43153b = h1.f43131r;
        } else {
            f43153b = j1.f43145b;
        }
    }

    public m1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f43154a = new i1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f43154a = new h1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f43154a = new g1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f43154a = new f1(this, windowInsets);
        } else {
            this.f43154a = new e1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f7196a - i10);
        int max2 = Math.max(0, bVar.f7197b - i11);
        int max3 = Math.max(0, bVar.f7198c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static m1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        m1 m1Var = new m1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            m1 f10 = j0.f(view);
            j1 j1Var = m1Var.f43154a;
            j1Var.r(f10);
            j1Var.d(view.getRootView());
            j1Var.t(view.getWindowSystemUiVisibility());
        }
        return m1Var;
    }

    public final int a() {
        return this.f43154a.k().d;
    }

    public final int b() {
        return this.f43154a.k().f7196a;
    }

    public final int c() {
        return this.f43154a.k().f7198c;
    }

    public final int d() {
        return this.f43154a.k().f7197b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        return Objects.equals(this.f43154a, ((m1) obj).f43154a);
    }

    public final m1 f(int i10, int i11, int i12, int i13) {
        c1 y0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            y0Var = new b1(this);
        } else if (i14 >= 30) {
            y0Var = new a1(this);
        } else if (i14 >= 29) {
            y0Var = new z0(this);
        } else {
            y0Var = new y0(this);
        }
        y0Var.g(i0.b.b(i10, i11, i12, i13));
        return y0Var.b();
    }

    public final WindowInsets g() {
        j1 j1Var = this.f43154a;
        if (j1Var instanceof d1) {
            return ((d1) j1Var).f43119c;
        }
        return null;
    }

    public final int hashCode() {
        j1 j1Var = this.f43154a;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.hashCode();
    }

    public m1() {
        this.f43154a = new j1(this);
    }
}
