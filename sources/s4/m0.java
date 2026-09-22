package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.wk0;
public abstract class m0 {
    public hh.h f43074a;
    public ArrayList f43075b;
    public long f43076c;
    public long d;
    public long e;
    public long f43077f;
    public long f43078g;
    public TimeInterpolator h;
    public TimeInterpolator f43079i;
    public TimeInterpolator f43080j;
    public TimeInterpolator f43081k;
    public long f43082l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f43003l;
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
        hh.h hVar = this.f43074a;
        if (hVar != null) {
            RecyclerView recyclerView = hVar.f10535a;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42995a;
            if (c1Var.f43001j != null && c1Var.f43002k == null) {
                c1Var.f43001j = null;
            }
            c1Var.f43002k = null;
            if ((c1Var.f43003l & 16) == 0) {
                of.e eVar = recyclerView.f2839b;
                recyclerView.z0();
                lf.h hVar2 = recyclerView.e;
                e6.n nVar = (e6.n) hVar2.f14231c;
                o0.b bVar = (o0.b) hVar2.f14230b;
                int indexOfChild = ((RecyclerView) bVar.f15487b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar2.Y(view);
                } else if (nVar.z(indexOfChild)) {
                    nVar.B(indexOfChild);
                    hVar2.Y(view);
                    bVar.l(indexOfChild);
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
        ArrayList arrayList = this.f43075b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            wk0 wk0Var = (wk0) arrayList.get(i10);
            wk0Var.f30035a.d(wk0Var.f30036b, wk0Var.f30037c, wk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f43076c;
    }

    public long i() {
        return Math.max(this.f43077f, this.f43078g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42995a;
        obj.f3202a = view.getLeft();
        obj.f3203b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f43076c = j3;
        this.e = j3;
        this.d = j3;
        this.f43077f = j3;
        this.f43078g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f43079i = timeInterpolator;
        this.f43080j = timeInterpolator;
        this.f43081k = timeInterpolator;
    }
}
