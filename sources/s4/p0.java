package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class p0 extends p implements n0 {
    public final String f56434f;
    public String f56435g;
    public String h;
    public boolean f56436i;
    public int f56438k;
    public m0 f56439l;
    public final r0 f56441n;
    public int f56437j = -1;
    public int f56440m = -1;

    public p0(r0 r0Var, String str) {
        this.f56441n = r0Var;
        this.f56434f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f56439l = m0Var;
        int i7 = m0Var.f56419e;
        m0Var.f56419e = i7 + 1;
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f56434f);
        m0Var.b(11, i10, i7, null, bundle);
        m0Var.h.put(i10, o0Var);
        this.f56440m = i7;
        if (this.f56436i) {
            m0Var.a(i7);
            int i11 = this.f56437j;
            if (i11 >= 0) {
                m0Var.c(this.f56440m, i11);
                this.f56437j = -1;
            }
            int i12 = this.f56438k;
            if (i12 != 0) {
                m0Var.d(this.f56440m, i12);
                this.f56438k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f56440m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            int i7 = this.f56440m;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f56439l = null;
            this.f56440m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f56441n;
        r0Var.f56453w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f56436i = true;
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            m0Var.a(this.f56440m);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            m0Var.c(this.f56440m, i7);
            return;
        }
        this.f56437j = i7;
        this.f56438k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f56436i = false;
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            int i10 = this.f56440m;
            Bundle f10 = r.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            m0Var.d(this.f56440m, i7);
        } else {
            this.f56438k += i7;
        }
    }

    @Override
    public final String j() {
        return this.f56435g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            int i7 = this.f56440m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(12, i10, i7, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            int i7 = this.f56440m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(13, i10, i7, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f56439l;
        if (m0Var != null) {
            int i7 = this.f56440m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(14, i10, i7, null, bundle);
        }
    }
}
