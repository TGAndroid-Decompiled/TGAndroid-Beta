package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.e3;
import org.telegram.ui.Components.tk0;
public abstract class m0 {
    public l2.g f41689a;
    public ArrayList f41690b;
    public long f41691c;
    public long d;
    public long e;
    public long f41692f;
    public long f41693g;
    public TimeInterpolator h;
    public TimeInterpolator f41694i;
    public TimeInterpolator f41695j;
    public TimeInterpolator f41696k;
    public long f41697l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f41618l;
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
        l2.g gVar = this.f41689a;
        if (gVar != null) {
            RecyclerView recyclerView = (RecyclerView) gVar.f12719b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f41610a;
            if (c1Var.f41616j != null && c1Var.f41617k == null) {
                c1Var.f41616j = null;
            }
            c1Var.f41617k = null;
            if ((c1Var.f41618l & 16) == 0) {
                of.e eVar = recyclerView.f1532b;
                recyclerView.y0();
                e3 e3Var = recyclerView.e;
                e6.n nVar = (e6.n) e3Var.f13002c;
                gh.h hVar = (gh.h) e3Var.f13001b;
                int indexOfChild = hVar.f9143a.indexOfChild(view);
                if (indexOfChild == -1) {
                    e3Var.X(view);
                } else if (nVar.z(indexOfChild)) {
                    nVar.C(indexOfChild);
                    e3Var.X(view);
                    hVar.a(indexOfChild);
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
        ArrayList arrayList = this.f41690b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            tk0 tk0Var = (tk0) arrayList.get(i10);
            tk0Var.f27433a.c(tk0Var.f27434b, tk0Var.f27435c, tk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f41691c;
    }

    public long i() {
        return Math.max(this.f41692f, this.f41693g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f41610a;
        obj.f1896a = view.getLeft();
        obj.f1897b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f41691c = j3;
        this.e = j3;
        this.d = j3;
        this.f41692f = j3;
        this.f41693g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f41694i = timeInterpolator;
        this.f41695j = timeInterpolator;
        this.f41696k = timeInterpolator;
    }
}
