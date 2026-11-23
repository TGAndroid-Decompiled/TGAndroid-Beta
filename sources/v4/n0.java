package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.md0;
public abstract class n0 {
    public jh.g f59236a;
    public ArrayList f59237b;
    public long f59238c;
    public long d;
    public long f59239e;
    public long f59240f;
    public long f59241g;
    public TimeInterpolator h;
    public TimeInterpolator f59242i;
    public TimeInterpolator f59243j;
    public TimeInterpolator f59244k;
    public long f59245l;

    public static int b(f1 f1Var) {
        int i7 = f1Var.f59174l;
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
        jh.g gVar = this.f59236a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17812a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.f59165a;
            if (f1Var.f59172j != null && f1Var.f59173k == null) {
                f1Var.f59172j = null;
            }
            f1Var.f59173k = null;
            if ((f1Var.f59174l & 16) == 0) {
                x0 x0Var = recyclerView.f2810b;
                recyclerView.z0();
                md0 md0Var = recyclerView.f2815e;
                va vaVar = (va) md0Var.f49858c;
                qf qfVar = (qf) md0Var.f49857b;
                int indexOfChild = ((RecyclerView) qfVar.f38896b).indexOfChild(view);
                if (indexOfChild == -1) {
                    md0Var.K(view);
                } else if (vaVar.G(indexOfChild)) {
                    vaVar.I(indexOfChild);
                    md0Var.K(view);
                    qfVar.x0(indexOfChild);
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
        ArrayList arrayList = this.f59237b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            cj0 cj0Var = (cj0) arrayList.get(i7);
            cj0Var.f34206a.k(cj0Var.f34207b, cj0Var.f34208c, cj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

    public abstract void g();

    public long h() {
        return this.f59238c;
    }

    public long i() {
        return Math.max(this.f59240f, this.f59241g);
    }

    public long j() {
        return this.f59239e;
    }

    public abstract boolean k();

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        ?? obj = new Object();
        View view = f1Var.f59165a;
        obj.f10716a = view.getLeft();
        obj.f10717b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59238c = j3;
        this.f59239e = j3;
        this.d = j3;
        this.f59240f = j3;
        this.f59241g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59242i = timeInterpolator;
        this.f59243j = timeInterpolator;
        this.f59244k = timeInterpolator;
    }
}
