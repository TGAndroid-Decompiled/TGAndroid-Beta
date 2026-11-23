package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class x0 {
    public int f59378a;
    public int f59379b;
    public final Serializable f59380c;
    public Object d;
    public final Serializable f59381e;
    public Object f59382f;
    public Object f59383g;
    public Object h;

    public x0(Uri uri, String str, String str2) {
        this.f59380c = str;
        this.d = uri;
        this.f59381e = str2;
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.m(f1Var);
        if (f1Var.e(16384)) {
            f1Var.p(0, 16384);
            r0.i0.j(f1Var.f59245a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            i0 i0Var = recyclerView.f2791x;
            if (i0Var != null) {
                i0Var.A(f1Var);
            }
            if (recyclerView.f2788v0 != null) {
                recyclerView.f2769f.i(f1Var);
            }
        }
        f1Var.f59262t = null;
        w0 c10 = c();
        c10.getClass();
        int i7 = f1Var.f59249f;
        ArrayList arrayList = c10.b(i7).f59368a;
        if (((v0) c10.f59374a.get(i7)).f59369b <= arrayList.size()) {
            return;
        }
        f1Var.o();
        arrayList.add(f1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2788v0.b()) {
            if (!recyclerView.f2788v0.f59215g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2788v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public w0 c() {
        if (((w0) this.f59383g) == null) {
            this.f59383g = new w0();
        }
        return (w0) this.f59383g;
    }

    public void d(i0 i0Var, i0 i0Var2) {
        ((ArrayList) this.f59380c).clear();
        e();
        w0 c10 = c();
        if (i0Var != null) {
            c10.f59375b--;
        }
        if (c10.f59375b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
            c10.f59375b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f59381e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2787u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13749c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f59381e;
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
            U.f59258p.k(U);
        } else if (U.s()) {
            U.f59254l &= -33;
        }
        h(U);
        if (recyclerView.f2766d0 != null && !U.i()) {
            recyclerView.f2766d0.f(U);
        }
    }

    public void h(v4.f1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.h(v4.f1):void");
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.f2766d0) != null && !n0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f59258p = this;
            U.f59259q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2791x.f59281b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f59258p = this;
            U.f59259q = false;
            ((ArrayList) this.f59380c).add(U);
        }
    }

    public v4.f1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.j(int, long):v4.f1");
    }

    public void k(f1 f1Var) {
        if (f1Var.f59259q) {
            ((ArrayList) this.d).remove(f1Var);
        } else {
            ((ArrayList) this.f59380c).remove(f1Var);
        }
        f1Var.f59258p = null;
        f1Var.f59259q = false;
        f1Var.f59254l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f59381e;
        p0 p0Var = ((RecyclerView) this.h).f2793y;
        if (p0Var != null) {
            i7 = p0Var.f59337i;
        } else {
            i7 = 0;
        }
        this.f59379b = this.f59378a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f59379b; size--) {
            f(size);
        }
    }

    public x0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f59380c = arrayList;
        this.d = null;
        this.f59381e = new ArrayList();
        this.f59382f = DesugarCollections.unmodifiableList(arrayList);
        this.f59378a = 2;
        this.f59379b = 2;
    }
}
