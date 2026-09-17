package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.p6;
public final class q0 extends q implements n0 {
    public final String f43922a;
    public final String f43923b;
    public boolean f43924c;
    public int d = -1;
    public int f43925e;
    public m0 f43926f;
    public int f43927g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f43922a = str;
        this.f43923b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f43926f = m0Var;
        int i10 = m0Var.f43899e;
        m0Var.f43899e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f43922a);
        bundle.putString("routeGroupId", this.f43923b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f43927g = i10;
        if (this.f43924c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f43927g, i12);
                this.d = -1;
            }
            int i13 = this.f43925e;
            if (i13 != 0) {
                m0Var.d(this.f43927g, i13);
                this.f43925e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43927g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f43926f;
        if (m0Var != null) {
            int i10 = this.f43927g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f43926f = null;
            this.f43927g = 0;
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
        this.f43924c = true;
        m0 m0Var = this.f43926f;
        if (m0Var != null) {
            m0Var.a(this.f43927g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f43926f;
        if (m0Var != null) {
            m0Var.c(this.f43927g, i10);
            return;
        }
        this.d = i10;
        this.f43925e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f43924c = false;
        m0 m0Var = this.f43926f;
        if (m0Var != null) {
            int i11 = this.f43927g;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f43926f;
        if (m0Var != null) {
            m0Var.d(this.f43927g, i10);
        } else {
            this.f43925e += i10;
        }
    }
}
