package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
public final class l1 {
    public static final l1 f44710b;
    public final i1 f44711a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f44710b = h1.f44695s;
        } else if (i10 >= 30) {
            f44710b = g1.f44685r;
        } else {
            f44710b = i1.f44701b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f44711a = new h1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f44711a = new g1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f44711a = new f1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f44711a = new e1(this, windowInsets);
        } else {
            this.f44711a = new d1(this, windowInsets);
        }
    }

    public static i0.c e(i0.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f11425a - i10);
        int max2 = Math.max(0, cVar.f11426b - i11);
        int max3 = Math.max(0, cVar.f11427c - i12);
        int max4 = Math.max(0, cVar.d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return cVar;
        }
        return i0.c.b(max, max2, max3, max4);
    }

    public static l1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            l1 f7 = i0.f(view);
            i1 i1Var = l1Var.f44711a;
            i1Var.r(f7);
            i1Var.d(view.getRootView());
            i1Var.t(view.getWindowSystemUiVisibility());
        }
        return l1Var;
    }

    public final int a() {
        return this.f44711a.k().d;
    }

    public final int b() {
        return this.f44711a.k().f11425a;
    }

    public final int c() {
        return this.f44711a.k().f11427c;
    }

    public final int d() {
        return this.f44711a.k().f11426b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        return Objects.equals(this.f44711a, ((l1) obj).f44711a);
    }

    public final l1 f(int i10, int i11, int i12, int i13) {
        b1 x0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            x0Var = new a1(this);
        } else if (i14 >= 30) {
            x0Var = new z0(this);
        } else if (i14 >= 29) {
            x0Var = new y0(this);
        } else {
            x0Var = new x0(this);
        }
        x0Var.g(i0.c.b(i10, i11, i12, i13));
        return x0Var.b();
    }

    public final WindowInsets g() {
        i1 i1Var = this.f44711a;
        if (i1Var instanceof c1) {
            return ((c1) i1Var).f44671c;
        }
        return null;
    }

    public final int hashCode() {
        i1 i1Var = this.f44711a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public l1() {
        this.f44711a = new i1(this);
    }
}
