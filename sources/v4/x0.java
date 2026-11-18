package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class x0 {
    public int f59254a;
    public int f59255b;
    public final Serializable f59256c;
    public Object d;
    public final Serializable f59257e;
    public Object f59258f;
    public Object f59259g;
    public Object h;

    public x0(Uri uri, String str, String str2) {
        this.f59256c = str;
        this.d = uri;
        this.f59257e = str2;
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.m(f1Var);
        if (f1Var.e(16384)) {
            f1Var.p(0, 16384);
            r0.i0.j(f1Var.f59123a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            i0 i0Var = recyclerView.f2820x;
            if (i0Var != null) {
                i0Var.A(f1Var);
            }
            if (recyclerView.f2817v0 != null) {
                recyclerView.f2798f.i(f1Var);
            }
        }
        f1Var.f59140t = null;
        w0 c10 = c();
        c10.getClass();
        int i7 = f1Var.f59127f;
        ArrayList arrayList = c10.b(i7).f59244a;
        if (((v0) c10.f59250a.get(i7)).f59245b <= arrayList.size()) {
            return;
        }
        f1Var.o();
        arrayList.add(f1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2817v0.b()) {
            if (!recyclerView.f2817v0.f59091g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2817v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public w0 c() {
        if (((w0) this.f59259g) == null) {
            this.f59259g = new w0();
        }
        return (w0) this.f59259g;
    }

    public void d(i0 i0Var, i0 i0Var2) {
        ((ArrayList) this.f59256c).clear();
        e();
        w0 c10 = c();
        if (i0Var != null) {
            c10.f59251b--;
        }
        if (c10.f59251b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
            c10.f59251b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f59257e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2816u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13754c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f59257e;
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
            U.f59136p.k(U);
        } else if (U.s()) {
            U.f59132l &= -33;
        }
        h(U);
        if (recyclerView.f2795d0 != null && !U.i()) {
            recyclerView.f2795d0.f(U);
        }
    }

    public void h(v4.f1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.h(v4.f1):void");
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.f2795d0) != null && !n0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f59136p = this;
            U.f59137q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2820x.f59160b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f59136p = this;
            U.f59137q = false;
            ((ArrayList) this.f59256c).add(U);
        }
    }

    public v4.f1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.j(int, long):v4.f1");
    }

    public void k(f1 f1Var) {
        if (f1Var.f59137q) {
            ((ArrayList) this.d).remove(f1Var);
        } else {
            ((ArrayList) this.f59256c).remove(f1Var);
        }
        f1Var.f59136p = null;
        f1Var.f59137q = false;
        f1Var.f59132l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f59257e;
        p0 p0Var = ((RecyclerView) this.h).f2822y;
        if (p0Var != null) {
            i7 = p0Var.f59213i;
        } else {
            i7 = 0;
        }
        this.f59255b = this.f59254a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f59255b; size--) {
            f(size);
        }
    }

    public x0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f59256c = arrayList;
        this.d = null;
        this.f59257e = new ArrayList();
        this.f59258f = DesugarCollections.unmodifiableList(arrayList);
        this.f59254a = 2;
        this.f59255b = 2;
    }
}
