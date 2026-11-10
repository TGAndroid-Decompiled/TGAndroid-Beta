package s4;

import android.os.Bundle;
public final class q0 extends q implements n0 {
    public final String f54888a;
    public final String f54889b;
    public boolean f54890c;
    public int d = -1;
    public int f54891e;
    public m0 f54892f;
    public int f54893g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f54888a = str;
        this.f54889b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f54892f = m0Var;
        int i7 = m0Var.f54865e;
        m0Var.f54865e = i7 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f54888a);
        bundle.putString("routeGroupId", this.f54889b);
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        m0Var.b(3, i10, i7, null, bundle);
        this.f54893g = i7;
        if (this.f54890c) {
            m0Var.a(i7);
            int i11 = this.d;
            if (i11 >= 0) {
                m0Var.c(this.f54893g, i11);
                this.d = -1;
            }
            int i12 = this.f54891e;
            if (i12 != 0) {
                m0Var.d(this.f54893g, i12);
                this.f54891e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f54893g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f54892f;
        if (m0Var != null) {
            int i7 = this.f54893g;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f54892f = null;
            this.f54893g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.f54899w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f54890c = true;
        m0 m0Var = this.f54892f;
        if (m0Var != null) {
            m0Var.a(this.f54893g);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f54892f;
        if (m0Var != null) {
            m0Var.c(this.f54893g, i7);
            return;
        }
        this.d = i7;
        this.f54891e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f54890c = false;
        m0 m0Var = this.f54892f;
        if (m0Var != null) {
            int i10 = this.f54893g;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f54892f;
        if (m0Var != null) {
            m0Var.d(this.f54893g, i7);
        } else {
            this.f54891e += i7;
        }
    }
}
