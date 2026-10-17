package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class p0 extends p implements n0 {
    public final String f44192f;
    public String f44193g;
    public String h;
    public boolean f44194i;
    public int f44196k;
    public m0 f44197l;
    public final r0 f44199n;
    public int f44195j = -1;
    public int f44198m = -1;

    public p0(r0 r0Var, String str) {
        this.f44199n = r0Var;
        this.f44192f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f44197l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f44192f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f44198m = i10;
        if (this.f44194i) {
            m0Var.a(i10);
            int i12 = this.f44195j;
            if (i12 >= 0) {
                m0Var.c(this.f44198m, i12);
                this.f44195j = -1;
            }
            int i13 = this.f44196k;
            if (i13 != 0) {
                m0Var.d(this.f44198m, i13);
                this.f44196k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44198m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            int i10 = this.f44198m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f44197l = null;
            this.f44198m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f44199n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f44194i = true;
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            m0Var.a(this.f44198m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            m0Var.c(this.f44198m, i10);
            return;
        }
        this.f44195j = i10;
        this.f44196k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44194i = false;
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            int i11 = this.f44198m;
            Bundle j10 = org.telegram.ui.Cells.t0.j(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, j10);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            m0Var.d(this.f44198m, i10);
        } else {
            this.f44196k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f44193g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            int i10 = this.f44198m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            int i10 = this.f44198m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f44197l;
        if (m0Var != null) {
            int i10 = this.f44198m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
