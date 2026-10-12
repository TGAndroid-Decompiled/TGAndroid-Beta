package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.c1;
public final class q0 extends p implements o0 {
    public final String f45295f;
    public String f45296g;
    public String h;
    public boolean f45297i;
    public int f45299k;
    public n0 f45300l;
    public final s0 f45302n;
    public int f45298j = -1;
    public int f45301m = -1;

    public q0(s0 s0Var, String str) {
        this.f45302n = s0Var;
        this.f45295f = str;
    }

    @Override
    public final void a(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.f45300l = n0Var;
        int i10 = n0Var.f45282e;
        n0Var.f45282e = i10 + 1;
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f45295f);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.h.put(i11, p0Var);
        this.f45301m = i10;
        if (this.f45297i) {
            n0Var.a(i10);
            int i12 = this.f45298j;
            if (i12 >= 0) {
                n0Var.c(this.f45301m, i12);
                this.f45298j = -1;
            }
            int i13 = this.f45299k;
            if (i13 != 0) {
                n0Var.d(this.f45301m, i13);
                this.f45299k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f45301m;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            int i10 = this.f45301m;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f45300l = null;
            this.f45301m = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f45302n;
        s0Var.v.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f45297i = true;
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            n0Var.a(this.f45301m);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            n0Var.c(this.f45301m, i10);
            return;
        }
        this.f45298j = i10;
        this.f45299k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f45297i = false;
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            int i11 = this.f45301m;
            Bundle f7 = c1.f(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, f7);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            n0Var.d(this.f45301m, i10);
        } else {
            this.f45299k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f45296g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            int i10 = this.f45301m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            int i10 = this.f45301m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        n0 n0Var = this.f45300l;
        if (n0Var != null) {
            int i10 = this.f45301m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}
