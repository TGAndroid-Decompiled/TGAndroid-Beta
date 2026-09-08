package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.p6;
public final class p0 extends p implements n0 {
    public final String f43913f;
    public String f43914g;
    public String h;
    public boolean f43915i;
    public int f43917k;
    public m0 f43918l;
    public final r0 f43920n;
    public int f43916j = -1;
    public int f43919m = -1;

    public p0(r0 r0Var, String str) {
        this.f43920n = r0Var;
        this.f43913f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f43918l = m0Var;
        int i10 = m0Var.f43898e;
        m0Var.f43898e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f43913f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f43919m = i10;
        if (this.f43915i) {
            m0Var.a(i10);
            int i12 = this.f43916j;
            if (i12 >= 0) {
                m0Var.c(this.f43919m, i12);
                this.f43916j = -1;
            }
            int i13 = this.f43917k;
            if (i13 != 0) {
                m0Var.d(this.f43919m, i13);
                this.f43917k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43919m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            int i10 = this.f43919m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f43918l = null;
            this.f43919m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f43920n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f43915i = true;
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            m0Var.a(this.f43919m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            m0Var.c(this.f43919m, i10);
            return;
        }
        this.f43916j = i10;
        this.f43917k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f43915i = false;
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            int i11 = this.f43919m;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            m0Var.d(this.f43919m, i10);
        } else {
            this.f43917k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f43914g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            int i10 = this.f43919m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            int i10 = this.f43919m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f43918l;
        if (m0Var != null) {
            int i10 = this.f43919m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
