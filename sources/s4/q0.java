package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f57057a;
    public final String f57058b;
    public boolean f57059c;
    public int d = -1;
    public int f57060e;
    public m0 f57061f;
    public int f57062g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f57057a = str;
        this.f57058b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f57061f = m0Var;
        int i7 = m0Var.f57034e;
        m0Var.f57034e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f57057a);
        bundle.putString("routeGroupId", this.f57058b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f57062g = i7;
        if (this.f57059c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f57062g, i11);
                this.d = -1;
            }
            int i12 = this.f57060e;
            if (i12 != 0) {
                m0Var.d(this.f57062g, i12);
                this.f57060e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f57062g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f57061f;
        if (m0Var != null) {
            int i7 = this.f57062g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f57061f = null;
            this.f57062g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f57068w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f57059c = true;
        m0 m0Var = this.f57061f;
        if (m0Var != null) {
            m0Var.a(this.f57062g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f57061f;
        if (m0Var != null) {
            m0Var.c(this.f57062g, i7);
            return;
        }
        this.d = i7;
        this.f57060e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f57059c = false;
        m0 m0Var = this.f57061f;
        if (m0Var != null) {
            int i10 = this.f57062g;
            Bundle f10 = p5.c.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f57061f;
        if (m0Var != null) {
            m0Var.d(this.f57062g, i7);
        } else {
            this.f57060e += i7;
        }
    }
}
