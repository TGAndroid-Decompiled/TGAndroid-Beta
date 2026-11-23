package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f57061a;
    public final String f57062b;
    public boolean f57063c;
    public int d = -1;
    public int f57064e;
    public m0 f57065f;
    public int f57066g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f57061a = str;
        this.f57062b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f57065f = m0Var;
        int i7 = m0Var.f57038e;
        m0Var.f57038e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f57061a);
        bundle.putString("routeGroupId", this.f57062b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f57066g = i7;
        if (this.f57063c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f57066g, i11);
                this.d = -1;
            }
            int i12 = this.f57064e;
            if (i12 != 0) {
                m0Var.d(this.f57066g, i12);
                this.f57064e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f57066g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f57065f;
        if (m0Var != null) {
            int i7 = this.f57066g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f57065f = null;
            this.f57066g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f57072w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f57063c = true;
        m0 m0Var = this.f57065f;
        if (m0Var != null) {
            m0Var.a(this.f57066g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f57065f;
        if (m0Var != null) {
            m0Var.c(this.f57066g, i7);
            return;
        }
        this.d = i7;
        this.f57064e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f57063c = false;
        m0 m0Var = this.f57065f;
        if (m0Var != null) {
            int i10 = this.f57066g;
            Bundle f10 = p5.c.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f57065f;
        if (m0Var != null) {
            m0Var.d(this.f57066g, i7);
        } else {
            this.f57064e += i7;
        }
    }
}
