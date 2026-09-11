package pf;

import a0.h;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.i0;
import s4.c1;
import s4.h0;
import s4.m0;
import s4.o0;
import s4.t0;
import s4.u0;
public final class e {
    public int f44059a;
    public int f44060b;
    public final Serializable f44061c;
    public Serializable d;
    public Serializable f44062e;
    public Object f44063f;
    public Object f44064g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f44061c = str;
        this.f44064g = uri;
        this.d = str2;
    }

    public void a(c1 c1Var, boolean z10) {
        RecyclerView.m(c1Var);
        if (c1Var.e(16384)) {
            c1Var.p(0, 16384);
            i0.k(c1Var.f45738a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f1894w;
            if (h0Var != null) {
                h0Var.A(c1Var);
            }
            if (recyclerView.f1891t0 != null) {
                recyclerView.f1874f.K(c1Var);
            }
        }
        c1Var.f45755t = null;
        u0 c10 = c();
        c10.getClass();
        int i10 = c1Var.f45742f;
        ArrayList arrayList = c10.b(i10).f45867a;
        if (((t0) c10.f45881a.get(i10)).f45868b <= arrayList.size()) {
            return;
        }
        c1Var.o();
        arrayList.add(c1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f1891t0.b()) {
            if (!recyclerView.f1891t0.f45920g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = i2.g.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.f1891t0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public u0 c() {
        if (((u0) this.f44064g) == null) {
            this.f44064g = new u0();
        }
        return (u0) this.f44064g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f44061c).clear();
        e();
        u0 c10 = c();
        if (h0Var != null) {
            c10.f45882b--;
        }
        if (c10.f45882b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f45882b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f44062e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        if (RecyclerView.S0) {
            h hVar = ((RecyclerView) this.h).f1890s0;
            int[] iArr = (int[]) hVar.f18c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            hVar.d = 0;
        }
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f44062e;
        a((c1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f45751p.k(U);
        } else if (U.s()) {
            U.f45747l &= -33;
        }
        h(U);
        if (recyclerView.f1870c0 != null && !U.i()) {
            recyclerView.f1870c0.f(U);
        }
    }

    public void h(s4.c1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.h(s4.c1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        c1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f1870c0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f45751p = this;
            U.f45752q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f1894w.f45795b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f45751p = this;
            U.f45752q = false;
            ((ArrayList) this.f44061c).add(U);
        }
    }

    public s4.c1 j(int r30, long r31) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.j(int, long):s4.c1");
    }

    public void k(c1 c1Var) {
        if (c1Var.f45752q) {
            ((ArrayList) this.d).remove(c1Var);
        } else {
            ((ArrayList) this.f44061c).remove(c1Var);
        }
        c1Var.f45751p = null;
        c1Var.f45752q = false;
        c1Var.f45747l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f44062e;
        o0 o0Var = ((RecyclerView) this.h).f1896x;
        if (o0Var != null) {
            i10 = o0Var.f45847i;
        } else {
            i10 = 0;
        }
        this.f44060b = this.f44059a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f44060b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f44061c = arrayList;
        this.d = null;
        this.f44062e = new ArrayList();
        this.f44063f = DesugarCollections.unmodifiableList(arrayList);
        this.f44059a = 2;
        this.f44060b = 2;
    }
}
