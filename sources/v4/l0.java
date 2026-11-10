package v4;

import a8.ua;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.uy;
import org.telegram.ui.ly0;
public abstract class l0 {
    public jh.g f57122a;
    public ArrayList f57123b;
    public long f57124c;
    public long d;
    public long f57125e;
    public long f57126f;
    public long f57127g;
    public TimeInterpolator h;
    public TimeInterpolator f57128i;
    public TimeInterpolator f57129j;
    public TimeInterpolator f57130k;
    public long f57131l;

    public static int b(d1 d1Var) {
        int i7 = d1Var.f57061l;
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
        jh.g gVar = this.f57122a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17049a;
            boolean z9 = true;
            d1Var.q(true);
            View view = d1Var.f57052a;
            if (d1Var.f57059j != null && d1Var.f57060k == null) {
                d1Var.f57059j = null;
            }
            d1Var.f57060k = null;
            if ((d1Var.f57061l & 16) == 0) {
                v0 v0Var = recyclerView.f2842b;
                recyclerView.z0();
                ly0 ly0Var = recyclerView.f2847e;
                ua uaVar = (ua) ly0Var.f47747c;
                uy uyVar = (uy) ly0Var.f47746b;
                int indexOfChild = ((RecyclerView) uyVar.f38776b).indexOfChild(view);
                if (indexOfChild == -1) {
                    ly0Var.M(view);
                } else if (uaVar.E(indexOfChild)) {
                    uaVar.G(indexOfChild);
                    ly0Var.M(view);
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
        ArrayList arrayList = this.f57123b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            mi0 mi0Var = (mi0) arrayList.get(i7);
            mi0Var.f35979a.d(mi0Var.f35980b, mi0Var.f35981c, mi0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(d1 d1Var);

    public abstract void g();

    public long h() {
        return this.f57124c;
    }

    public long i() {
        return Math.max(this.f57126f, this.f57127g);
    }

    public long j() {
        return this.f57125e;
    }

    public abstract boolean k();

    public e2.r0 l(a1 a1Var, d1 d1Var, int i7, List list) {
        ?? obj = new Object();
        View view = d1Var.f57052a;
        obj.f10538a = view.getLeft();
        obj.f10539b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f57124c = j3;
        this.f57125e = j3;
        this.d = j3;
        this.f57126f = j3;
        this.f57127g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f57128i = timeInterpolator;
        this.f57129j = timeInterpolator;
        this.f57130k = timeInterpolator;
    }
}
