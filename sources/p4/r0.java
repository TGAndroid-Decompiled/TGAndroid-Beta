package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.f1;
public final class r0 extends q implements o0 {
    public final String f44808a;
    public final String f44809b;
    public boolean f44810c;
    public int d = -1;
    public int e;
    public n0 f44811f;
    public int f44812g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f44808a = str;
        this.f44809b = str2;
    }

    @Override
    public final void a(n0 n0Var) {
        this.f44811f = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44808a);
        bundle.putString("routeGroupId", this.f44809b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f44812g = i10;
        if (this.f44810c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.f44812g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                n0Var.d(this.f44812g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44812g;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f44811f;
        if (n0Var != null) {
            int i10 = this.f44812g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f44811f = null;
            this.f44812g = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.h;
        s0Var.f44818w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f44810c = true;
        n0 n0Var = this.f44811f;
        if (n0Var != null) {
            n0Var.a(this.f44812g);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f44811f;
        if (n0Var != null) {
            n0Var.c(this.f44812g, i10);
            return;
        }
        this.d = i10;
        this.e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44810c = false;
        n0 n0Var = this.f44811f;
        if (n0Var != null) {
            int i11 = this.f44812g;
            Bundle i12 = f1.i(i10, "unselectReason");
            int i13 = n0Var.d;
            n0Var.d = i13 + 1;
            n0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f44811f;
        if (n0Var != null) {
            n0Var.d(this.f44812g, i10);
        } else {
            this.e += i10;
        }
    }
}
