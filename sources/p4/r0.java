package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.f1;
public final class r0 extends q implements o0 {
    public final String f44797a;
    public final String f44798b;
    public boolean f44799c;
    public int d = -1;
    public int e;
    public n0 f44800f;
    public int f44801g;
    public final s0 h;

    public r0(s0 s0Var, String str, String str2) {
        this.h = s0Var;
        this.f44797a = str;
        this.f44798b = str2;
    }

    @Override
    public final void a(n0 n0Var) {
        this.f44800f = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44797a);
        bundle.putString("routeGroupId", this.f44798b);
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        n0Var.b(3, i11, i10, null, bundle);
        this.f44801g = i10;
        if (this.f44799c) {
            n0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                n0Var.c(this.f44801g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                n0Var.d(this.f44801g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44801g;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f44800f;
        if (n0Var != null) {
            int i10 = this.f44801g;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f44800f = null;
            this.f44801g = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.h;
        s0Var.f44807w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f44799c = true;
        n0 n0Var = this.f44800f;
        if (n0Var != null) {
            n0Var.a(this.f44801g);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f44800f;
        if (n0Var != null) {
            n0Var.c(this.f44801g, i10);
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
        this.f44799c = false;
        n0 n0Var = this.f44800f;
        if (n0Var != null) {
            int i11 = this.f44801g;
            Bundle i12 = f1.i(i10, "unselectReason");
            int i13 = n0Var.d;
            n0Var.d = i13 + 1;
            n0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f44800f;
        if (n0Var != null) {
            n0Var.d(this.f44801g, i10);
        } else {
            this.e += i10;
        }
    }
}
