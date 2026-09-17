package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.p6;
public final class p0 extends p implements n0 {
    public final String f43887f;
    public String f43888g;
    public String h;
    public boolean f43889i;
    public int f43891k;
    public m0 f43892l;
    public final r0 f43894n;
    public int f43890j = -1;
    public int f43893m = -1;

    public p0(r0 r0Var, String str) {
        this.f43894n = r0Var;
        this.f43887f = str;
    }

    @Override
    public final void a(m0 m0Var) {
        o0 o0Var = new o0(this);
        this.f43892l = m0Var;
        int i10 = m0Var.f43872e;
        m0Var.f43872e = i10 + 1;
        int i11 = m0Var.d;
        m0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f43887f);
        m0Var.b(11, i11, i10, null, bundle);
        m0Var.h.put(i11, o0Var);
        this.f43893m = i10;
        if (this.f43889i) {
            m0Var.a(i10);
            int i12 = this.f43890j;
            if (i12 >= 0) {
                m0Var.c(this.f43893m, i12);
                this.f43890j = -1;
            }
            int i13 = this.f43891k;
            if (i13 != 0) {
                m0Var.d(this.f43893m, i13);
                this.f43891k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43893m;
    }

    @Override
    public final void c() {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            int i10 = this.f43893m;
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(4, i11, i10, null, null);
            this.f43892l = null;
            this.f43893m = 0;
        }
    }

    @Override
    public final void d() {
        r0 r0Var = this.f43894n;
        r0Var.v.remove(this);
        c();
        r0Var.r();
    }

    @Override
    public final void e() {
        this.f43889i = true;
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            m0Var.a(this.f43893m);
        }
    }

    @Override
    public final void f(int i10) {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            m0Var.c(this.f43893m, i10);
            return;
        }
        this.f43890j = i10;
        this.f43891k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f43889i = false;
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            int i11 = this.f43893m;
            Bundle e7 = p6.e(i10, "unselectReason");
            int i12 = m0Var.d;
            m0Var.d = i12 + 1;
            m0Var.b(6, i12, i11, null, e7);
        }
    }

    @Override
    public final void i(int i10) {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            m0Var.d(this.f43893m, i10);
        } else {
            this.f43891k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f43888g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            int i10 = this.f43893m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            int i10 = this.f43893m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        m0 m0Var = this.f43892l;
        if (m0Var != null) {
            int i10 = this.f43893m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = m0Var.d;
            m0Var.d = i11 + 1;
            m0Var.b(14, i11, i10, null, bundle);
        }
    }
}
