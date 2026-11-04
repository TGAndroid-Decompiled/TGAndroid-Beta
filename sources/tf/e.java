package tf;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g2.g;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import k2.p1;
import r0.i0;
import u4.d1;
import u4.h0;
import u4.m0;
import u4.o0;
import u4.u0;
import u4.v0;
public final class e {
    public int f55107a;
    public int f55108b;
    public final Serializable f55109c;
    public Serializable d;
    public Serializable f55110e;
    public Object f55111f;
    public Object f55112g;
    public Object h;

    public e(Uri uri, String str, String str2) {
        this.f55109c = str;
        this.f55112g = uri;
        this.d = str2;
    }

    public void a(d1 d1Var, boolean z10) {
        RecyclerView.m(d1Var);
        if (d1Var.e(16384)) {
            d1Var.p(0, 16384);
            i0.j(d1Var.f55540a, null);
        }
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) this.h;
            h0 h0Var = recyclerView.f2303x;
            if (h0Var != null) {
                h0Var.A(d1Var);
            }
            if (recyclerView.f2300v0 != null) {
                recyclerView.f2281f.W0(d1Var);
            }
        }
        d1Var.f55557t = null;
        v0 c2 = c();
        c2.getClass();
        int i3 = d1Var.f55544f;
        ArrayList arrayList = c2.b(i3).f55666a;
        if (((u0) c2.f55672a.get(i3)).f55667b <= arrayList.size()) {
            return;
        }
        d1Var.o();
        arrayList.add(d1Var);
    }

    public int b(int i3) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        if (i3 >= 0 && i3 < recyclerView.f2300v0.b()) {
            if (!recyclerView.f2300v0.f55495g) {
                return i3;
            }
            return recyclerView.d.f(i3, 0);
        }
        StringBuilder m10 = p1.m(i3, "invalid position ", ". State item count is ");
        m10.append(recyclerView.f2300v0.b());
        m10.append(recyclerView.C());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public v0 c() {
        if (((v0) this.f55112g) == null) {
            this.f55112g = new v0();
        }
        return (v0) this.f55112g;
    }

    public void d(h0 h0Var, h0 h0Var2) {
        ((ArrayList) this.f55109c).clear();
        e();
        v0 c2 = c();
        if (h0Var != null) {
            c2.f55673b--;
        }
        if (c2.f55673b == 0) {
            c2.a();
        }
        if (h0Var2 != null) {
            c2.f55673b++;
        } else {
            c2.getClass();
        }
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.f55110e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.R0;
        g gVar = ((RecyclerView) this.h).f2299u0;
        int[] iArr2 = gVar.d;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        gVar.f11843c = 0;
    }

    public void f(int i3) {
        ArrayList arrayList = (ArrayList) this.f55110e;
        a((d1) arrayList.get(i3), true);
        arrayList.remove(i3);
    }

    public void g(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (U.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (U.k()) {
            U.f55553p.k(U);
        } else if (U.s()) {
            U.f55549l &= -33;
        }
        h(U);
        if (recyclerView.f2278d0 != null && !U.i()) {
            recyclerView.f2278d0.f(U);
        }
    }

    public void h(u4.d1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: tf.e.h(u4.d1):void");
    }

    public void i(View view) {
        m0 m0Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        d1 U = RecyclerView.U(view);
        if (!U.e(12) && U.m() && (m0Var = recyclerView.f2278d0) != null && !m0Var.c(U, U.d())) {
            if (((ArrayList) this.d) == null) {
                this.d = new ArrayList();
            }
            U.f55553p = this;
            U.f55554q = true;
            ((ArrayList) this.d).add(U);
        } else if (U.h() && !U.j() && !recyclerView.f2303x.f55580b) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.C());
        } else {
            U.f55553p = this;
            U.f55554q = false;
            ((ArrayList) this.f55109c).add(U);
        }
    }

    public u4.d1 j(int r29, long r30) {
        throw new UnsupportedOperationException("Method not decompiled: tf.e.j(int, long):u4.d1");
    }

    public void k(d1 d1Var) {
        if (d1Var.f55554q) {
            ((ArrayList) this.d).remove(d1Var);
        } else {
            ((ArrayList) this.f55109c).remove(d1Var);
        }
        d1Var.f55553p = null;
        d1Var.f55554q = false;
        d1Var.f55549l &= -33;
    }

    public void l() {
        int i3;
        ArrayList arrayList = (ArrayList) this.f55110e;
        o0 o0Var = ((RecyclerView) this.h).f2305y;
        if (o0Var != null) {
            i3 = o0Var.f55635i;
        } else {
            i3 = 0;
        }
        this.f55108b = this.f55107a + i3;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f55108b; size--) {
            f(size);
        }
    }

    public e(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f55109c = arrayList;
        this.d = null;
        this.f55110e = new ArrayList();
        this.f55111f = DesugarCollections.unmodifiableList(arrayList);
        this.f55107a = 2;
        this.f55108b = 2;
    }
}
