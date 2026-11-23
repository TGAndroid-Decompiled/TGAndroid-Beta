package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class w0 {
    public int f59243a;
    public int f59244b;
    public final Serializable f59245c;
    public Object d;
    public final Serializable f59246e;
    public Object f59247f;
    public Object f59248g;
    public Object h;

    public w0(Uri uri, String str, String str2) {
        this.f59245c = str;
        this.d = uri;
        this.f59246e = str2;
    }

    public void a(e1 e1Var, boolean z10) {
        RecyclerView.m(e1Var);
        if (e1Var.e(16384)) {
            e1Var.p(0, 16384);
            r0.i0.j(e1Var.f59111a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2790x;
            if (h0Var != null) {
                h0Var.A(e1Var);
            }
            if (recyclerView.f2787v0 != null) {
                recyclerView.f2768f.i(e1Var);
            }
        }
        e1Var.f59128t = null;
        v0 c10 = c();
        c10.getClass();
        int i7 = e1Var.f59115f;
        ArrayList arrayList = c10.b(i7).f59233a;
        if (((u0) c10.f59239a.get(i7)).f59234b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2787v0.b()) {
            if (!recyclerView.f2787v0.f59080g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2787v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public v0 c() {
        if (((v0) this.f59248g) == null) {
            this.f59248g = new v0();
        }
        return (v0) this.f59248g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f59245c).clear();
        e();
        v0 c10 = c();
        if (h0Var != null) {
            c10.f59240b--;
        }
        if (c10.f59240b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f59240b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f59246e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2786u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13749c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f59246e;
        a((e1) arrayList.get(i7), true);
        arrayList.remove(i7);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f59124p.k(U);
        } else if (U.s()) {
            U.f59120l &= -33;
        }
        h(U);
        if (recyclerView.f2765d0 != null && !U.i()) {
            recyclerView.f2765d0.f(U);
        }
    }

    public void h(v4.e1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.w0.h(v4.e1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f2765d0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f59124p = this;
            U.f59125q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2790x.f59146b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f59124p = this;
            U.f59125q = false;
            ((ArrayList) this.f59245c).add(U);
        }
    }

    public v4.e1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.w0.j(int, long):v4.e1");
    }

    public void k(e1 e1Var) {
        if (e1Var.f59125q) {
            ((ArrayList) this.d).remove(e1Var);
        } else {
            ((ArrayList) this.f59245c).remove(e1Var);
        }
        e1Var.f59124p = null;
        e1Var.f59125q = false;
        e1Var.f59120l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f59246e;
        o0 o0Var = ((RecyclerView) this.h).f2792y;
        if (o0Var != null) {
            i7 = o0Var.f59202i;
        } else {
            i7 = 0;
        }
        this.f59244b = this.f59243a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f59244b; size--) {
            f(size);
        }
    }

    public w0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f59245c = arrayList;
        this.d = null;
        this.f59246e = new ArrayList();
        this.f59247f = DesugarCollections.unmodifiableList(arrayList);
        this.f59243a = 2;
        this.f59244b = 2;
    }
}
