package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.rj0;
public abstract class l0 {
    public n2.u f47976a;
    public ArrayList f47977b;
    public long f47978c;
    public long d;
    public long e;
    public long f47979f;
    public long f47980g;
    public TimeInterpolator h;
    public TimeInterpolator f47981i;
    public TimeInterpolator f47982j;
    public TimeInterpolator f47983k;
    public long f47984l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f47917l;
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

    public abstract boolean a(c1 c1Var, ac.g gVar, ac.g gVar2);

    public abstract boolean c(c1 c1Var, List list);

    public final void d(c1 c1Var) {
        n2.u uVar = this.f47976a;
        if (uVar != null) {
            RecyclerView recyclerView = (RecyclerView) uVar.f13481b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f47909a;
            if (c1Var.f47915j != null && c1Var.f47916k == null) {
                c1Var.f47915j = null;
            }
            c1Var.f47916k = null;
            if ((c1Var.f47917l & 16) == 0) {
                hf.e eVar = recyclerView.f1894b;
                recyclerView.z0();
                q5.d dVar = recyclerView.e;
                c3.g0 g0Var = (c3.g0) dVar.f45499c;
                m2.t tVar = (m2.t) dVar.f45498b;
                int indexOfChild = ((RecyclerView) tVar.f12685b).indexOfChild(view);
                if (indexOfChild == -1) {
                    dVar.y(view);
                } else if (g0Var.F(indexOfChild)) {
                    g0Var.H(indexOfChild);
                    dVar.y(view);
                    tVar.J(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    c1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && c1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f47977b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            rj0 rj0Var = (rj0) arrayList.get(i10);
            rj0Var.f30006a.d(rj0Var.f30007b, rj0Var.f30008c, rj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f47978c;
    }

    public long i() {
        return Math.max(this.f47979f, this.f47980g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public ac.g l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f47909a;
        obj.f385a = view.getLeft();
        obj.f386b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f47978c = j10;
        this.e = j10;
        this.d = j10;
        this.f47979f = j10;
        this.f47980g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47981i = timeInterpolator;
        this.f47982j = timeInterpolator;
        this.f47983k = timeInterpolator;
    }
}
