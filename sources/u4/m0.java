package u4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.pi0;
public abstract class m0 {
    public g0 f55614a;
    public ArrayList f55615b;
    public long f55616c;
    public long d;
    public long f55617e;
    public long f55618f;
    public long f55619g;
    public TimeInterpolator h;
    public TimeInterpolator f55620i;
    public TimeInterpolator f55621j;
    public TimeInterpolator f55622k;
    public long f55623l;

    public static int b(d1 d1Var) {
        int i3 = d1Var.f55549l;
        int i10 = i3 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i3 & 4) == 0) {
            int i11 = d1Var.d;
            int b10 = d1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        g0 g0Var = this.f55614a;
        if (g0Var != null) {
            RecyclerView recyclerView = g0Var.f55573a;
            boolean z10 = true;
            d1Var.q(true);
            View view = d1Var.f55540a;
            if (d1Var.f55547j != null && d1Var.f55548k == null) {
                d1Var.f55547j = null;
            }
            d1Var.f55548k = null;
            if ((d1Var.f55549l & 16) == 0) {
                tf.e eVar = recyclerView.f2274b;
                recyclerView.z0();
                p7.d dVar = recyclerView.f2279e;
                ig igVar = (ig) dVar.d;
                nh nhVar = (nh) dVar.f53345b;
                int indexOfChild = ((RecyclerView) nhVar.f36540b).indexOfChild(view);
                if (indexOfChild == -1) {
                    dVar.H(view);
                } else if (igVar.E(indexOfChild)) {
                    igVar.G(indexOfChild);
                    dVar.H(view);
                    nhVar.I(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    d1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && d1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f55615b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            pi0 pi0Var = (pi0) arrayList.get(i3);
            pi0Var.f37156a.d(pi0Var.f37157b, pi0Var.f37158c, pi0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f55616c;
    }

    public long i() {
        return Math.max(this.f55618f, this.f55619g);
    }

    public long j() {
        return this.f55617e;
    }

    public abstract boolean k();

    public d2.t0 l(a1 a1Var, d1 d1Var, int i3, List list) {
        ?? obj = new Object();
        View view = d1Var.f55540a;
        obj.f8413a = view.getLeft();
        obj.f8414b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f55616c = j10;
        this.f55617e = j10;
        this.d = j10;
        this.f55618f = j10;
        this.f55619g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f55620i = timeInterpolator;
        this.f55621j = timeInterpolator;
        this.f55622k = timeInterpolator;
    }
}
