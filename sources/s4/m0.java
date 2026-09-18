package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uk0;
public abstract class m0 {
    public l.d f43008a;
    public ArrayList f43009b;
    public long f43010c;
    public long d;
    public long e;
    public long f43011f;
    public long f43012g;
    public TimeInterpolator h;
    public TimeInterpolator f43013i;
    public TimeInterpolator f43014j;
    public TimeInterpolator f43015k;
    public long f43016l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42937l;
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
        l.d dVar = this.f43008a;
        if (dVar != null) {
            RecyclerView recyclerView = (RecyclerView) dVar.f13859a;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42929a;
            if (c1Var.f42935j != null && c1Var.f42936k == null) {
                c1Var.f42935j = null;
            }
            c1Var.f42936k = null;
            if ((c1Var.f42937l & 16) == 0) {
                of.e eVar = recyclerView.f2840b;
                recyclerView.z0();
                lf.i iVar = recyclerView.e;
                e6.n nVar = (e6.n) iVar.f14180c;
                ka.c cVar = (ka.c) iVar.f14179b;
                int indexOfChild = ((RecyclerView) cVar.f13565b).indexOfChild(view);
                if (indexOfChild == -1) {
                    iVar.Y(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    iVar.Y(view);
                    cVar.j0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    c1 V = RecyclerView.V(view);
                    eVar.k(V);
                    eVar.h(V);
                }
                recyclerView.A0(!z10);
                if (!z10 && c1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f43009b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            uk0 uk0Var = (uk0) arrayList.get(i10);
            uk0Var.f28723a.d(uk0Var.f28724b, uk0Var.f28725c, uk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f43010c;
    }

    public long i() {
        return Math.max(this.f43011f, this.f43012g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42929a;
        obj.f3203a = view.getLeft();
        obj.f3204b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f43010c = j3;
        this.e = j3;
        this.d = j3;
        this.f43011f = j3;
        this.f43012g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f43013i = timeInterpolator;
        this.f43014j = timeInterpolator;
        this.f43015k = timeInterpolator;
    }
}
