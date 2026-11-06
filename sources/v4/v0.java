package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class v0 {
    public int f57084a;
    public int f57085b;
    public final Serializable f57086c;
    public Object d;
    public final Serializable f57087e;
    public Object f57088f;
    public Object f57089g;
    public Object h;

    public v0(Uri uri, String str, String str2) {
        this.f57086c = str;
        this.d = uri;
        this.f57087e = str2;
    }

    public void a(d1 d1Var, boolean z9) {
        RecyclerView.m(d1Var);
        if (d1Var.e(16384)) {
            d1Var.p(0, 16384);
            r0.i0.j(d1Var.f56951a, null);
        }
        if (z9) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.f2871x;
            if (g0Var != null) {
                g0Var.A(d1Var);
            }
            if (recyclerView.f2867u0 != null) {
                recyclerView.f2849f.T0(d1Var);
            }
        }
        d1Var.f56968t = null;
        u0 c10 = c();
        c10.getClass();
        int i7 = d1Var.f56955f;
        ArrayList arrayList = c10.b(i7).f57065a;
        if (((t0) c10.f57079a.get(i7)).f57066b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2867u0.b()) {
            if (!recyclerView.f2867u0.f56910g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder n10 = jg.g.n(i7, "invalid position ", ". State item count is ");
        n10.append(recyclerView.f2867u0.b());
        n10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public u0 c() {
        if (((u0) this.f57089g) == null) {
            this.f57089g = new u0();
        }
        return (u0) this.f57089g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.f57086c).clear();
        e();
        u0 c10 = c();
        if (g0Var != null) {
            c10.f57080b--;
        }
        if (c10.f57080b == 0) {
            c10.a();
        }
        if (g0Var2 != null) {
            c10.f57080b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f57087e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.Q0;
        h2.f fVar = ((RecyclerView) this.h).f2866t0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f14082c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f57087e;
        a((d1) arrayList.get(i7), true);
        arrayList.remove(i7);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f56964p.k(U);
        } else if (U.s()) {
            U.f56960l &= -33;
        }
        h(U);
        if (recyclerView.f2845c0 != null && !U.i()) {
            recyclerView.f2845c0.f(U);
        }
    }

    public void h(v4.d1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.v0.h(v4.d1):void");
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.f2845c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f56964p = this;
            U.f56965q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2871x.f56985b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f56964p = this;
            U.f56965q = false;
            ((ArrayList) this.f57086c).add(U);
        }
    }

    public v4.d1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.v0.j(int, long):v4.d1");
    }

    public void k(d1 d1Var) {
        if (d1Var.f56965q) {
            ((ArrayList) this.d).remove(d1Var);
        } else {
            ((ArrayList) this.f57086c).remove(d1Var);
        }
        d1Var.f56964p = null;
        d1Var.f56965q = false;
        d1Var.f56960l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f57087e;
        n0 n0Var = ((RecyclerView) this.h).f2873y;
        if (n0Var != null) {
            i7 = n0Var.f57044i;
        } else {
            i7 = 0;
        }
        this.f57085b = this.f57084a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f57085b; size--) {
            f(size);
        }
    }

    public v0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f57086c = arrayList;
        this.d = null;
        this.f57087e = new ArrayList();
        this.f57088f = DesugarCollections.unmodifiableList(arrayList);
        this.f57084a = 2;
        this.f57085b = 2;
    }
}
