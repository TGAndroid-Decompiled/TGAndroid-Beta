package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f54784a;
    public final String f54785b;
    public boolean f54786c;
    public int d = -1;
    public int f54787e;
    public m0 f54788f;
    public int f54789g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f54784a = str;
        this.f54785b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f54788f = m0Var;
        int i7 = m0Var.f54761e;
        m0Var.f54761e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f54784a);
        bundle.putString("routeGroupId", this.f54785b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f54789g = i7;
        if (this.f54786c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f54789g, i11);
                this.d = -1;
            }
            int i12 = this.f54787e;
            if (i12 != 0) {
                m0Var.d(this.f54789g, i12);
                this.f54787e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f54789g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f54788f;
        if (m0Var != null) {
            int i7 = this.f54789g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f54788f = null;
            this.f54789g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f54795w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f54786c = true;
        m0 m0Var = this.f54788f;
        if (m0Var != null) {
            m0Var.a(this.f54789g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f54788f;
        if (m0Var != null) {
            m0Var.c(this.f54789g, i7);
            return;
        }
        this.d = i7;
        this.f54787e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f54786c = false;
        m0 m0Var = this.f54788f;
        if (m0Var != null) {
            int i10 = this.f54789g;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f54788f;
        if (m0Var != null) {
            m0Var.d(this.f54789g, i7);
        } else {
            this.f54787e += i7;
        }
    }
}
