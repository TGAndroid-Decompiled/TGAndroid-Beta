package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class l1 {
    public static final l1 f43496b;
    public final i1 f43497a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f43496b = h1.f43483s;
        } else if (i10 >= 30) {
            f43496b = g1.f43474r;
        } else {
            f43496b = i1.f43488b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f43497a = new h1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f43497a = new g1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f43497a = new f1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f43497a = new e1(this, windowInsets);
        } else {
            this.f43497a = new d1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f10892a - i10);
        int max2 = Math.max(0, bVar.f10893b - i11);
        int max3 = Math.max(0, bVar.f10894c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static l1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f43485a;
            l1 a2 = b0.a(view);
            i1 i1Var = l1Var.f43497a;
            i1Var.r(a2);
            i1Var.d(view.getRootView());
            i1Var.t(view.getWindowSystemUiVisibility());
        }
        return l1Var;
    }

    public final int a() {
        return this.f43497a.k().d;
    }

    public final int b() {
        return this.f43497a.k().f10892a;
    }

    public final int c() {
        return this.f43497a.k().f10894c;
    }

    public final int d() {
        return this.f43497a.k().f10893b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        return Objects.equals(this.f43497a, ((l1) obj).f43497a);
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
        x0Var.g(i0.b.b(i10, i11, i12, i13));
        return x0Var.b();
    }

    public final WindowInsets g() {
        i1 i1Var = this.f43497a;
        if (i1Var instanceof c1) {
            return ((c1) i1Var).f43462c;
        }
        return null;
    }

    public final int hashCode() {
        i1 i1Var = this.f43497a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public l1() {
        this.f43497a = new i1(this);
    }
}
