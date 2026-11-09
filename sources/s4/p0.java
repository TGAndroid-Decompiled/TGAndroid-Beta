package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class p0 extends p implements n0 {
    public final String f54881f;
    public String f54882g;
    public String h;
    public boolean f54883i;
    public int f54885k;
    public m0 f54886l;
    public final r0 f54888n;
    public int f54884j = -1;
    public int f54887m = -1;

    public p0(r0 r0Var, String str) {
        this.f54888n = r0Var;
        this.f54881f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f54886l = m0Var;
        int i7 = m0Var.f54866e;
        m0Var.f54866e = i7 + 1;
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f54881f);
        m0Var.b(11, i10, i7, null, bundle);
        m0Var.h.put(i10, o0Var);
        this.f54887m = i7;
        if (this.f54883i) {
            m0Var.a(i7);
            int i11 = this.f54884j;
            if (i11 >= 0) {
                m0Var.c(this.f54887m, i11);
                this.f54884j = -1;
            }
            int i12 = this.f54885k;
            if (i12 != 0) {
                m0Var.d(this.f54887m, i12);
                this.f54885k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f54887m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            int i7 = this.f54887m;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f54886l = null;
            this.f54887m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f54888n;
        r0Var.f54900w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f54883i = true;
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            m0Var.a(this.f54887m);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            m0Var.c(this.f54887m, i7);
            return;
        }
        this.f54884j = i7;
        this.f54885k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f54883i = false;
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            int i10 = this.f54887m;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            m0Var.d(this.f54887m, i7);
        } else {
            this.f54885k += i7;
        }
    }

    @Override
    public final String j() {
        return this.f54882g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            int i7 = this.f54887m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(12, i10, i7, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            int i7 = this.f54887m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(13, i10, i7, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f54886l;
        if (m0Var != null) {
            int i7 = this.f54887m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(14, i10, i7, null, bundle);
        }
    }
}
