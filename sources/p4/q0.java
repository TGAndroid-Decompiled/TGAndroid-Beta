package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.b1;
public final class q0 extends q implements n0 {
    public final String f44601a;
    public final String f44602b;
    public boolean f44603c;
    public int d = -1;
    public int e;
    public m0 f44604f;
    public int f44605g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f44601a = str;
        this.f44602b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f44604f = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44601a);
        bundle.putString("routeGroupId", this.f44602b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f44605g = i10;
        if (this.f44603c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f44605g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                m0Var.d(this.f44605g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44605g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44604f;
        if (m0Var != null) {
            int i10 = this.f44605g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44604f = null;
            this.f44605g = 0;
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
        this.f44603c = true;
        m0 m0Var = this.f44604f;
        if (m0Var != null) {
            m0Var.a(this.f44605g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44604f;
        if (m0Var != null) {
            m0Var.c(this.f44605g, i10);
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
        this.f44603c = false;
        m0 m0Var = this.f44604f;
        if (m0Var != null) {
            int i11 = this.f44605g;
            Bundle i12 = b1.i(i10, "unselectReason");
            int i13 = m0Var.d;
            m0Var.d = i13 + 1;
            m0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44604f;
        if (m0Var != null) {
            m0Var.d(this.f44605g, i10);
        } else {
            this.e += i10;
        }
    }
}
