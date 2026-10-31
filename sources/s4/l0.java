package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.qj0;
public abstract class l0 {
    public n2.u f47965a;
    public ArrayList f47966b;
    public long f47967c;
    public long d;
    public long e;
    public long f47968f;
    public long f47969g;
    public TimeInterpolator h;
    public TimeInterpolator f47970i;
    public TimeInterpolator f47971j;
    public TimeInterpolator f47972k;
    public long f47973l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f47906l;
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
        n2.u uVar = this.f47965a;
        if (uVar != null) {
            RecyclerView recyclerView = (RecyclerView) uVar.f13480b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f47898a;
            if (c1Var.f47904j != null && c1Var.f47905k == null) {
                c1Var.f47904j = null;
            }
            c1Var.f47905k = null;
            if ((c1Var.f47906l & 16) == 0) {
                hf.e eVar = recyclerView.f1894b;
                recyclerView.z0();
                q5.d dVar = recyclerView.e;
                c3.g0 g0Var = (c3.g0) dVar.f45488c;
                m2.t tVar = (m2.t) dVar.f45487b;
                int indexOfChild = ((RecyclerView) tVar.f12684b).indexOfChild(view);
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
        ArrayList arrayList = this.f47966b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            qj0 qj0Var = (qj0) arrayList.get(i10);
            qj0Var.f29669a.d(qj0Var.f29670b, qj0Var.f29671c, qj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f47967c;
    }

    public long i() {
        return Math.max(this.f47968f, this.f47969g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public ac.g l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f47898a;
        obj.f385a = view.getLeft();
        obj.f386b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f47967c = j10;
        this.e = j10;
        this.d = j10;
        this.f47968f = j10;
        this.f47969g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47970i = timeInterpolator;
        this.f47971j = timeInterpolator;
        this.f47972k = timeInterpolator;
    }
}
