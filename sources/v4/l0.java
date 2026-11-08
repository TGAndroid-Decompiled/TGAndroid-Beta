package v4;

import a8.ua;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.hy0;
public abstract class l0 {
    public jh.g f57113a;
    public ArrayList f57114b;
    public long f57115c;
    public long d;
    public long f57116e;
    public long f57117f;
    public long f57118g;
    public TimeInterpolator h;
    public TimeInterpolator f57119i;
    public TimeInterpolator f57120j;
    public TimeInterpolator f57121k;
    public long f57122l;

    public static int b(d1 d1Var) {
        int i7 = d1Var.f57052l;
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
        jh.g gVar = this.f57113a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17049a;
            boolean z9 = true;
            d1Var.q(true);
            View view = d1Var.f57043a;
            if (d1Var.f57050j != null && d1Var.f57051k == null) {
                d1Var.f57050j = null;
            }
            d1Var.f57051k = null;
            if ((d1Var.f57052l & 16) == 0) {
                v0 v0Var = recyclerView.f2842b;
                recyclerView.z0();
                hy0 hy0Var = recyclerView.f2847e;
                ua uaVar = (ua) hy0Var.f46527c;
                vy vyVar = (vy) hy0Var.f46526b;
                int indexOfChild = ((RecyclerView) vyVar.f39747b).indexOfChild(view);
                if (indexOfChild == -1) {
                    hy0Var.M(view);
                } else if (uaVar.E(indexOfChild)) {
                    uaVar.G(indexOfChild);
                    hy0Var.M(view);
                    vyVar.Q(indexOfChild);
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
        ArrayList arrayList = this.f57114b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            mi0 mi0Var = (mi0) arrayList.get(i7);
            mi0Var.f35988a.d(mi0Var.f35989b, mi0Var.f35990c, mi0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f57115c;
    }

    public long i() {
        return Math.max(this.f57117f, this.f57118g);
    }

    public long j() {
        return this.f57116e;
    }

    public abstract boolean k();

    public e2.r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        ?? obj = new Object();
        View view = d1Var.f57043a;
        obj.f10533a = view.getLeft();
        obj.f10534b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f57115c = j3;
        this.f57116e = j3;
        this.d = j3;
        this.f57117f = j3;
        this.f57118g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f57119i = timeInterpolator;
        this.f57120j = timeInterpolator;
        this.f57121k = timeInterpolator;
    }
}
