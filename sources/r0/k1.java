package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class k1 {
    public static final k1 f47152b;
    public final h1 f47153a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f47152b = g1.f47131s;
        } else if (i10 >= 30) {
            f47152b = f1.f47129r;
        } else {
            f47152b = h1.f47140b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f47153a = new g1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f47153a = new f1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f47153a = new e1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f47153a = new d1(this, windowInsets);
        } else {
            this.f47153a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f13449a - i10);
        int max2 = Math.max(0, bVar.f13450b - i11);
        int max3 = Math.max(0, bVar.f13451c - i12);
        int max4 = Math.max(0, bVar.d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static k1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k1 k1Var = new k1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f47143a;
            k1 a2 = b0.a(view);
            h1 h1Var = k1Var.f47153a;
            h1Var.r(a2);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final int a() {
        return this.f47153a.k().d;
    }

    public final int b() {
        return this.f47153a.k().f13449a;
    }

    public final int c() {
        return this.f47153a.k().f13451c;
    }

    public final int d() {
        return this.f47153a.k().f13450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return Objects.equals(this.f47153a, ((k1) obj).f47153a);
    }

    public final k1 f(int i10, int i11, int i12, int i13) {
        a1 w0Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 34) {
            w0Var = new z0(this);
        } else if (i14 >= 30) {
            w0Var = new y0(this);
        } else if (i14 >= 29) {
            w0Var = new x0(this);
        } else {
            w0Var = new w0(this);
        }
        w0Var.g(i0.b.b(i10, i11, i12, i13));
        return w0Var.b();
    }

    public final WindowInsets g() {
        h1 h1Var = this.f47153a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).f47118c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.f47153a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.f47153a = new h1(this);
    }
}
