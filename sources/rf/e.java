package rf;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import r0.i0;
import s4.e1;
import s4.h0;
import s4.m0;
import s4.p0;
import s4.v0;
import s4.w0;
public final class e {
    public int f47344a;
    public int f47345b;
    public final Serializable f47346c;
    public Serializable d;
    public Serializable e;
    public Object f47347f;
    public Object f47348g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f47346c = str;
        this.f47348g = uri;
        this.d = str2;
    }

    public void a(e1 e1Var, boolean z10) {
        RecyclerView.m(e1Var);
        if (e1Var.e(16384)) {
            e1Var.p(0, 16384);
            i0.k(e1Var.f47735a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f3082w;
            if (h0Var != null) {
                h0Var.A(e1Var);
            }
            if (recyclerView.f3080u0 != null) {
                recyclerView.f3062f.z0(e1Var);
            }
        }
        e1Var.f47751t = null;
        w0 c10 = c();
        c10.getClass();
        int i10 = e1Var.f47738f;
        ArrayList arrayList = c10.b(i10).f47847a;
        if (((v0) c10.f47853a.get(i10)).f47848b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public int b(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i10 >= 0 && i10 < recyclerView.f3080u0.b()) {
            if (!recyclerView.f3080u0.f47695g) {
                return i10;
            }
            return recyclerView.d.g(i10, 0);
        }
        StringBuilder k10 = ic.a.k(i10, "invalid position ", ". State item count is ");
        k10.append(recyclerView.f3080u0.b());
        k10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(k10.toString());
    }

    public w0 c() {
        if (((w0) this.f47348g) == null) {
            this.f47348g = new w0();
        }
        return (w0) this.f47348g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f47346c).clear();
        e();
        w0 c10 = c();
        if (h0Var != null) {
            c10.f47854b--;
        }
        if (c10.f47854b == 0) {
            c10.a();
        }
        if (h0Var2 != null) {
            c10.f47854b++;
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
        e2.f fVar = ((RecyclerView) this.h).f3079t0;
        int[] iArr2 = (int[]) fVar.f9658c;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        fVar.d = 0;
    }

    public void f(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        a((e1) arrayList.get(i10), true);
        arrayList.remove(i10);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f47747p.k(U);
        } else if (U.s()) {
            U.f47743l &= -33;
        }
        h(U);
        if (recyclerView.f3059c0 != null && !U.i()) {
            recyclerView.f3059c0.f(U);
        }
    }

    public void h(s4.e1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.h(s4.e1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        e1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f3059c0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f47747p = this;
            U.f47748q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f3082w.f47766b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f47747p = this;
            U.f47748q = false;
            ((ArrayList) this.f47346c).add(U);
        }
    }

    public s4.e1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: rf.e.j(int, long):s4.e1");
    }

    public void k(e1 e1Var) {
        if (e1Var.f47748q) {
            ((ArrayList) this.d).remove(e1Var);
        } else {
            ((ArrayList) this.f47346c).remove(e1Var);
        }
        e1Var.f47747p = null;
        e1Var.f47748q = false;
        e1Var.f47743l &= -33;
    }

    public void l() {
        int i10;
        ArrayList arrayList = (ArrayList) this.e;
        p0 p0Var = ((RecyclerView) this.h).f3084x;
        if (p0Var != null) {
            i10 = p0Var.f47820i;
        } else {
            i10 = 0;
        }
        this.f47345b = this.f47344a + i10;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f47345b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f47346c = arrayList;
        this.d = null;
        this.e = new ArrayList();
        this.f47347f = DesugarCollections.unmodifiableList(arrayList);
        this.f47344a = 2;
        this.f47345b = 2;
    }
}
