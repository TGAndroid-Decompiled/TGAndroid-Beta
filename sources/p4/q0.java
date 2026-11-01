package p4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Cells.f1;
public final class q0 extends p implements o0 {
    public final String f44798f;
    public String f44799g;
    public String h;
    public boolean f44800i;
    public int f44802k;
    public n0 f44803l;
    public final s0 f44805n;
    public int f44801j = -1;
    public int f44804m = -1;

    public q0(s0 s0Var, String str) {
        this.f44805n = s0Var;
        this.f44798f = str;
    }

    @Override
    public final void a(n0 n0Var) {
        p0 p0Var = new p0(this);
        this.f44803l = n0Var;
        int i10 = n0Var.e;
        n0Var.e = i10 + 1;
        int i11 = n0Var.d;
        n0Var.d = i11 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f44798f);
        n0Var.b(11, i11, i10, null, bundle);
        n0Var.h.put(i11, p0Var);
        this.f44804m = i10;
        if (this.f44800i) {
            n0Var.a(i10);
            int i12 = this.f44801j;
            if (i12 >= 0) {
                n0Var.c(this.f44804m, i12);
                this.f44801j = -1;
            }
            int i13 = this.f44802k;
            if (i13 != 0) {
                n0Var.d(this.f44804m, i13);
                this.f44802k = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f44804m;
    }

    @Override
    public final void c() {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            int i10 = this.f44804m;
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(4, i11, i10, null, null);
            this.f44803l = null;
            this.f44804m = 0;
        }
    }

    @Override
    public final void d() {
        s0 s0Var = this.f44805n;
        s0Var.f44818w.remove(this);
        c();
        s0Var.r();
    }

    @Override
    public final void e() {
        this.f44800i = true;
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            n0Var.a(this.f44804m);
        }
    }

    @Override
    public final void f(int i10) {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            n0Var.c(this.f44804m, i10);
            return;
        }
        this.f44801j = i10;
        this.f44802k = 0;
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i10) {
        this.f44800i = false;
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            int i11 = this.f44804m;
            Bundle i12 = f1.i(i10, "unselectReason");
            int i13 = n0Var.d;
            n0Var.d = i13 + 1;
            n0Var.b(6, i13, i11, null, i12);
        }
    }

    @Override
    public final void i(int i10) {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            n0Var.d(this.f44804m, i10);
        } else {
            this.f44802k += i10;
        }
    }

    @Override
    public final String j() {
        return this.f44799g;
    }

    @Override
    public final String k() {
        return this.h;
    }

    @Override
    public final void m(String str) {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            int i10 = this.f44804m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(12, i11, i10, null, bundle);
        }
    }

    @Override
    public final void n(String str) {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            int i10 = this.f44804m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(13, i11, i10, null, bundle);
        }
    }

    @Override
    public final void o(List list) {
        n0 n0Var = this.f44803l;
        if (n0Var != null) {
            int i10 = this.f44804m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i11 = n0Var.d;
            n0Var.d = i11 + 1;
            n0Var.b(14, i11, i10, null, bundle);
        }
    }
}
