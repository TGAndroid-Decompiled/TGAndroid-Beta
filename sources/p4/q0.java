package p4;

import android.os.Bundle;
import org.telegram.ui.Cells.c1;
public final class q0 extends q implements n0 {
    public final String f44250a;
    public final String f44251b;
    public boolean f44252c;
    public int d = -1;
    public int f44253e;
    public m0 f44254f;
    public int f44255g;
    public final r0 h;

    public q0(r0 r0Var, String str, String str2) {
        this.h = r0Var;
        this.f44250a = str;
        this.f44251b = str2;
    }

    @Override
    public final void a(m0 m0Var) {
        this.f44254f = m0Var;
        int i10 = m0Var.f44227e;
        m0Var.f44227e = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f44250a);
        bundle.putString("routeGroupId", this.f44251b);
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        m0Var.b(3, i11, i10, null, bundle);
        this.f44255g = i10;
        if (this.f44252c) {
            m0Var.a(i10);
            int i12 = this.d;
            if (i12 >= 0) {
                m0Var.c(this.f44255g, i12);
                this.d = -1;
            }
            int i13 = this.f44253e;
            if (i13 != 0) {
                m0Var.d(this.f44255g, i13);
                this.f44253e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44255g;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44254f;
        if (m0Var != null) {
            int i10 = this.f44255g;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44254f = null;
            this.f44255g = 0;
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
        this.f44252c = true;
        m0 m0Var = this.f44254f;
        if (m0Var != null) {
            m0Var.a(this.f44255g);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44254f;
        if (m0Var != null) {
            m0Var.c(this.f44255g, i10);
            return;
        }
        this.d = i10;
        this.f44253e = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44252c = false;
        m0 m0Var = this.f44254f;
        if (m0Var != null) {
            int i11 = this.f44255g;
            Bundle h = c1.h(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, h);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44254f;
        if (m0Var != null) {
            m0Var.d(this.f44255g, i10);
        } else {
            this.f44253e += i10;
        }
    }
}
