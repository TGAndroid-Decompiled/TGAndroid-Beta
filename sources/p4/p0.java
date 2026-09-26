package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.c1;
public final class p0 extends p implements n0 {
    public final String f40895f;
    public String f40896g;
    public String h;
    public boolean f40897i;
    public int f40899k;
    public m0 f40900l;
    public final r0 f40902n;
    public int f40898j = -1;
    public int f40901m = -1;

    public p0(r0 r0Var, String str) {
        this.f40902n = r0Var;
        this.f40895f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f40900l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f40895f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f40901m = i10;
        if (this.f40897i) {
            m0Var.a(i10);
            int i12 = this.f40898j;
            if (i12 >= 0) {
                m0Var.c(this.f40901m, i12);
                this.f40898j = -1;
            }
            int i13 = this.f40899k;
            if (i13 != 0) {
                m0Var.d(this.f40901m, i13);
                this.f40899k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f40901m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            int i10 = this.f40901m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f40900l = null;
            this.f40901m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f40902n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f40897i = true;
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            m0Var.a(this.f40901m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            m0Var.c(this.f40901m, i10);
            return;
        }
        this.f40898j = i10;
        this.f40899k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f40897i = false;
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            int i11 = this.f40901m;
            Bundle g10 = c1.g(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            m0Var.d(this.f40901m, i10);
        } else {
            this.f40899k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f40896g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            int i10 = this.f40901m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            int i10 = this.f40901m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f40900l;
        if (m0Var != null) {
            int i10 = this.f40901m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
