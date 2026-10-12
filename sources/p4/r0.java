package p4;

import android.os.Bundle;
public final class r0 extends q implements o0 {
    public final String f43094a;
    public final String f43095b;
    public boolean f43096c;
    public int d = -1;
    public int e;
    public n0 f43097f;
    public int f43098g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f43094a = str;
        this.f43095b = str2;
    }

    @Override
    public final void a(n0 n0Var) {
        this.f43097f = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f43094a);
        bundle.putString("routeGroupId", this.f43095b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f43098g = i10;
        if (this.f43096c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.f43098g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                n0Var.d(this.f43098g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43098g;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f43097f;
        if (n0Var != null) {
            int i10 = this.f43098g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f43097f = null;
            this.f43098g = 0;
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
        this.f43096c = true;
        n0 n0Var = this.f43097f;
        if (n0Var != null) {
            n0Var.a(this.f43098g);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f43097f;
        if (n0Var != null) {
            n0Var.c(this.f43098g, i10);
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
        this.f43096c = false;
        n0 n0Var = this.f43097f;
        if (n0Var != null) {
            int i11 = this.f43098g;
            Bundle g10 = org.telegram.ui.Cells.d0.g(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f43097f;
        if (n0Var != null) {
            n0Var.d(this.f43098g, i10);
        } else {
            this.e += i10;
        }
    }
}
