package wg;

import i2.v;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public class d implements a {
    public final p6 f52845a;
    public c f52846b;
    public c f52847c;
    public c d;
    public c e;
    public float f52848f;
    public float h;
    public float f52849n;
    public float f52850r;

    public d(p6 p6Var) {
        this.f52845a = p6Var;
        float N = i0.N(1.0f);
        float N2 = i0.N(0.33333334f);
        this.f52849n = N;
        this.f52850r = N2;
        float N3 = i0.N(1.0f);
        float N4 = i0.N(0.6666667f);
        this.f52848f = N3;
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
        p6 p6Var = this.f52845a;
        if ((p6Var instanceof th.b) || (p6Var == null ? t6.I.q() : p6Var.a())) {
            z10 = true;
        }
        return cVar.g(p6Var, z10);
    }

    public float b() {
        return this.f52850r;
    }

    @Override
    public float b0() {
        return 0.0f;
    }

    public float c() {
        return this.f52849n;
    }

    public final void d(int i10, int i11) {
        this.f52846b = new v(i11, i10, 5);
    }

    public final void e(int i10, int i11) {
        this.d = new v(i11, i10, 5);
    }

    public final void f(int i10, int i11) {
        this.f52847c = new v(i11, i10, 5);
    }

    @Override
    public int h0() {
        return 0;
    }

    @Override
    public int j0() {
        return a(this.f52846b);
    }

    @Override
    public final int n0() {
        return a(this.e);
    }

    @Override
    public int u() {
        return a(this.f52847c);
    }

    @Override
    public int w() {
        return 0;
    }
}
