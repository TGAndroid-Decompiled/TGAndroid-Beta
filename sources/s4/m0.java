package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.wk0;
public abstract class m0 {
    public l.d f43084a;
    public ArrayList f43085b;
    public long f43086c;
    public long d;
    public long e;
    public long f43087f;
    public long f43088g;
    public TimeInterpolator h;
    public TimeInterpolator f43089i;
    public TimeInterpolator f43090j;
    public TimeInterpolator f43091k;
    public long f43092l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f43013l;
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
        l.d dVar = this.f43084a;
        if (dVar != null) {
            RecyclerView recyclerView = (RecyclerView) dVar.f13926a;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f43005a;
            if (c1Var.f43011j != null && c1Var.f43012k == null) {
                c1Var.f43011j = null;
            }
            c1Var.f43012k = null;
            if ((c1Var.f43013l & 16) == 0) {
                of.e eVar = recyclerView.f2834b;
                recyclerView.z0();
                la.h hVar = recyclerView.e;
                e6.n nVar = (e6.n) hVar.f14169c;
                ka.c cVar = (ka.c) hVar.f14168b;
                int indexOfChild = ((RecyclerView) cVar.f13554b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar.Y(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    hVar.Y(view);
                    cVar.W(indexOfChild);
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
        ArrayList arrayList = this.f43085b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            wk0 wk0Var = (wk0) arrayList.get(i10);
            wk0Var.f30038a.d(wk0Var.f30039b, wk0Var.f30040c, wk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f43086c;
    }

    public long i() {
        return Math.max(this.f43087f, this.f43088g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f43005a;
        obj.f3197a = view.getLeft();
        obj.f3198b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f43086c = j3;
        this.e = j3;
        this.d = j3;
        this.f43087f = j3;
        this.f43088g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f43089i = timeInterpolator;
        this.f43090j = timeInterpolator;
        this.f43091k = timeInterpolator;
    }
}
