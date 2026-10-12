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
import s4.d1;
import s4.n0;
import s4.p0;
import s4.u0;
import s4.v0;
public final class e {
    public int f45461a;
    public int f45462b;
    public final Serializable f45463c;
    public Serializable d;
    public Serializable f45464e;
    public Object f45465f;
    public Object f45466g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f45463c = str;
        this.f45466g = uri;
        this.d = str2;
    }

    public void a(d1 d1Var, boolean z10) {
        RecyclerView.m(d1Var);
        if (d1Var.e(16384)) {
            d1Var.p(0, 16384);
            i0.j(d1Var.f47897a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            s4.i0 i0Var = recyclerView.f3165w;
            if (i0Var != null) {
                i0Var.A(d1Var);
            }
            if (recyclerView.f3163u0 != null) {
                recyclerView.f3145f.g0(d1Var);
            }
        }
        d1Var.f47914t = null;
        v0 c10 = c();
        c10.getClass();
        int i10 = d1Var.f47901f;
        ArrayList arrayList = c10.b(i10).f48035a;
        if (((u0) c10.f48041a.get(i10)).f48036b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f3163u0.b()) {
            if (!recyclerView.f3163u0.f47852g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder l4 = hg.c.l(i10, "invalid position ", ". State item count is ");
        l4.append(recyclerView.f3163u0.b());
        l4.append(recyclerView.C());
        throw new IndexOutOfBoundsException(l4.toString());
    }

    public v0 c() {
        if (((v0) this.f45466g) == null) {
            this.f45466g = new v0();
        }
        return (v0) this.f45466g;
    }

    public void d(s4.i0 i0Var, s4.i0 i0Var2) {
        ((ArrayList) this.f45463c).clear();
        e();
        v0 c10 = c();
        if (i0Var != null) {
            c10.f48042b--;
        }
        if (c10.f48042b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
            c10.f48042b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f45464e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.Q0;
        h hVar = ((RecyclerView) this.h).f3162t0;
        int[] iArr2 = (int[]) hVar.f18c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        hVar.d = 0;
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.f45464e;
        a((d1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f47910p.k(U);
        } else if (U.s()) {
            U.f47906l &= -33;
        }
        h(U);
        if (recyclerView.f3141c0 != null && !U.i()) {
            recyclerView.f3141c0.f(U);
        }
    }

    public void h(s4.d1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.h(s4.d1):void");
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.f3141c0) != null && !n0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f47910p = this;
            U.f47911q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f3165w.f47952b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f47910p = this;
            U.f47911q = false;
            ((ArrayList) this.f45463c).add(U);
        }
    }

    public s4.d1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.j(int, long):s4.d1");
    }

    public void k(d1 d1Var) {
        if (d1Var.f47911q) {
            ((ArrayList) this.d).remove(d1Var);
        } else {
            ((ArrayList) this.f45463c).remove(d1Var);
        }
        d1Var.f47910p = null;
        d1Var.f47911q = false;
        d1Var.f47906l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.f45464e;
        p0 p0Var = ((RecyclerView) this.h).f3167x;
        if (p0Var != null) {
            i10 = p0Var.f48008i;
        } else {
            i10 = 0;
        }
        this.f45462b = this.f45461a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f45462b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f45463c = arrayList;
        this.d = null;
        this.f45464e = new ArrayList();
        this.f45465f = DesugarCollections.unmodifiableList(arrayList);
        this.f45461a = 2;
        this.f45462b = 2;
    }
}
