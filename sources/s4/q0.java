package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f56442a;
    public final String f56443b;
    public boolean f56444c;
    public int d = -1;
    public int f56445e;
    public m0 f56446f;
    public int f56447g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f56442a = str;
        this.f56443b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f56446f = m0Var;
        int i7 = m0Var.f56419e;
        m0Var.f56419e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f56442a);
        bundle.putString("routeGroupId", this.f56443b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f56447g = i7;
        if (this.f56444c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f56447g, i11);
                this.d = -1;
            }
            int i12 = this.f56445e;
            if (i12 != 0) {
                m0Var.d(this.f56447g, i12);
                this.f56445e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f56447g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f56446f;
        if (m0Var != null) {
            int i7 = this.f56447g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f56446f = null;
            this.f56447g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f56453w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f56444c = true;
        m0 m0Var = this.f56446f;
        if (m0Var != null) {
            m0Var.a(this.f56447g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f56446f;
        if (m0Var != null) {
            m0Var.c(this.f56447g, i7);
            return;
        }
        this.d = i7;
        this.f56445e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f56444c = false;
        m0 m0Var = this.f56446f;
        if (m0Var != null) {
            int i10 = this.f56447g;
            Bundle f10 = r.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f56446f;
        if (m0Var != null) {
            m0Var.d(this.f56447g, i7);
        } else {
            this.f56445e += i7;
        }
    }
}
