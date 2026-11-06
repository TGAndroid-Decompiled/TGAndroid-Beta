package r0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;
public final class k1 {
    public static final k1 f54083b;
    public final h1 f54084a;

    static {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            f54083b = g1.f54066s;
        } else if (i7 >= 30) {
            f54083b = f1.f54064r;
        } else {
            f54083b = h1.f54071b;
        }
    }

    public k1(WindowInsets windowInsets) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            this.f54084a = new g1(this, windowInsets);
        } else if (i7 >= 30) {
            this.f54084a = new f1(this, windowInsets);
        } else if (i7 >= 29) {
            this.f54084a = new e1(this, windowInsets);
        } else if (i7 >= 28) {
            this.f54084a = new d1(this, windowInsets);
        } else {
            this.f54084a = new c1(this, windowInsets);
        }
    }

    public static i0.b e(i0.b bVar, int i7, int i10, int i11, int i12) {
        int max = Math.max(0, bVar.f15117a - i7);
        int max2 = Math.max(0, bVar.f15118b - i10);
        int max3 = Math.max(0, bVar.f15119c - i11);
        int max4 = Math.max(0, bVar.d - i12);
        if (max == i7 && max2 == i10 && max3 == i11 && max4 == i12) {
            return bVar;
        }
        return i0.b.b(max, max2, max3, max4);
    }

    public static k1 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        k1 k1Var = new k1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = i0.f54073a;
            k1 a10 = b0.a(view);
            h1 h1Var = k1Var.f54084a;
            h1Var.r(a10);
            h1Var.d(view.getRootView());
            h1Var.t(view.getWindowSystemUiVisibility());
        }
        return k1Var;
    }

    public final int a() {
        return this.f54084a.k().d;
    }

    public final int b() {
        return this.f54084a.k().f15117a;
    }

    public final int c() {
        return this.f54084a.k().f15119c;
    }

    public final int d() {
        return this.f54084a.k().f15118b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        return Objects.equals(this.f54084a, ((k1) obj).f54084a);
    }

    public final k1 f(int i7, int i10, int i11, int i12) {
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
        h1 h1Var = this.f54084a;
        if (h1Var instanceof b1) {
            return ((b1) h1Var).f54051c;
        }
        return null;
    }

    public final int hashCode() {
        h1 h1Var = this.f54084a;
        if (h1Var == null) {
            return 0;
        }
        return h1Var.hashCode();
    }

    public k1() {
        this.f54084a = new h1(this);
    }
}
