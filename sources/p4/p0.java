package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.q3;
public final class p0 extends p implements n0 {
    public final String f40625f;
    public String f40626g;
    public String h;
    public boolean f40627i;
    public int f40629k;
    public m0 f40630l;
    public final r0 f40632n;
    public int f40628j = -1;
    public int f40631m = -1;

    public p0(r0 r0Var, String str) {
        this.f40632n = r0Var;
        this.f40625f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f40630l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f40625f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f40631m = i10;
        if (this.f40627i) {
            m0Var.a(i10);
            int i12 = this.f40628j;
            if (i12 >= 0) {
                m0Var.c(this.f40631m, i12);
                this.f40628j = -1;
            }
            int i13 = this.f40629k;
            if (i13 != 0) {
                m0Var.d(this.f40631m, i13);
                this.f40629k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f40631m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            int i10 = this.f40631m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f40630l = null;
            this.f40631m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f40632n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f40627i = true;
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            m0Var.a(this.f40631m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            m0Var.c(this.f40631m, i10);
            return;
        }
        this.f40628j = i10;
        this.f40629k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f40627i = false;
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            int i11 = this.f40631m;
            Bundle e = q3.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            m0Var.d(this.f40631m, i10);
        } else {
            this.f40629k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f40626g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            int i10 = this.f40631m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            int i10 = this.f40631m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f40630l;
        if (m0Var != null) {
            int i10 = this.f40631m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
