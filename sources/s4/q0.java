package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f54877a;
    public final String f54878b;
    public boolean f54879c;
    public int d = -1;
    public int f54880e;
    public m0 f54881f;
    public int f54882g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f54877a = str;
        this.f54878b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f54881f = m0Var;
        int i7 = m0Var.f54854e;
        m0Var.f54854e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f54877a);
        bundle.putString("routeGroupId", this.f54878b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f54882g = i7;
        if (this.f54879c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f54882g, i11);
                this.d = -1;
            }
            int i12 = this.f54880e;
            if (i12 != 0) {
                m0Var.d(this.f54882g, i12);
                this.f54880e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f54882g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f54881f;
        if (m0Var != null) {
            int i7 = this.f54882g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f54881f = null;
            this.f54882g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f54888w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f54879c = true;
        m0 m0Var = this.f54881f;
        if (m0Var != null) {
            m0Var.a(this.f54882g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f54881f;
        if (m0Var != null) {
            m0Var.c(this.f54882g, i7);
            return;
        }
        this.d = i7;
        this.f54880e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f54879c = false;
        m0 m0Var = this.f54881f;
        if (m0Var != null) {
            int i10 = this.f54882g;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f54881f;
        if (m0Var != null) {
            m0Var.d(this.f54882g, i7);
        } else {
            this.f54880e += i7;
        }
    }
}
