package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class q0 extends q implements n0 {
    public final String f44172a;
    public final String f44173b;
    public boolean f44174c;
    public int d = -1;
    public int e;
    public m0 f44175f;
    public int f44176g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f44172a = str;
        this.f44173b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f44175f = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44172a);
        bundle.putString("routeGroupId", this.f44173b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f44176g = i10;
        if (this.f44174c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f44176g, i12);
                this.d = -1;
            }
            int i13 = this.e;
            if (i13 != 0) {
                m0Var.d(this.f44176g, i13);
                this.e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44176g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44175f;
        if (m0Var != null) {
            int i10 = this.f44176g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44175f = null;
            this.f44176g = 0;
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
        this.f44174c = true;
        m0 m0Var = this.f44175f;
        if (m0Var != null) {
            m0Var.a(this.f44176g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44175f;
        if (m0Var != null) {
            m0Var.c(this.f44176g, i10);
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
        this.f44174c = false;
        m0 m0Var = this.f44175f;
        if (m0Var != null) {
            int i11 = this.f44176g;
            Bundle i12 = c1.i(i10, "unselectReason");
            int i13 = m0Var.d;
            m0Var.d = i13 + 1;
            m0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44175f;
        if (m0Var != null) {
            m0Var.d(this.f44176g, i10);
        } else {
            this.e += i10;
        }
    }
}
