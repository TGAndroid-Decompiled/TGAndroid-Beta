package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class k1 {
    public static final k1 f54025b;
    public final h1 f54026a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            f54025b = g1.f54008s;
        } else if (i3 >= 30) {
            f54025b = f1.f54006r;
        } else {
            f54025b = h1.f54013b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            this.f54026a = new g1(this, windowInsets);
        } else if (i3 >= 30) {
            this.f54026a = new f1(this, windowInsets);
        } else if (i3 >= 29) {
            this.f54026a = new e1(this, windowInsets);
        } else if (i3 >= 28) {
            this.f54026a = new d1(this, windowInsets);
        } else {
            this.f54026a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i3, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f14495a - i3);
        int max2 = Math.max(0, bVar.f14496b - i10);
        int max3 = Math.max(0, bVar.f14497c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        if (max == i3 && max2 == i10 && max3 == i11 && max4 == i12) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static k1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k1 k1Var = new k1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f54015a;
            k1 a10 = b0.a(view);
            h1 h1Var = k1Var.f54026a;
            h1Var.r(a10);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final int a() {
        return this.f54026a.k().d;
    }

    public final int b() {
        return this.f54026a.k().f14495a;
    }

    public final int c() {
        return this.f54026a.k().f14497c;
    }

    public final int d() {
        return this.f54026a.k().f14496b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return Objects.equals(this.f54026a, ((k1) obj).f54026a);
    }

    public final k1 f(int i3, int i10, int i11, int i12) {
        a1 w0Var;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            w0Var = new z0(this);
        } else if (i13 >= 30) {
            w0Var = new y0(this);
        } else if (i13 >= 29) {
            w0Var = new x0(this);
        } else {
            w0Var = new w0(this);
        }
        w0Var.g(i0.b.b(i3, i10, i11, i12));
        return w0Var.b();
    }

    public final WindowInsets g() {
        h1 h1Var = this.f54026a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).f53993c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.f54026a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.f54026a = new h1(this);
    }
}
