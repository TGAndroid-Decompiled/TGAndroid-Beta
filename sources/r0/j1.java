package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class j1 {
    public static final j1 f46131b;
    public final g1 f46132a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f46131b = f1.f46115s;
        } else if (i10 >= 30) {
            f46131b = e1.f46114r;
        } else {
            f46131b = g1.f46120b;
        }
    }

    public j1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f46132a = new f1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f46132a = new e1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f46132a = new d1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f46132a = new c1(this, windowInsets);
        } else {
            this.f46132a = new b1(this, windowInsets);
        }
    }

    public static i0.c e(i0.c cVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, cVar.f7765a - i10);
        int max2 = Math.max(0, cVar.f7766b - i11);
        int max3 = Math.max(0, cVar.f7767c - i12);
        int max4 = Math.max(0, cVar.d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return cVar;
        }
        return i0.c.b(max, max2, max3, max4);
    }

    public static j1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        j1 j1Var = new j1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = h0.f46123a;
            j1 a2 = a0.a(view);
            g1 g1Var = j1Var.f46132a;
            g1Var.r(a2);
            g1Var.d(view.getRootView());
            g1Var.t(view.getWindowSystemUiVisibility());
        }
        return j1Var;
    }

    public final int a() {
        return this.f46132a.k().d;
    }

    public final int b() {
        return this.f46132a.k().f7765a;
    }

    public final int c() {
        return this.f46132a.k().f7767c;
    }

    public final int d() {
        return this.f46132a.k().f7766b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        return Objects.equals(this.f46132a, ((j1) obj).f46132a);
    }

    public final j1 f(int i10, int i11, int i12, int i13) {
        z0 v0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            v0Var = new y0(this);
        } else if (i14 >= 30) {
            v0Var = new x0(this);
        } else if (i14 >= 29) {
            v0Var = new w0(this);
        } else {
            v0Var = new v0(this);
        }
        v0Var.g(i0.c.b(i10, i11, i12, i13));
        return v0Var.b();
    }

    public final WindowInsets g() {
        g1 g1Var = this.f46132a;
        if (g1Var instanceof a1) {
            return ((a1) g1Var).f46100c;
        }
        return null;
    }

    public final int hashCode() {
        g1 g1Var = this.f46132a;
        if (g1Var == null) {
            return 0;
        }
        return g1Var.hashCode();
    }

    public j1() {
        this.f46132a = new g1(this);
    }
}
