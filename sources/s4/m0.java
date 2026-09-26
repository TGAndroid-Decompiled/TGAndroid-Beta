package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.vk0;
public abstract class m0 {
    public l.d f43038a;
    public ArrayList f43039b;
    public long f43040c;
    public long d;
    public long e;
    public long f43041f;
    public long f43042g;
    public TimeInterpolator h;
    public TimeInterpolator f43043i;
    public TimeInterpolator f43044j;
    public TimeInterpolator f43045k;
    public long f43046l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f42967l;
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
        l.d dVar = this.f43038a;
        if (dVar != null) {
            RecyclerView recyclerView = (RecyclerView) dVar.f13924a;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f42959a;
            if (c1Var.f42965j != null && c1Var.f42966k == null) {
                c1Var.f42965j = null;
            }
            c1Var.f42966k = null;
            if ((c1Var.f42967l & 16) == 0) {
                of.e eVar = recyclerView.f2832b;
                recyclerView.y0();
                la.h hVar = recyclerView.e;
                e6.n nVar = (e6.n) hVar.f14167c;
                ka.c cVar = (ka.c) hVar.f14166b;
                int indexOfChild = ((RecyclerView) cVar.f13552b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar.Y(view);
                } else if (nVar.D(indexOfChild)) {
                    nVar.F(indexOfChild);
                    hVar.Y(view);
                    cVar.j0(indexOfChild);
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
        ArrayList arrayList = this.f43039b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            vk0 vk0Var = (vk0) arrayList.get(i10);
            vk0Var.f29118a.c(vk0Var.f29119b, vk0Var.f29120c, vk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f43040c;
    }

    public long i() {
        return Math.max(this.f43041f, this.f43042g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f42959a;
        obj.f3195a = view.getLeft();
        obj.f3196b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f43040c = j3;
        this.e = j3;
        this.d = j3;
        this.f43041f = j3;
        this.f43042g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f43043i = timeInterpolator;
        this.f43044j = timeInterpolator;
        this.f43045k = timeInterpolator;
    }
}
