package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class r0 extends q implements o0 {
    public final String f45309a;
    public final String f45310b;
    public boolean f45311c;
    public int d = -1;
    public int f45312e;
    public n0 f45313f;
    public int f45314g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f45309a = str;
        this.f45310b = str2;
    }

    @Override
    public final void a(n0 n0Var) {
        this.f45313f = n0Var;
        int i10 = n0Var.f45287e;
        n0Var.f45287e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f45309a);
        bundle.putString("routeGroupId", this.f45310b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f45314g = i10;
        if (this.f45311c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.f45314g, i12);
                this.d = -1;
            }
            int i13 = this.f45312e;
            if (i13 != 0) {
                n0Var.d(this.f45314g, i13);
                this.f45312e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f45314g;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f45313f;
        if (n0Var != null) {
            int i10 = this.f45314g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f45313f = null;
            this.f45314g = 0;
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
        this.f45311c = true;
        n0 n0Var = this.f45313f;
        if (n0Var != null) {
            n0Var.a(this.f45314g);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f45313f;
        if (n0Var != null) {
            n0Var.c(this.f45314g, i10);
            return;
        }
        this.d = i10;
        this.f45312e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f45311c = false;
        n0 n0Var = this.f45313f;
        if (n0Var != null) {
            int i11 = this.f45314g;
            Bundle f7 = c1.f(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, f7);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f45313f;
        if (n0Var != null) {
            n0Var.d(this.f45314g, i10);
        } else {
            this.f45312e += i10;
        }
    }
}
