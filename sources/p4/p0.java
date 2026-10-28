package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.b10;
public final class p0 extends p implements n0 {
    public final String f46770f;
    public String f46771g;
    public String h;
    public boolean f46772i;
    public int f46774k;
    public m0 f46775l;
    public final r0 f46777n;
    public int f46773j = -1;
    public int f46776m = -1;

    public p0(r0 r0Var, String str) {
        this.f46777n = r0Var;
        this.f46770f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f46775l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f46770f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f46776m = i10;
        if (this.f46772i) {
            m0Var.a(i10);
            int i12 = this.f46773j;
            if (i12 >= 0) {
                m0Var.c(this.f46776m, i12);
                this.f46773j = -1;
            }
            int i13 = this.f46774k;
            if (i13 != 0) {
                m0Var.d(this.f46776m, i13);
                this.f46774k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f46776m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            int i10 = this.f46776m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f46775l = null;
            this.f46776m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f46777n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f46772i = true;
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            m0Var.a(this.f46776m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            m0Var.c(this.f46776m, i10);
            return;
        }
        this.f46773j = i10;
        this.f46774k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f46772i = false;
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            int i11 = this.f46776m;
            Bundle g7 = b10.g(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, g7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            m0Var.d(this.f46776m, i10);
        } else {
            this.f46774k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f46771g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            int i10 = this.f46776m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            int i10 = this.f46776m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f46775l;
        if (m0Var != null) {
            int i10 = this.f46776m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
