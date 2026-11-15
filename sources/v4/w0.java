package v4;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
public final class w0 {
    public int f58668a;
    public int f58669b;
    public final Serializable f58670c;
    public Object d;
    public final Serializable f58671e;
    public Object f58672f;
    public Object f58673g;
    public Object h;

    public w0(Uri uri, String str, String str2) {
        this.f58670c = str;
        this.d = uri;
        this.f58671e = str2;
    }

    public void a(e1 e1Var, boolean z10) {
        RecyclerView.m(e1Var);
        if (e1Var.e(16384)) {
            e1Var.p(0, 16384);
            r0.i0.j(e1Var.f58535a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2825x;
            if (h0Var != null) {
                h0Var.A(e1Var);
            }
            if (recyclerView.f2822v0 != null) {
                recyclerView.f2803f.i(e1Var);
            }
        }
        e1Var.f58552t = null;
        v0 c10 = c();
        c10.getClass();
        int i7 = e1Var.f58539f;
        ArrayList arrayList = c10.b(i7).f58658a;
        if (((u0) c10.f58664a.get(i7)).f58659b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public int b(int i7) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i7 >= 0 && i7 < recyclerView.f2822v0.b()) {
            if (!recyclerView.f2822v0.f58505g) {
                return i7;
            }
            return recyclerView.d.f(i7, 0);
        }
        StringBuilder m10 = i5.c.m(i7, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2822v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public v0 c() {
        if (((v0) this.f58673g) == null) {
            this.f58673g = new v0();
        }
        return (v0) this.f58673g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f58670c).clear();
        e();
        v0 c10 = c();
        if (h0Var != null) {
            c10.f58665b--;
        }
        if (c10.f58665b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f58665b++;
        } else {
            c10.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f58671e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        h2.f fVar = ((RecyclerView) this.h).f2821u0;
        int[] iArr2 = fVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.f13442c = 0;
    }

    public void f(int i7) {
        ArrayList arrayList = (ArrayList) this.f58671e;
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
            U.f58548p.k(U);
        } else if (U.s()) {
            U.f58544l &= -33;
        }
        h(U);
        if (recyclerView.f2800d0 != null && !U.i()) {
            recyclerView.f2800d0.f(U);
        }
    }

    public void h(v4.e1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: v4.w0.h(v4.e1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f2800d0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f58548p = this;
            U.f58549q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2825x.f58571b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f58548p = this;
            U.f58549q = false;
            ((ArrayList) this.f58670c).add(U);
        }
    }

    public v4.e1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: v4.w0.j(int, long):v4.e1");
    }

    public void k(e1 e1Var) {
        if (e1Var.f58549q) {
            ((ArrayList) this.d).remove(e1Var);
        } else {
            ((ArrayList) this.f58670c).remove(e1Var);
        }
        e1Var.f58548p = null;
        e1Var.f58549q = false;
        e1Var.f58544l &= -33;
    }

    public void l() {
        int i7;
        ArrayList arrayList = (ArrayList) this.f58671e;
        o0 o0Var = ((RecyclerView) this.h).f2827y;
        if (o0Var != null) {
            i7 = o0Var.f58627i;
        } else {
            i7 = 0;
        }
        this.f58669b = this.f58668a + i7;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f58669b; size--) {
            f(size);
        }
    }

    public w0(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f58670c = arrayList;
        this.d = null;
        this.f58671e = new ArrayList();
        this.f58672f = DesugarCollections.unmodifiableList(arrayList);
        this.f58668a = 2;
        this.f58669b = 2;
    }
}
