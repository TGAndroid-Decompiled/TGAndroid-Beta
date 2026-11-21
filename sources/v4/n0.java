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
    public jh.g f59232a;
    public ArrayList f59233b;
    public long f59234c;
    public long d;
    public long f59235e;
    public long f59236f;
    public long f59237g;
    public TimeInterpolator h;
    public TimeInterpolator f59238i;
    public TimeInterpolator f59239j;
    public TimeInterpolator f59240k;
    public long f59241l;

    public static int b(f1 f1Var) {
        int i7 = f1Var.f59170l;
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
        jh.g gVar = this.f59232a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17809a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.f59161a;
            if (f1Var.f59168j != null && f1Var.f59169k == null) {
                f1Var.f59168j = null;
            }
            f1Var.f59169k = null;
            if ((f1Var.f59170l & 16) == 0) {
                x0 x0Var = recyclerView.f2803b;
                recyclerView.z0();
                md0 md0Var = recyclerView.f2808e;
                va vaVar = (va) md0Var.f49854c;
                qf qfVar = (qf) md0Var.f49853b;
                int indexOfChild = ((RecyclerView) qfVar.f38902b).indexOfChild(view);
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
        ArrayList arrayList = this.f59233b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            cj0 cj0Var = (cj0) arrayList.get(i7);
            cj0Var.f34212a.k(cj0Var.f34213b, cj0Var.f34214c, cj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

    public abstract void g();

    public long h() {
        return this.f59234c;
    }

    public long i() {
        return Math.max(this.f59236f, this.f59237g);
    }

    public long j() {
        return this.f59235e;
    }

    public abstract boolean k();

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        ?? obj = new Object();
        View view = f1Var.f59161a;
        obj.f10713a = view.getLeft();
        obj.f10714b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59234c = j3;
        this.f59235e = j3;
        this.d = j3;
        this.f59236f = j3;
        this.f59237g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59238i = timeInterpolator;
        this.f59239j = timeInterpolator;
        this.f59240k = timeInterpolator;
    }
}
