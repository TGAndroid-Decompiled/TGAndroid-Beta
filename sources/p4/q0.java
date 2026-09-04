package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.p6;
public final class q0 extends q implements n0 {
    public final String f43894a;
    public final String f43895b;
    public boolean f43896c;
    public int d = -1;
    public int f43897e;
    public m0 f43898f;
    public int f43899g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f43894a = str;
        this.f43895b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f43898f = m0Var;
        int i10 = m0Var.f43871e;
        m0Var.f43871e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f43894a);
        bundle.putString("routeGroupId", this.f43895b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f43899g = i10;
        if (this.f43896c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f43899g, i12);
                this.d = -1;
            }
            int i13 = this.f43897e;
            if (i13 != 0) {
                m0Var.d(this.f43899g, i13);
                this.f43897e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43899g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f43898f;
        if (m0Var != null) {
            int i10 = this.f43899g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f43898f = null;
            this.f43899g = 0;
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
        this.f43896c = true;
        m0 m0Var = this.f43898f;
        if (m0Var != null) {
            m0Var.a(this.f43899g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f43898f;
        if (m0Var != null) {
            m0Var.c(this.f43899g, i10);
            return;
        }
        this.d = i10;
        this.f43897e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f43896c = false;
        m0 m0Var = this.f43898f;
        if (m0Var != null) {
            int i11 = this.f43899g;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f43898f;
        if (m0Var != null) {
            m0Var.d(this.f43899g, i10);
        } else {
            this.f43897e += i10;
        }
    }
}
