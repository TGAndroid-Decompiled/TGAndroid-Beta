package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class x0 {
    public int f59253a;
    public int f59254b;
    public final Serializable f59255c;
    public Object d;
    public final Serializable f59256e;
    public Object f59257f;
    public Object f59258g;
    public Object h;

    public x0(Uri uri, String str, String str2) {
        this.f59255c = str;
        this.d = uri;
        this.f59256e = str2;
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.m(f1Var);
        if (f1Var.e(16384)) {
            f1Var.p(0, 16384);
            r0.i0.j(f1Var.f59122a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            i0 i0Var = recyclerView.f2819x;
            if (i0Var != null) {
                i0Var.A(f1Var);
            }
            if (recyclerView.f2816v0 != null) {
                recyclerView.f2797f.i(f1Var);
            }
        }
        f1Var.f59139t = null;
        w0 c10 = c();
        c10.getClass();
        int i7 = f1Var.f59126f;
        ArrayList arrayList = c10.b(i7).f59243a;
        if (((v0) c10.f59249a.get(i7)).f59244b <= arrayList.size()) {
            return;
        }
        f1Var.o();
        arrayList.add(f1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2816v0.b()) {
            if (!recyclerView.f2816v0.f59090g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2816v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public w0 c() {
        if (((w0) this.f59258g) == null) {
            this.f59258g = new w0();
        }
        return (w0) this.f59258g;
    }

    public void d(i0 i0Var, i0 i0Var2) {
        ((ArrayList) this.f59255c).clear();
        e();
        w0 c10 = c();
        if (i0Var != null) {
            c10.f59250b--;
        }
        if (c10.f59250b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
            c10.f59250b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f59256e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2815u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13757c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f59256e;
        a((f1) arrayList.get(i7), true);
        arrayList.remove(i7);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f59135p.k(U);
        } else if (U.s()) {
            U.f59131l &= -33;
        }
        h(U);
        if (recyclerView.f2794d0 != null && !U.i()) {
            recyclerView.f2794d0.f(U);
        }
    }

    public void h(v4.f1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.h(v4.f1):void");
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.f2794d0) != null && !n0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f59135p = this;
            U.f59136q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2819x.f59159b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f59135p = this;
            U.f59136q = false;
            ((ArrayList) this.f59255c).add(U);
        }
    }

    public v4.f1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.j(int, long):v4.f1");
    }

    public void k(f1 f1Var) {
        if (f1Var.f59136q) {
            ((ArrayList) this.d).remove(f1Var);
        } else {
            ((ArrayList) this.f59255c).remove(f1Var);
        }
        f1Var.f59135p = null;
        f1Var.f59136q = false;
        f1Var.f59131l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f59256e;
        p0 p0Var = ((RecyclerView) this.h).f2821y;
        if (p0Var != null) {
            i7 = p0Var.f59212i;
        } else {
            i7 = 0;
        }
        this.f59254b = this.f59253a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f59254b; size--) {
            f(size);
        }
    }

    public x0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f59255c = arrayList;
        this.d = null;
        this.f59256e = new ArrayList();
        this.f59257f = DesugarCollections.unmodifiableList(arrayList);
        this.f59253a = 2;
        this.f59254b = 2;
    }
}
