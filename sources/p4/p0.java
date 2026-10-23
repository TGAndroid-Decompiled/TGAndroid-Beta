package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.c1;
public final class p0 extends p implements n0 {
    public final String f44178f;
    public String f44179g;
    public String h;
    public boolean f44180i;
    public int f44182k;
    public m0 f44183l;
    public final r0 f44185n;
    public int f44181j = -1;
    public int f44184m = -1;

    public p0(r0 r0Var, String str) {
        this.f44185n = r0Var;
        this.f44178f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f44183l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f44178f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f44184m = i10;
        if (this.f44180i) {
            m0Var.a(i10);
            int i12 = this.f44181j;
            if (i12 >= 0) {
                m0Var.c(this.f44184m, i12);
                this.f44181j = -1;
            }
            int i13 = this.f44182k;
            if (i13 != 0) {
                m0Var.d(this.f44184m, i13);
                this.f44182k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44184m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            int i10 = this.f44184m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44183l = null;
            this.f44184m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f44185n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f44180i = true;
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            m0Var.a(this.f44184m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            m0Var.c(this.f44184m, i10);
            return;
        }
        this.f44181j = i10;
        this.f44182k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44180i = false;
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            int i11 = this.f44184m;
            Bundle i12 = c1.i(i10, "unselectReason");
            int i13 = m0Var.d;
            m0Var.d = i13 + 1;
            m0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            m0Var.d(this.f44184m, i10);
        } else {
            this.f44182k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f44179g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            int i10 = this.f44184m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            int i10 = this.f44184m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f44183l;
        if (m0Var != null) {
            int i10 = this.f44184m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
