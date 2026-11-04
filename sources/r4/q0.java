package r4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class q0 extends p implements o0 {
    public final String f54338f;
    public String f54339g;
    public String h;
    public boolean f54340i;
    public int f54342k;
    public n0 f54343l;
    public final s0 f54345n;
    public int f54341j = -1;
    public int f54344m = -1;

    public q0(s0 s0Var, String str) {
        this.f54345n = s0Var;
        this.f54338f = str;
    }

    @Override
    public final int a() {
        return this.f54344m;
    }

    @Override
    public final void b(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.f54343l = n0Var;
        int i3 = n0Var.f54325e;
        n0Var.f54325e = i3 + 1;
        int i10 = n0Var.d;
        n0Var.d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f54338f);
        n0Var.b(11, i10, i3, null, bundle);
        n0Var.h.put(i10, p0Var);
        this.f54344m = i3;
        if (this.f54340i) {
            n0Var.a(i3);
            int i11 = this.f54341j;
            if (i11 >= 0) {
                n0Var.c(this.f54344m, i11);
                this.f54341j = -1;
            }
            int i12 = this.f54342k;
            if (i12 != 0) {
                n0Var.d(this.f54344m, i12);
                this.f54342k = 0;
            }
        }
    }

    @Override
    public final void c() {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            int i3 = this.f54344m;
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(4, i10, i3, null, null);
            this.f54343l = null;
            this.f54344m = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f54345n;
        s0Var.f54357w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f54340i = true;
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            n0Var.a(this.f54344m);
        }
    }

    @Override
    public final void f(int i3) {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            n0Var.c(this.f54344m, i3);
            return;
        }
        this.f54341j = i3;
        this.f54342k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i3) {
        this.f54340i = false;
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            int i10 = this.f54344m;
            Bundle k10 = f1.k(i3, "unselectReason");
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(6, i11, i10, null, k10);
        }
    }

    @Override
    public final void i(int i3) {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            n0Var.d(this.f54344m, i3);
        } else {
            this.f54342k += i3;
        }
    }

    @Override
    public final String j() {
        return this.f54339g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            int i3 = this.f54344m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(12, i10, i3, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            int i3 = this.f54344m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(13, i10, i3, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        n0 n0Var = this.f54343l;
        if (n0Var != null) {
            int i3 = this.f54344m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = n0Var.d;
            n0Var.d = i10 + 1;
            n0Var.b(14, i10, i3, null, bundle);
        }
    }
}
