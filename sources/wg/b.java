package wg;

import android.graphics.Color;
import org.telegram.messenger.i0;
import org.telegram.messenger.tc;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public class b implements a {
    public final p6 f52857a;
    public final int f52858b;
    public final float f52859c;
    public int d;
    public int e;
    public int f52860f;
    public int h;
    public int f52861n;
    public int f52862r;

    public b(int i10, p6 p6Var) {
        this(p6Var, i10, tc.e(262144) ? 0.85f : 0.76f);
    }

    @Override
    public int E() {
        a();
        if (b() && Color.alpha(t6.w0(this.f52861n, this.f52857a)) != 0) {
            return 0;
        }
        return this.h;
    }

    @Override
    public final float N() {
        if (b()) {
            return i0.N(1.0f);
        }
        return -1.0f;
    }

    @Override
    public final float X() {
        if (b()) {
            return i0.N(2.25f);
        }
        return -1.0f;
    }

    public final void a() {
        if (this.f52862r != a7.f20159b) {
            d();
        }
    }

    public final boolean b() {
        if (this.f52861n >= 0 && t6.i1(this.f52857a)) {
            return true;
        }
        return false;
    }

    @Override
    public final float b0() {
        return i0.N(0.6f);
    }

    public boolean c() {
        if (i0.B(t6.w0(this.f52858b, this.f52857a)) < 0.721f) {
            return true;
        }
        return false;
    }

    public final void d() {
        this.f52862r = a7.f20159b;
        this.d = t6.r1(this.f52859c, t6.w0(this.f52858b, this.f52857a));
        if (c()) {
            this.f52860f = 687865855;
            this.h = 352321535;
            this.e = 0;
            return;
        }
        this.f52860f = -1;
        this.h = -1;
        this.e = 536870912;
    }

    @Override
    public final int h0() {
        if (b()) {
            return t6.w0(t6.f21316ya, this.f52857a);
        }
        return 0;
    }

    @Override
    public int j0() {
        a();
        if (b()) {
            return t6.w0(t6.f21300xa, this.f52857a);
        }
        return this.e;
    }

    @Override
    public int n0() {
        a();
        return this.d;
    }

    @Override
    public int u() {
        a();
        if (b() && Color.alpha(t6.w0(this.f52861n, this.f52857a)) != 0) {
            return 0;
        }
        return this.f52860f;
    }

    @Override
    public final int w() {
        if (b()) {
            return t6.w0(this.f52861n, this.f52857a);
        }
        return 0;
    }

    public b(p6 p6Var, int i10, float f7) {
        this.f52861n = -1;
        this.f52862r = a7.f20159b;
        this.f52857a = p6Var;
        this.f52858b = i10;
        this.f52859c = f7;
        d();
    }
}
