package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class q0 extends q implements n0 {
    public final String f44236a;
    public final String f44237b;
    public boolean f44238c;
    public int d = -1;
    public int f44239e;
    public m0 f44240f;
    public int f44241g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f44236a = str;
        this.f44237b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f44240f = m0Var;
        int i10 = m0Var.f44213e;
        m0Var.f44213e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44236a);
        bundle.putString("routeGroupId", this.f44237b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f44241g = i10;
        if (this.f44238c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f44241g, i12);
                this.d = -1;
            }
            int i13 = this.f44239e;
            if (i13 != 0) {
                m0Var.d(this.f44241g, i13);
                this.f44239e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44241g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44240f;
        if (m0Var != null) {
            int i10 = this.f44241g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44240f = null;
            this.f44241g = 0;
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
        this.f44238c = true;
        m0 m0Var = this.f44240f;
        if (m0Var != null) {
            m0Var.a(this.f44241g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44240f;
        if (m0Var != null) {
            m0Var.c(this.f44241g, i10);
            return;
        }
        this.d = i10;
        this.f44239e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44238c = false;
        m0 m0Var = this.f44240f;
        if (m0Var != null) {
            int i11 = this.f44241g;
            Bundle h = c1.h(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44240f;
        if (m0Var != null) {
            m0Var.d(this.f44241g, i10);
        } else {
            this.f44239e += i10;
        }
    }
}
