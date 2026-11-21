package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class x0 {
    public int f59292a;
    public int f59293b;
    public final Serializable f59294c;
    public Object d;
    public final Serializable f59295e;
    public Object f59296f;
    public Object f59297g;
    public Object h;

    public x0(Uri uri, String str, String str2) {
        this.f59294c = str;
        this.d = uri;
        this.f59295e = str2;
    }

    public void a(f1 f1Var, boolean z10) {
        RecyclerView.m(f1Var);
        if (f1Var.e(16384)) {
            f1Var.p(0, 16384);
            r0.i0.j(f1Var.f59161a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            i0 i0Var = recyclerView.f2832x;
            if (i0Var != null) {
                i0Var.A(f1Var);
            }
            if (recyclerView.f2829v0 != null) {
                recyclerView.f2810f.i(f1Var);
            }
        }
        f1Var.f59178t = null;
        w0 c10 = c();
        c10.getClass();
        int i7 = f1Var.f59165f;
        ArrayList arrayList = c10.b(i7).f59282a;
        if (((v0) c10.f59288a.get(i7)).f59283b <= arrayList.size()) {
            return;
        }
        f1Var.o();
        arrayList.add(f1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2829v0.b()) {
            if (!recyclerView.f2829v0.f59129g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2829v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public w0 c() {
        if (((w0) this.f59297g) == null) {
            this.f59297g = new w0();
        }
        return (w0) this.f59297g;
    }

    public void d(i0 i0Var, i0 i0Var2) {
        ((ArrayList) this.f59294c).clear();
        e();
        w0 c10 = c();
        if (i0Var != null) {
            c10.f59289b--;
        }
        if (c10.f59289b == 0) {
            c10.a();
        }
        if (i0Var2 != null) {
            c10.f59289b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f59295e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2828u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13783c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f59295e;
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
            U.f59174p.k(U);
        } else if (U.s()) {
            U.f59170l &= -33;
        }
        h(U);
        if (recyclerView.f2807d0 != null && !U.i()) {
            recyclerView.f2807d0.f(U);
        }
    }

    public void h(v4.f1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.h(v4.f1):void");
    }

    public void i(View view) {
        n0 n0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        f1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (n0Var = recyclerView.f2807d0) != null && !n0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f59174p = this;
            U.f59175q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2832x.f59198b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f59174p = this;
            U.f59175q = false;
            ((ArrayList) this.f59294c).add(U);
        }
    }

    public v4.f1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.x0.j(int, long):v4.f1");
    }

    public void k(f1 f1Var) {
        if (f1Var.f59175q) {
            ((ArrayList) this.d).remove(f1Var);
        } else {
            ((ArrayList) this.f59294c).remove(f1Var);
        }
        f1Var.f59174p = null;
        f1Var.f59175q = false;
        f1Var.f59170l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f59295e;
        p0 p0Var = ((RecyclerView) this.h).f2834y;
        if (p0Var != null) {
            i7 = p0Var.f59251i;
        } else {
            i7 = 0;
        }
        this.f59293b = this.f59292a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f59293b; size--) {
            f(size);
        }
    }

    public x0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f59294c = arrayList;
        this.d = null;
        this.f59295e = new ArrayList();
        this.f59296f = DesugarCollections.unmodifiableList(arrayList);
        this.f59292a = 2;
        this.f59293b = 2;
    }
}
