package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.r6;
public final class p0 extends p implements n0 {
    public final String f39754f;
    public String f39755g;
    public String h;
    public boolean f39756i;
    public int f39758k;
    public m0 f39759l;
    public final r0 f39761n;
    public int f39757j = -1;
    public int f39760m = -1;

    public p0(r0 r0Var, String str) {
        this.f39761n = r0Var;
        this.f39754f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f39759l = m0Var;
        int i10 = m0Var.e;
        m0Var.e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f39754f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f39760m = i10;
        if (this.f39756i) {
            m0Var.a(i10);
            int i12 = this.f39757j;
            if (i12 >= 0) {
                m0Var.c(this.f39760m, i12);
                this.f39757j = -1;
            }
            int i13 = this.f39758k;
            if (i13 != 0) {
                m0Var.d(this.f39760m, i13);
                this.f39758k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f39760m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            int i10 = this.f39760m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f39759l = null;
            this.f39760m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f39761n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f39756i = true;
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            m0Var.a(this.f39760m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            m0Var.c(this.f39760m, i10);
            return;
        }
        this.f39757j = i10;
        this.f39758k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f39756i = false;
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            int i11 = this.f39760m;
            Bundle e = r6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            m0Var.d(this.f39760m, i10);
        } else {
            this.f39758k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f39755g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            int i10 = this.f39760m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            int i10 = this.f39760m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f39759l;
        if (m0Var != null) {
            int i10 = this.f39760m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
