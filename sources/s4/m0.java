package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uk0;
public abstract class m0 {
    public l.d f43039a;
    public ArrayList f43040b;
    public long f43041c;
    public long d;
    public long e;
    public long f43042f;
    public long f43043g;
    public TimeInterpolator h;
    public TimeInterpolator f43044i;
    public TimeInterpolator f43045j;
    public TimeInterpolator f43046k;
    public long f43047l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42968l;
        int i11 = i10 & 14;
        if (c1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = c1Var.d;
            int b10 = c1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2);

    public abstract boolean c(c1 c1Var, List list);

    public final void d(c1 c1Var) {
        l.d dVar = this.f43039a;
        if (dVar != null) {
            RecyclerView recyclerView = (RecyclerView) dVar.f13924a;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42960a;
            if (c1Var.f42966j != null && c1Var.f42967k == null) {
                c1Var.f42966j = null;
            }
            c1Var.f42967k = null;
            if ((c1Var.f42968l & 16) == 0) {
                of.e eVar = recyclerView.f2832b;
                recyclerView.y0();
                la.h hVar = recyclerView.e;
                e6.n nVar = (e6.n) hVar.f14167c;
                ka.c cVar = (ka.c) hVar.f14166b;
                int indexOfChild = ((RecyclerView) cVar.f13552b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar.Y(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    hVar.Y(view);
                    cVar.j0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    c1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.z0(!z10);
                if (!z10 && c1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f43040b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            uk0 uk0Var = (uk0) arrayList.get(i10);
            uk0Var.f28806a.c(uk0Var.f28807b, uk0Var.f28808c, uk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f43041c;
    }

    public long i() {
        return Math.max(this.f43042f, this.f43043g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42960a;
        obj.f3195a = view.getLeft();
        obj.f3196b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f43041c = j3;
        this.e = j3;
        this.d = j3;
        this.f43042f = j3;
        this.f43043g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f43044i = timeInterpolator;
        this.f43045j = timeInterpolator;
        this.f43046k = timeInterpolator;
    }
}
