package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class q0 extends q implements n0 {
    public final String f45416a;
    public final String f45417b;
    public boolean f45418c;
    public int d = -1;
    public int f45419e;
    public m0 f45420f;
    public int f45421g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f45416a = str;
        this.f45417b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f45420f = m0Var;
        int i10 = m0Var.f45393e;
        m0Var.f45393e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f45416a);
        bundle.putString("routeGroupId", this.f45417b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f45421g = i10;
        if (this.f45418c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f45421g, i12);
                this.d = -1;
            }
            int i13 = this.f45419e;
            if (i13 != 0) {
                m0Var.d(this.f45421g, i13);
                this.f45419e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f45421g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f45420f;
        if (m0Var != null) {
            int i10 = this.f45421g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f45420f = null;
            this.f45421g = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.h;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f45418c = true;
        m0 m0Var = this.f45420f;
        if (m0Var != null) {
            m0Var.a(this.f45421g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f45420f;
        if (m0Var != null) {
            m0Var.c(this.f45421g, i10);
            return;
        }
        this.d = i10;
        this.f45419e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f45418c = false;
        m0 m0Var = this.f45420f;
        if (m0Var != null) {
            int i11 = this.f45421g;
            Bundle f7 = c1.f(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, f7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f45420f;
        if (m0Var != null) {
            m0Var.d(this.f45421g, i10);
        } else {
            this.f45419e += i10;
        }
    }
}
