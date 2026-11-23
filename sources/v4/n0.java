package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.i61;
public abstract class n0 {
    public h0 f59316a;
    public ArrayList f59317b;
    public long f59318c;
    public long d;
    public long f59319e;
    public long f59320f;
    public long f59321g;
    public TimeInterpolator h;
    public TimeInterpolator f59322i;
    public TimeInterpolator f59323j;
    public TimeInterpolator f59324k;
    public long f59325l;

    public static int b(f1 f1Var) {
        int i7 = f1Var.f59254l;
        int i10 = i7 & 14;
        if (f1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = f1Var.d;
            int b10 = f1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(f1 f1Var, List list);

    public final void d(f1 f1Var) {
        h0 h0Var = this.f59316a;
        if (h0Var != null) {
            RecyclerView recyclerView = h0Var.f59273a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.f59245a;
            if (f1Var.f59252j != null && f1Var.f59253k == null) {
                f1Var.f59252j = null;
            }
            f1Var.f59253k = null;
            if ((f1Var.f59254l & 16) == 0) {
                x0 x0Var = recyclerView.f2762b;
                recyclerView.z0();
                i61 i61Var = recyclerView.f2767e;
                va vaVar = (va) i61Var.f35959c;
                b bVar = (b) i61Var.f35958b;
                int indexOfChild = ((RecyclerView) bVar.f59186b).indexOfChild(view);
                if (indexOfChild == -1) {
                    i61Var.Q(view);
                } else if (vaVar.E(indexOfChild)) {
                    vaVar.G(indexOfChild);
                    i61Var.Q(view);
                    bVar.c(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    f1 U = RecyclerView.U(view);
                    x0Var.k(U);
                    x0Var.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && f1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f59317b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            cj0 cj0Var = (cj0) arrayList.get(i7);
            cj0Var.f34071a.k(cj0Var.f34072b, cj0Var.f34073c, cj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

    public abstract void g();

    public long h() {
        return this.f59318c;
    }

    public long i() {
        return Math.max(this.f59320f, this.f59321g);
    }

    public long j() {
        return this.f59319e;
    }

    public abstract boolean k();

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        ?? obj = new Object();
        View view = f1Var.f59245a;
        obj.f10677a = view.getLeft();
        obj.f10678b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59318c = j3;
        this.f59319e = j3;
        this.d = j3;
        this.f59320f = j3;
        this.f59321g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59322i = timeInterpolator;
        this.f59323j = timeInterpolator;
        this.f59324k = timeInterpolator;
    }
}
