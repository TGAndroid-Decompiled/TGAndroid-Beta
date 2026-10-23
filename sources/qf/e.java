package qf;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i2.o1;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.i0;
import s4.b1;
import s4.g0;
import s4.l0;
import s4.n0;
import s4.s0;
import s4.t0;
public final class e {
    public int f44876a;
    public int f44877b;
    public final Serializable f44878c;
    public Serializable d;
    public Serializable e;
    public Object f44879f;
    public Object f44880g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f44878c = str;
        this.f44880g = uri;
        this.d = str2;
    }

    public void a(b1 b1Var, boolean z10) {
        RecyclerView.m(b1Var);
        if (b1Var.e(16384)) {
            b1Var.p(0, 16384);
            i0.j(b1Var.f46343a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            g0 g0Var = recyclerView.f3636w;
            if (g0Var != null) {
                g0Var.A(b1Var);
            }
            if (recyclerView.f3634u0 != null) {
                recyclerView.f3616f.T(b1Var);
            }
        }
        b1Var.f46359t = null;
        t0 c10 = c();
        c10.getClass();
        int i10 = b1Var.f46346f;
        ArrayList arrayList = c10.b(i10).f46458a;
        if (((s0) c10.f46461a.get(i10)).f46459b <= arrayList.size()) {
            return;
        }
        b1Var.o();
        arrayList.add(b1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f3634u0.b()) {
            if (!recyclerView.f3634u0.f46503g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder n10 = o1.n(i10, "invalid position ", ". State item count is ");
        n10.append(recyclerView.f3634u0.b());
        n10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(n10.toString());
    }

    public t0 c() {
        if (((t0) this.f44880g) == null) {
            this.f44880g = new t0();
        }
        return (t0) this.f44880g;
    }

    public void d(g0 g0Var, g0 g0Var2) {
        ((ArrayList) this.f44878c).clear();
        e();
        t0 c10 = c();
        if (g0Var != null) {
            c10.f46462b--;
        }
        if (c10.f46462b == 0) {
            c10.a();
        }
        if (g0Var2 != null) {
            c10.f46462b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.Q0;
        e2.f fVar = ((RecyclerView) this.h).f3633t0;
        int[] iArr2 = (int[]) fVar.f8230c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.d = 0;
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((b1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f46355p.k(U);
        } else if (U.s()) {
            U.f46351l &= -33;
        }
        h(U);
        if (recyclerView.f3613c0 != null && !U.i()) {
            recyclerView.f3613c0.f(U);
        }
    }

    public void h(s4.b1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.h(s4.b1):void");
    }

    public void i(View view) {
        l0 l0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        b1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (l0Var = recyclerView.f3613c0) != null && !l0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f46355p = this;
            U.f46356q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f3636w.f46389b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f46355p = this;
            U.f46356q = false;
            ((ArrayList) this.f44878c).add(U);
        }
    }

    public s4.b1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.j(int, long):s4.b1");
    }

    public void k(b1 b1Var) {
        if (b1Var.f46356q) {
            ((ArrayList) this.d).remove(b1Var);
        } else {
            ((ArrayList) this.f44878c).remove(b1Var);
        }
        b1Var.f46355p = null;
        b1Var.f46356q = false;
        b1Var.f46351l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        n0 n0Var = ((RecyclerView) this.h).f3638x;
        if (n0Var != null) {
            i10 = n0Var.f46440i;
        } else {
            i10 = 0;
        }
        this.f44877b = this.f44876a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f44877b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f44878c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f44879f = DesugarCollections.unmodifiableList(arrayList);
        this.f44876a = 2;
        this.f44877b = 2;
    }
}
