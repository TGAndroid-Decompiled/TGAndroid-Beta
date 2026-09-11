package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jk0;
public abstract class m0 {
    public k2.g0 f45826a;
    public ArrayList f45827b;
    public long f45828c;
    public long d;
    public long f45829e;
    public long f45830f;
    public long f45831g;
    public TimeInterpolator h;
    public TimeInterpolator f45832i;
    public TimeInterpolator f45833j;
    public TimeInterpolator f45834k;
    public long f45835l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f45747l;
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
        k2.g0 g0Var = this.f45826a;
        if (g0Var != null) {
            RecyclerView recyclerView = (RecyclerView) g0Var.f14578b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f45738a;
            if (c1Var.f45745j != null && c1Var.f45746k == null) {
                c1Var.f45745j = null;
            }
            c1Var.f45746k = null;
            if ((c1Var.f45747l & 16) == 0) {
                pf.e eVar = recyclerView.f1867b;
                recyclerView.y0();
                m2.t tVar = recyclerView.f1872e;
                e6.n nVar = (e6.n) tVar.d;
                l.d dVar = (l.d) tVar.f15818c;
                int indexOfChild = ((RecyclerView) dVar.f15072b).indexOfChild(view);
                if (indexOfChild == -1) {
                    tVar.R(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    tVar.R(view);
                    dVar.C(indexOfChild);
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
        ArrayList arrayList = this.f45827b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jk0 jk0Var = (jk0) arrayList.get(i10);
            jk0Var.f27527a.c(jk0Var.f27528b, jk0Var.f27529c, jk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f45828c;
    }

    public long i() {
        return Math.max(this.f45830f, this.f45831g);
    }

    public long j() {
        return this.f45829e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f45738a;
        obj.f2260a = view.getLeft();
        obj.f2261b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f45828c = j3;
        this.f45829e = j3;
        this.d = j3;
        this.f45830f = j3;
        this.f45831g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f45832i = timeInterpolator;
        this.f45833j = timeInterpolator;
        this.f45834k = timeInterpolator;
    }
}
