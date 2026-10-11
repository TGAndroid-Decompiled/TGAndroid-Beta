package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.pl0;
public abstract class n0 {
    public hh.g f47872a;
    public ArrayList f47873b;
    public long f47874c;
    public long d;
    public long f47875e;
    public long f47876f;
    public long f47877g;
    public TimeInterpolator h;
    public TimeInterpolator f47878i;
    public TimeInterpolator f47879j;
    public TimeInterpolator f47880k;
    public long f47881l;

    public static int b(d1 d1Var) {
        int i10 = d1Var.f47791l;
        int i11 = i10 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = d1Var.d;
            int b10 = d1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        hh.g gVar = this.f47872a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f11510a;
            boolean z10 = true;
            d1Var.q(true);
            View view = d1Var.f47782a;
            if (d1Var.f47789j != null && d1Var.f47790k == null) {
                d1Var.f47789j = null;
            }
            d1Var.f47790k = null;
            if ((d1Var.f47791l & 16) == 0) {
                pf.e eVar = recyclerView.f3140b;
                recyclerView.y0();
                la.h hVar = recyclerView.f3145e;
                e6.n nVar = (e6.n) hVar.f15502c;
                k2.g0 g0Var = (k2.g0) hVar.f15501b;
                int indexOfChild = ((RecyclerView) g0Var.f14469b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar.Z(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    hVar.Z(view);
                    g0Var.Z0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    d1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.z0(!z10);
                if (!z10 && d1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f47873b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            pl0 pl0Var = (pl0) arrayList.get(i10);
            pl0Var.f29889a.c(pl0Var.f29890b, pl0Var.f29891c, pl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f47874c;
    }

    public long i() {
        return Math.max(this.f47876f, this.f47877g);
    }

    public long j() {
        return this.f47875e;
    }

    public abstract boolean k();

    public b2.q0 l(a1 a1Var, d1 d1Var, int i10, List list) {
        ?? obj = new Object();
        View view = d1Var.f47782a;
        obj.f3533a = view.getLeft();
        obj.f3534b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f47874c = j3;
        this.f47875e = j3;
        this.d = j3;
        this.f47876f = j3;
        this.f47877g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47878i = timeInterpolator;
        this.f47879j = timeInterpolator;
        this.f47880k = timeInterpolator;
    }
}
