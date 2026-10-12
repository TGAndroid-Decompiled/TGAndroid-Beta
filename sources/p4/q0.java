package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
public final class q0 extends p implements o0 {
    public final String f43085f;
    public String f43086g;
    public String h;
    public boolean f43087i;
    public int f43089k;
    public n0 f43090l;
    public final s0 f43092n;
    public int f43088j = -1;
    public int f43091m = -1;

    public q0(s0 s0Var, String str) {
        this.f43092n = s0Var;
        this.f43085f = str;
    }

    @Override
    public final void a(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.f43090l = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f43085f);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.h.put(i11, p0Var);
        this.f43091m = i10;
        if (this.f43087i) {
            n0Var.a(i10);
            int i12 = this.f43088j;
            if (i12 >= 0) {
                n0Var.c(this.f43091m, i12);
                this.f43088j = -1;
            }
            int i13 = this.f43089k;
            if (i13 != 0) {
                n0Var.d(this.f43091m, i13);
                this.f43089k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f43091m;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            int i10 = this.f43091m;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f43090l = null;
            this.f43091m = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f43092n;
        s0Var.v.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f43087i = true;
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            n0Var.a(this.f43091m);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            n0Var.c(this.f43091m, i10);
            return;
        }
        this.f43088j = i10;
        this.f43089k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f43087i = false;
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            int i11 = this.f43091m;
            Bundle g10 = org.telegram.ui.Cells.d0.g(i10, "unselectReason");
            int i12 = n0Var.d;
            n0Var.d = i12 + 1;
            n0Var.b(6, i12, i11, null, g10);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            n0Var.d(this.f43091m, i10);
        } else {
            this.f43089k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f43086g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            int i10 = this.f43091m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            int i10 = this.f43091m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        n0 n0Var = this.f43090l;
        if (n0Var != null) {
            int i10 = this.f43091m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}
