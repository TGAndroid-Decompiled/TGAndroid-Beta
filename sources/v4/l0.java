package v4;

import a8.ua;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.hy0;
public abstract class l0 {
    public jh.g f57021a;
    public ArrayList f57022b;
    public long f57023c;
    public long d;
    public long f57024e;
    public long f57025f;
    public long f57026g;
    public TimeInterpolator h;
    public TimeInterpolator f57027i;
    public TimeInterpolator f57028j;
    public TimeInterpolator f57029k;
    public long f57030l;

    public static int b(d1 d1Var) {
        int i7 = d1Var.f56960l;
        int i10 = i7 & 14;
        if (d1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = d1Var.d;
            int b10 = d1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(d1 d1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(d1 d1Var, List list);

    public final void d(d1 d1Var) {
        jh.g gVar = this.f57021a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17046a;
            boolean z9 = true;
            d1Var.q(true);
            View view = d1Var.f56951a;
            if (d1Var.f56958j != null && d1Var.f56959k == null) {
                d1Var.f56958j = null;
            }
            d1Var.f56959k = null;
            if ((d1Var.f56960l & 16) == 0) {
                v0 v0Var = recyclerView.f2842b;
                recyclerView.z0();
                hy0 hy0Var = recyclerView.f2847e;
                ua uaVar = (ua) hy0Var.f46528c;
                uy uyVar = (uy) hy0Var.f46527b;
                int indexOfChild = ((RecyclerView) uyVar.f38750b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hy0Var.M(view);
                } else if (uaVar.E(indexOfChild)) {
                    uaVar.G(indexOfChild);
                    hy0Var.M(view);
                    uyVar.Q(indexOfChild);
                } else {
                    z9 = false;
                }
                if (z9) {
                    d1 U = RecyclerView.U(view);
                    v0Var.k(U);
                    v0Var.h(U);
                }
                recyclerView.A0(!z9);
                if (!z9 && d1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f57022b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            mi0 mi0Var = (mi0) arrayList.get(i7);
            mi0Var.f35960a.d(mi0Var.f35961b, mi0Var.f35962c, mi0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f57023c;
    }

    public long i() {
        return Math.max(this.f57025f, this.f57026g);
    }

    public long j() {
        return this.f57024e;
    }

    public abstract boolean k();

    public e2.r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        ?? obj = new Object();
        View view = d1Var.f56951a;
        obj.f10533a = view.getLeft();
        obj.f10534b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f57023c = j3;
        this.f57024e = j3;
        this.d = j3;
        this.f57025f = j3;
        this.f57026g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f57027i = timeInterpolator;
        this.f57028j = timeInterpolator;
        this.f57029k = timeInterpolator;
    }
}
