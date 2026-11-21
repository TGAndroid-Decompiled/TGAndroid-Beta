package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class p0 extends p implements n0 {
    public final String f57049f;
    public String f57050g;
    public String h;
    public boolean f57051i;
    public int f57053k;
    public m0 f57054l;
    public final r0 f57056n;
    public int f57052j = -1;
    public int f57055m = -1;

    public p0(r0 r0Var, String str) {
        this.f57056n = r0Var;
        this.f57049f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f57054l = m0Var;
        int i7 = m0Var.f57034e;
        m0Var.f57034e = i7 + 1;
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f57049f);
        m0Var.b(11, i10, i7, null, bundle);
        m0Var.f57036n.put(i10, o0Var);
        this.f57055m = i7;
        if (this.f57051i) {
            m0Var.a(i7);
            int i11 = this.f57052j;
            if (i11 >= 0) {
                m0Var.c(this.f57055m, i11);
                this.f57052j = -1;
            }
            int i12 = this.f57053k;
            if (i12 != 0) {
                m0Var.d(this.f57055m, i12);
                this.f57053k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f57055m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            int i7 = this.f57055m;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f57054l = null;
            this.f57055m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f57056n;
        r0Var.f57068w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f57051i = true;
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            m0Var.a(this.f57055m);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            m0Var.c(this.f57055m, i7);
            return;
        }
        this.f57052j = i7;
        this.f57053k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f57051i = false;
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            int i10 = this.f57055m;
            Bundle f10 = p5.c.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            m0Var.d(this.f57055m, i7);
        } else {
            this.f57053k += i7;
        }
    }

    @Override
    public final String j() {
        return this.f57050g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            int i7 = this.f57055m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(12, i10, i7, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            int i7 = this.f57055m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(13, i10, i7, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f57054l;
        if (m0Var != null) {
            int i7 = this.f57055m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(14, i10, i7, null, bundle);
        }
    }
}
