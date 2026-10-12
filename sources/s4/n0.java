package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.f3;
import org.telegram.ui.Components.ul0;
public abstract class n0 {
    public hh.g f47987a;
    public ArrayList f47988b;
    public long f47989c;
    public long d;
    public long f47990e;
    public long f47991f;
    public long f47992g;
    public TimeInterpolator h;
    public TimeInterpolator f47993i;
    public TimeInterpolator f47994j;
    public TimeInterpolator f47995k;
    public long f47996l;

    public static int b(d1 d1Var) {
        int i10 = d1Var.f47906l;
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
        hh.g gVar = this.f47987a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f11509a;
            boolean z10 = true;
            d1Var.q(true);
            View view = d1Var.f47897a;
            if (d1Var.f47904j != null && d1Var.f47905k == null) {
                d1Var.f47904j = null;
            }
            d1Var.f47905k = null;
            if ((d1Var.f47906l & 16) == 0) {
                pf.e eVar = recyclerView.f3138b;
                recyclerView.y0();
                f3 f3Var = recyclerView.f3143e;
                e6.n nVar = (e6.n) f3Var.f15425c;
                k2.g0 g0Var = (k2.g0) f3Var.f15424b;
                int indexOfChild = ((RecyclerView) g0Var.f14467b).indexOfChild(view);
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
        ArrayList arrayList = this.f47988b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ul0 ul0Var = (ul0) arrayList.get(i10);
            ul0Var.f31191a.d(ul0Var.f31192b, ul0Var.f31193c, ul0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f47989c;
    }

    public long i() {
        return Math.max(this.f47991f, this.f47992g);
    }

    public long j() {
        return this.f47990e;
    }

    public abstract boolean k();

    public b2.q0 l(a1 a1Var, d1 d1Var, int i10, List list) {
        ?? obj = new Object();
        View view = d1Var.f47897a;
        obj.f3531a = view.getLeft();
        obj.f3532b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f47989c = j3;
        this.f47990e = j3;
        this.d = j3;
        this.f47991f = j3;
        this.f47992g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47993i = timeInterpolator;
        this.f47994j = timeInterpolator;
        this.f47995k = timeInterpolator;
    }
}
