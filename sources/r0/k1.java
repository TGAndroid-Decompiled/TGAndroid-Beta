package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class k1 {
    public static final k1 f44834b;
    public final h1 f44835a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f44834b = g1.f44814s;
        } else if (i10 >= 30) {
            f44834b = f1.f44812r;
        } else {
            f44834b = h1.f44823b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f44835a = new g1(this, windowInsets);
        } else if (i10 >= 30) {
            this.f44835a = new f1(this, windowInsets);
        } else if (i10 >= 29) {
            this.f44835a = new e1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f44835a = new d1(this, windowInsets);
        } else {
            this.f44835a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f12283a - i10);
        int max2 = Math.max(0, bVar.f12284b - i11);
        int max3 = Math.max(0, bVar.f12285c - i12);
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
            WeakHashMap weakHashMap = i0.f44826a;
            k1 a2 = b0.a(view);
            h1 h1Var = k1Var.f44835a;
            h1Var.r(a2);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final int a() {
        return this.f44835a.k().d;
    }

    public final int b() {
        return this.f44835a.k().f12283a;
    }

    public final int c() {
        return this.f44835a.k().f12285c;
    }

    public final int d() {
        return this.f44835a.k().f12284b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return Objects.equals(this.f44835a, ((k1) obj).f44835a);
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
        h1 h1Var = this.f44835a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).f44801c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.f44835a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.f44835a = new h1(this);
    }
}
