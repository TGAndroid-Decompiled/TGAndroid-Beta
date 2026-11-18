package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.of;
import org.telegram.ui.nd0;
public abstract class n0 {
    public jh.g f59194a;
    public ArrayList f59195b;
    public long f59196c;
    public long d;
    public long f59197e;
    public long f59198f;
    public long f59199g;
    public TimeInterpolator h;
    public TimeInterpolator f59200i;
    public TimeInterpolator f59201j;
    public TimeInterpolator f59202k;
    public long f59203l;

    public static int b(f1 f1Var) {
        int i7 = f1Var.f59132l;
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
        jh.g gVar = this.f59194a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17784a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.f59123a;
            if (f1Var.f59130j != null && f1Var.f59131k == null) {
                f1Var.f59130j = null;
            }
            f1Var.f59131k = null;
            if ((f1Var.f59132l & 16) == 0) {
                x0 x0Var = recyclerView.f2791b;
                recyclerView.z0();
                nd0 nd0Var = recyclerView.f2796e;
                va vaVar = (va) nd0Var.f50149c;
                of ofVar = (of) nd0Var.f50148b;
                int indexOfChild = ((RecyclerView) ofVar.f38076b).indexOfChild(view);
                if (indexOfChild == -1) {
                    nd0Var.K(view);
                } else if (vaVar.G(indexOfChild)) {
                    vaVar.I(indexOfChild);
                    nd0Var.K(view);
                    ofVar.x0(indexOfChild);
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
        ArrayList arrayList = this.f59195b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            aj0 aj0Var = (aj0) arrayList.get(i7);
            aj0Var.f33353a.k(aj0Var.f33354b, aj0Var.f33355c, aj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

    public abstract void g();

    public long h() {
        return this.f59196c;
    }

    public long i() {
        return Math.max(this.f59198f, this.f59199g);
    }

    public long j() {
        return this.f59197e;
    }

    public abstract boolean k();

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        ?? obj = new Object();
        View view = f1Var.f59123a;
        obj.f10684a = view.getLeft();
        obj.f10685b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59196c = j3;
        this.f59197e = j3;
        this.d = j3;
        this.f59198f = j3;
        this.f59199g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59200i = timeInterpolator;
        this.f59201j = timeInterpolator;
        this.f59202k = timeInterpolator;
    }
}
