package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class k1 {
    public static final k1 f46866b;
    public final h1 f46867a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f46866b = g1.f46843s;
        } else if (i10 >= 30) {
            f46866b = f1.f46841r;
        } else {
            f46866b = h1.f46853b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f46867a = new g1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f46867a = new f1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f46867a = new e1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f46867a = new d1(this, windowInsets);
        } else {
            this.f46867a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f11575a - i10);
        int max2 = Math.max(0, bVar.f11576b - i11);
        int max3 = Math.max(0, bVar.f11577c - i12);
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
            WeakHashMap weakHashMap = i0.f46856a;
            k1 a2 = b0.a(view);
            h1 h1Var = k1Var.f46867a;
            h1Var.r(a2);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final int a() {
        return this.f46867a.k().d;
    }

    public final int b() {
        return this.f46867a.k().f11575a;
    }

    public final int c() {
        return this.f46867a.k().f11577c;
    }

    public final int d() {
        return this.f46867a.k().f11576b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return Objects.equals(this.f46867a, ((k1) obj).f46867a);
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
        h1 h1Var = this.f46867a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).f46828c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.f46867a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.f46867a = new h1(this);
    }
}
