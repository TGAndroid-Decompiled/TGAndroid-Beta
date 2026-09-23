package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.kk0;
public abstract class m0 {
    public ka.c f42706a;
    public ArrayList f42707b;
    public long f42708c;
    public long d;
    public long e;
    public long f42709f;
    public long f42710g;
    public TimeInterpolator h;
    public TimeInterpolator f42711i;
    public TimeInterpolator f42712j;
    public TimeInterpolator f42713k;
    public long f42714l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42635l;
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
        ka.c cVar = this.f42706a;
        if (cVar != null) {
            RecyclerView recyclerView = (RecyclerView) cVar.f13554b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42627a;
            if (c1Var.f42633j != null && c1Var.f42634k == null) {
                c1Var.f42633j = null;
            }
            c1Var.f42634k = null;
            if ((c1Var.f42635l & 16) == 0) {
                of.e eVar = recyclerView.f2832b;
                recyclerView.y0();
                lf.i iVar = recyclerView.e;
                e6.n nVar = (e6.n) iVar.f14012c;
                k2.b0 b0Var = (k2.b0) iVar.f14011b;
                int indexOfChild = ((RecyclerView) b0Var.f13222b).indexOfChild(view);
                if (indexOfChild == -1) {
                    iVar.Y(view);
                } else if (nVar.z(indexOfChild)) {
                    nVar.B(indexOfChild);
                    iVar.Y(view);
                    b0Var.r(indexOfChild);
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
        ArrayList arrayList = this.f42707b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            kk0 kk0Var = (kk0) arrayList.get(i10);
            kk0Var.f25620a.c(kk0Var.f25621b, kk0Var.f25622c, kk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f42708c;
    }

    public long i() {
        return Math.max(this.f42709f, this.f42710g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42627a;
        obj.f3195a = view.getLeft();
        obj.f3196b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f42708c = j3;
        this.e = j3;
        this.d = j3;
        this.f42709f = j3;
        this.f42710g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f42711i = timeInterpolator;
        this.f42712j = timeInterpolator;
        this.f42713k = timeInterpolator;
    }
}
