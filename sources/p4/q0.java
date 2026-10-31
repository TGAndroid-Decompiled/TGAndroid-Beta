package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class q0 extends p implements o0 {
    public final String f44787f;
    public String f44788g;
    public String h;
    public boolean f44789i;
    public int f44791k;
    public n0 f44792l;
    public final s0 f44794n;
    public int f44790j = -1;
    public int f44793m = -1;

    public q0(s0 s0Var, String str) {
        this.f44794n = s0Var;
        this.f44787f = str;
    }

    @Override
    public final void a(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.f44792l = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f44787f);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.h.put(i11, p0Var);
        this.f44793m = i10;
        if (this.f44789i) {
            n0Var.a(i10);
            int i12 = this.f44790j;
            if (i12 >= 0) {
                n0Var.c(this.f44793m, i12);
                this.f44790j = -1;
            }
            int i13 = this.f44791k;
            if (i13 != 0) {
                n0Var.d(this.f44793m, i13);
                this.f44791k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44793m;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            int i10 = this.f44793m;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f44792l = null;
            this.f44793m = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f44794n;
        s0Var.f44807w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f44789i = true;
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            n0Var.a(this.f44793m);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            n0Var.c(this.f44793m, i10);
            return;
        }
        this.f44790j = i10;
        this.f44791k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44789i = false;
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            int i11 = this.f44793m;
            Bundle i12 = f1.i(i10, "unselectReason");
            int i13 = n0Var.d;
            n0Var.d = i13 + 1;
            n0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            n0Var.d(this.f44793m, i10);
        } else {
            this.f44791k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f44788g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            int i10 = this.f44793m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            int i10 = this.f44793m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        n0 n0Var = this.f44792l;
        if (n0Var != null) {
            int i10 = this.f44793m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}
