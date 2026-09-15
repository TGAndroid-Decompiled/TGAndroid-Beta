package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.e3;
import org.telegram.ui.Components.jk0;
public abstract class m0 {
    public ka.c f42754a;
    public ArrayList f42755b;
    public long f42756c;
    public long d;
    public long e;
    public long f42757f;
    public long f42758g;
    public TimeInterpolator h;
    public TimeInterpolator f42759i;
    public TimeInterpolator f42760j;
    public TimeInterpolator f42761k;
    public long f42762l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42683l;
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
        ka.c cVar = this.f42754a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f13564b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42675a;
            if (c1Var.f42681j != null && c1Var.f42682k == null) {
                c1Var.f42681j = null;
            }
            c1Var.f42682k = null;
            if ((c1Var.f42683l & 16) == 0) {
                of.e eVar = recyclerView.f2835b;
                recyclerView.y0();
                e3 e3Var = recyclerView.e;
                e6.n nVar = (e6.n) e3Var.f14166c;
                k2.c0 c0Var = (k2.c0) e3Var.f14165b;
                int indexOfChild = ((RecyclerView) c0Var.f13234b).indexOfChild(view);
                if (indexOfChild == -1) {
                    e3Var.X(view);
                } else if (nVar.z(indexOfChild)) {
                    nVar.B(indexOfChild);
                    e3Var.X(view);
                    c0Var.r(indexOfChild);
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
        ArrayList arrayList = this.f42755b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jk0 jk0Var = (jk0) arrayList.get(i10);
            jk0Var.f25367a.d(jk0Var.f25368b, jk0Var.f25369c, jk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f42756c;
    }

    public long i() {
        return Math.max(this.f42757f, this.f42758g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42675a;
        obj.f3198a = view.getLeft();
        obj.f3199b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f42756c = j3;
        this.e = j3;
        this.d = j3;
        this.f42757f = j3;
        this.f42758g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f42759i = timeInterpolator;
        this.f42760j = timeInterpolator;
        this.f42761k = timeInterpolator;
    }
}
