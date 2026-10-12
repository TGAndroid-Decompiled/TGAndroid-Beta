package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class r0 extends q implements o0 {
    public final String f45304a;
    public final String f45305b;
    public boolean f45306c;
    public int d = -1;
    public int f45307e;
    public n0 f45308f;
    public int f45309g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f45304a = str;
        this.f45305b = str2;
    }

    @Override
    public final void a(n0 n0Var) {
        this.f45308f = n0Var;
        int i10 = n0Var.f45282e;
        n0Var.f45282e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f45304a);
        bundle.putString("routeGroupId", this.f45305b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f45309g = i10;
        if (this.f45306c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.f45309g, i12);
                this.d = -1;
            }
            int i13 = this.f45307e;
            if (i13 != 0) {
                n0Var.d(this.f45309g, i13);
                this.f45307e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f45309g;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f45308f;
        if (n0Var != null) {
            int i10 = this.f45309g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f45308f = null;
            this.f45309g = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.h;
        s0Var.v.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f45306c = true;
        n0 n0Var = this.f45308f;
        if (n0Var != null) {
            n0Var.a(this.f45309g);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f45308f;
        if (n0Var != null) {
            n0Var.c(this.f45309g, i10);
            return;
        }
        this.d = i10;
        this.f45307e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f45306c = false;
        n0 n0Var = this.f45308f;
        if (n0Var != null) {
            int i11 = this.f45309g;
            Bundle f7 = c1.f(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, f7);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f45308f;
        if (n0Var != null) {
            n0Var.d(this.f45309g, i10);
        } else {
            this.f45307e += i10;
        }
    }
}
