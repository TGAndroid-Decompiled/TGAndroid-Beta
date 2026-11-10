package s4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class p0 extends p implements n0 {
    public final String f54880f;
    public String f54881g;
    public String h;
    public boolean f54882i;
    public int f54884k;
    public m0 f54885l;
    public final r0 f54887n;
    public int f54883j = -1;
    public int f54886m = -1;

    public p0(r0 r0Var, String str) {
        this.f54887n = r0Var;
        this.f54880f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f54885l = m0Var;
        int i7 = m0Var.f54865e;
        m0Var.f54865e = i7 + 1;
        int i10 = m0Var.d;
        m0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f54880f);
        m0Var.b(11, i10, i7, null, bundle);
        m0Var.h.put(i10, o0Var);
        this.f54886m = i7;
        if (this.f54882i) {
            m0Var.a(i7);
            int i11 = this.f54883j;
            if (i11 >= 0) {
                m0Var.c(this.f54886m, i11);
                this.f54883j = -1;
            }
            int i12 = this.f54884k;
            if (i12 != 0) {
                m0Var.d(this.f54886m, i12);
                this.f54884k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f54886m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            int i7 = this.f54886m;
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(4, i10, i7, null, null);
            this.f54885l = null;
            this.f54886m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f54887n;
        r0Var.f54899w.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f54882i = true;
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            m0Var.a(this.f54886m);
        }
    }

    @Override
    public final void f(int i7) {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            m0Var.c(this.f54886m, i7);
            return;
        }
        this.f54883j = i7;
        this.f54884k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i7) {
        this.f54882i = false;
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            int i10 = this.f54886m;
            Bundle f10 = rf.b.f(i7, "unselectReason");
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(6, i11, i10, null, f10);
        }
    }

    @Override
    public final void i(int i7) {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            m0Var.d(this.f54886m, i7);
        } else {
            this.f54884k += i7;
        }
    }

    @Override
    public final String j() {
        return this.f54881g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            int i7 = this.f54886m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(12, i10, i7, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            int i7 = this.f54886m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(13, i10, i7, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f54885l;
        if (m0Var != null) {
            int i7 = this.f54886m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = m0Var.d;
            m0Var.d = i10 + 1;
            m0Var.b(14, i10, i7, null, bundle);
        }
    }
}
