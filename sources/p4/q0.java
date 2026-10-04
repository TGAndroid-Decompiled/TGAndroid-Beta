package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class q0 extends q implements n0 {
    public final String f44243a;
    public final String f44244b;
    public boolean f44245c;
    public int d = -1;
    public int f44246e;
    public m0 f44247f;
    public int f44248g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f44243a = str;
        this.f44244b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f44247f = m0Var;
        int i10 = m0Var.f44220e;
        m0Var.f44220e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44243a);
        bundle.putString("routeGroupId", this.f44244b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f44248g = i10;
        if (this.f44245c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f44248g, i12);
                this.d = -1;
            }
            int i13 = this.f44246e;
            if (i13 != 0) {
                m0Var.d(this.f44248g, i13);
                this.f44246e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44248g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44247f;
        if (m0Var != null) {
            int i10 = this.f44248g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44247f = null;
            this.f44248g = 0;
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
        this.f44245c = true;
        m0 m0Var = this.f44247f;
        if (m0Var != null) {
            m0Var.a(this.f44248g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44247f;
        if (m0Var != null) {
            m0Var.c(this.f44248g, i10);
            return;
        }
        this.d = i10;
        this.f44246e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44245c = false;
        m0 m0Var = this.f44247f;
        if (m0Var != null) {
            int i11 = this.f44248g;
            Bundle h = c1.h(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44247f;
        if (m0Var != null) {
            m0Var.d(this.f44248g, i10);
        } else {
            this.f44246e += i10;
        }
    }
}
