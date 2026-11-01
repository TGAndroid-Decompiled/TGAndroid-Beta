package wg;

import i2.v;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public class d implements a {
    public final p6 f52863a;
    public c f52864b;
    public c f52865c;
    public c d;
    public c e;
    public float f52866f;
    public float h;
    public float f52867n;
    public float f52868r;

    public d(p6 p6Var) {
        this.f52863a = p6Var;
        float N = i0.N(1.0f);
        float N2 = i0.N(0.33333334f);
        this.f52867n = N;
        this.f52868r = N2;
        float N3 = i0.N(1.0f);
        float N4 = i0.N(0.6666667f);
        this.f52866f = N3;
        this.h = N4;
    }

    @Override
    public int E() {
        return a(this.d);
    }

    @Override
    public final float N() {
        return -1.0f;
    }

    @Override
    public final float X() {
        return -1.0f;
    }

    public final int a(c cVar) {
        boolean z10 = false;
        if (cVar == null) {
            return 0;
        }
        p6 p6Var = this.f52863a;
        if ((p6Var instanceof th.b) || (p6Var == null ? t6.I.q() : p6Var.a())) {
            z10 = true;
        }
        return cVar.g(p6Var, z10);
    }

    public float b() {
        return this.f52868r;
    }

    @Override
    public float b0() {
        return 0.0f;
    }

    public float c() {
        return this.f52867n;
    }

    public final void d(int i10, int i11) {
        this.f52864b = new v(i11, i10, 5);
    }

    public final void e(int i10, int i11) {
        this.d = new v(i11, i10, 5);
    }

    public final void f(int i10, int i11) {
        this.f52865c = new v(i11, i10, 5);
    }

    @Override
    public int h0() {
        return 0;
    }

    @Override
    public int j0() {
        return a(this.f52864b);
    }

    @Override
    public final int n0() {
        return a(this.e);
    }

    @Override
    public int u() {
        return a(this.f52865c);
    }

    @Override
    public int w() {
        return 0;
    }
}
