package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class l1 {
    public static final l1 f56380b;
    public final i1 f56381a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f56380b = h1.f56366s;
        } else if (i7 >= 30) {
            f56380b = g1.f56361r;
        } else {
            f56380b = i1.f56371b;
        }
    }

    public l1(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f56381a = new h1(this, windowInsets);
        } else if (i7 >= 30) {
            this.f56381a = new g1(this, windowInsets);
        } else if (i7 >= 29) {
            this.f56381a = new e1(this, windowInsets);
        } else if (i7 >= 28) {
            this.f56381a = new d1(this, windowInsets);
        } else {
            this.f56381a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f15978a - i7);
        int max2 = Math.max(0, bVar.f15979b - i10);
        int max3 = Math.max(0, bVar.f15980c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        if (max == i7 && max2 == i10 && max3 == i11 && max4 == i12) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static l1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l1 l1Var = new l1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f56367a;
            l1 a10 = b0.a(view);
            i1 i1Var = l1Var.f56381a;
            i1Var.r(a10);
            i1Var.d(view.getRootView());
            i1Var.t(view.getWindowSystemUiVisibility());
        }
        return l1Var;
    }

    public final int a() {
        return this.f56381a.k().d;
    }

    public final int b() {
        return this.f56381a.k().f15978a;
    }

    public final int c() {
        return this.f56381a.k().f15980c;
    }

    public final int d() {
        return this.f56381a.k().f15979b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        return Objects.equals(this.f56381a, ((l1) obj).f56381a);
    }

    public final l1 f(int i7, int i10, int i11, int i12) {
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
        w0Var.g(i0.b.b(i7, i10, i11, i12));
        return w0Var.b();
    }

    public final WindowInsets g() {
        i1 i1Var = this.f56381a;
        if (i1Var instanceof b1) {
            return ((b1) i1Var).f56346c;
        }
        return null;
    }

    public final int hashCode() {
        i1 i1Var = this.f56381a;
        if (i1Var == null) {
            return 0;
        }
        return i1Var.hashCode();
    }

    public l1() {
        this.f56381a = new i1(this);
    }
}
