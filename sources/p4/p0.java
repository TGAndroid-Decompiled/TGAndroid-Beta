package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.b10;
public final class p0 extends p implements n0 {
    public final String f46735f;
    public String f46736g;
    public String h;
    public boolean f46737i;
    public int f46739k;
    public m0 f46740l;
    public final r0 f46742n;
    public int f46738j = -1;
    public int f46741m = -1;

    public p0(r0 r0Var, String str) {
        this.f46742n = r0Var;
        this.f46735f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f46740l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f46735f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f46741m = i10;
        if (this.f46737i) {
            m0Var.a(i10);
            int i12 = this.f46738j;
            if (i12 >= 0) {
                m0Var.c(this.f46741m, i12);
                this.f46738j = -1;
            }
            int i13 = this.f46739k;
            if (i13 != 0) {
                m0Var.d(this.f46741m, i13);
                this.f46739k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f46741m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            int i10 = this.f46741m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f46740l = null;
            this.f46741m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f46742n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f46737i = true;
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            m0Var.a(this.f46741m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            m0Var.c(this.f46741m, i10);
            return;
        }
        this.f46738j = i10;
        this.f46739k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f46737i = false;
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            int i11 = this.f46741m;
            Bundle g7 = b10.g(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, g7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            m0Var.d(this.f46741m, i10);
        } else {
            this.f46739k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f46736g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            int i10 = this.f46741m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            int i10 = this.f46741m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f46740l;
        if (m0Var != null) {
            int i10 = this.f46741m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
