package s4;

import a8.lg;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import li.h5;
import org.telegram.ui.Components.jl0;
public abstract class m0 {
    public h5 f47798a;
    public ArrayList f47799b;
    public long f47800c;
    public long d;
    public long e;
    public long f47801f;
    public long f47802g;
    public TimeInterpolator h;
    public TimeInterpolator f47803i;
    public TimeInterpolator f47804j;
    public TimeInterpolator f47805k;
    public long f47806l;

    public static int b(e1 e1Var) {
        int i10 = e1Var.f47743l;
        int i11 = i10 & 14;
        if (e1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = e1Var.d;
            int b10 = e1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2);

    public abstract boolean c(e1 e1Var, List list);

    public final void d(e1 e1Var) {
        h5 h5Var = this.f47798a;
        if (h5Var != null) {
            RecyclerView recyclerView = (RecyclerView) h5Var.f17285a;
            boolean z10 = true;
            e1Var.q(true);
            View view = e1Var.f47735a;
            if (e1Var.f47741j != null && e1Var.f47742k == null) {
                e1Var.f47741j = null;
            }
            e1Var.f47742k = null;
            if ((e1Var.f47743l & 16) == 0) {
                rf.e eVar = recyclerView.f3056b;
                recyclerView.z0();
                d dVar = recyclerView.e;
                lg lgVar = (lg) dVar.f47718c;
                jg.s0 s0Var = (jg.s0) dVar.f47717b;
                int indexOfChild = ((RecyclerView) s0Var.f15828b).indexOfChild(view);
                if (indexOfChild == -1) {
                    dVar.t(view);
                } else if (lgVar.z(indexOfChild)) {
                    lgVar.B(indexOfChild);
                    dVar.t(view);
                    s0Var.h0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    e1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && e1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f47799b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jl0 jl0Var = (jl0) arrayList.get(i10);
            jl0Var.f29669a.c(jl0Var.f29670b, jl0Var.f29671c, jl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(e1 e1Var);

    public abstract void g();

    public long h() {
        return this.f47800c;
    }

    public long i() {
        return Math.max(this.f47801f, this.f47802g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.v0 l(b1 b1Var, e1 e1Var, int i10, List list) {
        ?? obj = new Object();
        View view = e1Var.f47735a;
        obj.f3511a = view.getLeft();
        obj.f3512b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f47800c = j10;
        this.e = j10;
        this.d = j10;
        this.f47801f = j10;
        this.f47802g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f47803i = timeInterpolator;
        this.f47804j = timeInterpolator;
        this.f47805k = timeInterpolator;
    }
}
