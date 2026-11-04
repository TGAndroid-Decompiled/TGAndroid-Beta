package r4;

import android.os.Bundle;
import org.telegram.ui.Cells.f1;
public final class r0 extends q implements o0 {
    public final String f54349a;
    public final String f54350b;
    public boolean f54351c;
    public int d = -1;
    public int f54352e;
    public n0 f54353f;
    public int f54354g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f54349a = str;
        this.f54350b = str2;
    }

    @Override
    public final int a() {
        return this.f54354g;
    }

    @Override
    public final void b(n0 n0Var) {
        this.f54353f = n0Var;
        int i3 = n0Var.f54325e;
        n0Var.f54325e = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f54349a);
        bundle.putString("routeGroupId", this.f54350b);
        int i10 = n0Var.d;
        n0Var.d = i10 + 1;
        n0Var.b(3, i10, i3, null, bundle);
        this.f54354g = i3;
        if (this.f54351c) {
            n0Var.a(i3);
            int i11 = this.d;
            if (i11 >= 0) {
                n0Var.c(this.f54354g, i11);
                this.d = -1;
            }
            int i12 = this.f54352e;
            if (i12 != 0) {
                n0Var.d(this.f54354g, i12);
                this.f54352e = 0;
            }
        }
    }

    @Override
    public final void c() {
        n0 n0Var = this.f54353f;
        if (n0Var != null) {
            int i3 = this.f54354g;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(4, i10, i3, null, null);
            this.f54353f = null;
            this.f54354g = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.h;
        s0Var.f54357w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f54351c = true;
        n0 n0Var = this.f54353f;
        if (n0Var != null) {
            n0Var.a(this.f54354g);
        }
    }

    @Override
    public final void f(int i3) {
        n0 n0Var = this.f54353f;
        if (n0Var != null) {
            n0Var.c(this.f54354g, i3);
            return;
        }
        this.d = i3;
        this.f54352e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i3) {
        this.f54351c = false;
        n0 n0Var = this.f54353f;
        if (n0Var != null) {
            int i10 = this.f54354g;
            Bundle k10 = f1.k(i3, "unselectReason");
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(6, i11, i10, null, k10);
        }
    }

    @Override
    public final void i(int i3) {
        n0 n0Var = this.f54353f;
        if (n0Var != null) {
            n0Var.d(this.f54354g, i3);
        } else {
            this.f54352e += i3;
        }
    }
}
