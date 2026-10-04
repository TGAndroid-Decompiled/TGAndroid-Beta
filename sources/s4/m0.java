package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.wk0;
public abstract class m0 {
    public l2.g f46611a;
    public ArrayList f46612b;
    public long f46613c;
    public long d;
    public long f46614e;
    public long f46615f;
    public long f46616g;
    public TimeInterpolator h;
    public TimeInterpolator f46617i;
    public TimeInterpolator f46618j;
    public TimeInterpolator f46619k;
    public long f46620l;

    public static int b(c1 c1Var) {
        int i10 = c1Var.f46532l;
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
        l2.g gVar = this.f46611a;
        if (gVar != null) {
            RecyclerView recyclerView = (RecyclerView) gVar.f15266b;
            boolean z10 = true;
            c1Var.q(true);
            View view = c1Var.f46523a;
            if (c1Var.f46530j != null && c1Var.f46531k == null) {
                c1Var.f46530j = null;
            }
            c1Var.f46531k = null;
            if ((c1Var.f46532l & 16) == 0) {
                of.e eVar = recyclerView.f3061b;
                recyclerView.z0();
                la.h hVar = recyclerView.f3066e;
                e6.n nVar = (e6.n) hVar.f15398c;
                hh.h hVar2 = (hh.h) hVar.f15397b;
                int indexOfChild = hVar2.f11462a.indexOfChild(view);
                if (indexOfChild == -1) {
                    hVar.Y(view);
                } else if (nVar.y(indexOfChild)) {
                    nVar.A(indexOfChild);
                    hVar.Y(view);
                    hVar2.a(indexOfChild);
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
        ArrayList arrayList = this.f46612b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            wk0 wk0Var = (wk0) arrayList.get(i10);
            wk0Var.f32574a.d(wk0Var.f32575b, wk0Var.f32576c, wk0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(c1 c1Var);

    public abstract void g();

    public long h() {
        return this.f46613c;
    }

    public long i() {
        return Math.max(this.f46615f, this.f46616g);
    }

    public long j() {
        return this.f46614e;
    }

    public abstract boolean k();

    public b2.q0 l(z0 z0Var, c1 c1Var, int i10, List list) {
        ?? obj = new Object();
        View view = c1Var.f46523a;
        obj.f3454a = view.getLeft();
        obj.f3455b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f46613c = j3;
        this.f46614e = j3;
        this.d = j3;
        this.f46615f = j3;
        this.f46616g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f46617i = timeInterpolator;
        this.f46618j = timeInterpolator;
        this.f46619k = timeInterpolator;
    }
}
