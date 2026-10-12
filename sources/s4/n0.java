package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.f3;
import org.telegram.ui.Components.ul0;
public abstract class n0 {
    public hh.g f47979a;
    public ArrayList f47980b;
    public long f47981c;
    public long d;
    public long f47982e;
    public long f47983f;
    public long f47984g;
    public TimeInterpolator h;
    public TimeInterpolator f47985i;
    public TimeInterpolator f47986j;
    public TimeInterpolator f47987k;
    public long f47988l;

    public static int b(d1 d1Var) {
        int i10 = d1Var.f47898l;
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
        hh.g gVar = this.f47979a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f11509a;
            boolean z10 = true;
            d1Var.q(true);
            View view = d1Var.f47889a;
            if (d1Var.f47896j != null && d1Var.f47897k == null) {
                d1Var.f47896j = null;
            }
            d1Var.f47897k = null;
            if ((d1Var.f47898l & 16) == 0) {
                pf.e eVar = recyclerView.f3138b;
                recyclerView.y0();
                f3 f3Var = recyclerView.f3143e;
                e6.n nVar = (e6.n) f3Var.f15424c;
                k2.g0 g0Var = (k2.g0) f3Var.f15423b;
                int indexOfChild = ((RecyclerView) g0Var.f14466b).indexOfChild(view);
                if (indexOfChild == -1) {
                    f3Var.Y(view);
                } else if (nVar.y(indexOfChild)) {
                    nVar.A(indexOfChild);
                    f3Var.Y(view);
                    g0Var.f(indexOfChild);
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
        ArrayList arrayList = this.f47980b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ul0 ul0Var = (ul0) arrayList.get(i10);
            ul0Var.f31199a.d(ul0Var.f31200b, ul0Var.f31201c, ul0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f47981c;
    }

    public long i() {
        return Math.max(this.f47983f, this.f47984g);
    }

    public long j() {
        return this.f47982e;
    }

    public abstract boolean k();

    public b2.q0 l(a1 a1Var, d1 d1Var, int i10, List list) {
        ?? obj = new Object();
        View view = d1Var.f47889a;
        obj.f3531a = view.getLeft();
        obj.f3532b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f47981c = j3;
        this.f47982e = j3;
        this.d = j3;
        this.f47983f = j3;
        this.f47984g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47985i = timeInterpolator;
        this.f47986j = timeInterpolator;
        this.f47987k = timeInterpolator;
    }
}
