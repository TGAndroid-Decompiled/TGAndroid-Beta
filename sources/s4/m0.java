package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.kk0;
public abstract class m0 {
    public ka.c f42781a;
    public ArrayList f42782b;
    public long f42783c;
    public long d;
    public long e;
    public long f42784f;
    public long f42785g;
    public TimeInterpolator h;
    public TimeInterpolator f42786i;
    public TimeInterpolator f42787j;
    public TimeInterpolator f42788k;
    public long f42789l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42710l;
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
        ka.c cVar = this.f42781a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f13567b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42702a;
            if (c1Var.f42708j != null && c1Var.f42709k == null) {
                c1Var.f42708j = null;
            }
            c1Var.f42709k = null;
            if ((c1Var.f42710l & 16) == 0) {
                of.e eVar = recyclerView.f2840b;
                recyclerView.z0();
                lf.i iVar = recyclerView.e;
                e6.n nVar = (e6.n) iVar.f14034c;
                k2.c0 c0Var = (k2.c0) iVar.f14033b;
                int indexOfChild = ((RecyclerView) c0Var.f13237b).indexOfChild(view);
                if (indexOfChild == -1) {
                    iVar.Y(view);
                } else if (nVar.z(indexOfChild)) {
                    nVar.B(indexOfChild);
                    iVar.Y(view);
                    c0Var.r(indexOfChild);
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
        ArrayList arrayList = this.f42782b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            kk0 kk0Var = (kk0) arrayList.get(i10);
            kk0Var.f25648a.d(kk0Var.f25649b, kk0Var.f25650c, kk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f42783c;
    }

    public long i() {
        return Math.max(this.f42784f, this.f42785g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42702a;
        obj.f3203a = view.getLeft();
        obj.f3204b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f42783c = j3;
        this.e = j3;
        this.d = j3;
        this.f42784f = j3;
        this.f42785g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f42786i = timeInterpolator;
        this.f42787j = timeInterpolator;
        this.f42788k = timeInterpolator;
    }
}
