package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ki.t1;
import m.g3;
import org.telegram.ui.Components.jl0;
public abstract class l0 {
    public k2.w0 f46419a;
    public ArrayList f46420b;
    public long f46421c;
    public long d;
    public long e;
    public long f46422f;
    public long f46423g;
    public TimeInterpolator h;
    public TimeInterpolator f46424i;
    public TimeInterpolator f46425j;
    public TimeInterpolator f46426k;
    public long f46427l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.f46350l;
        int i11 = i10 & 14;
        if (b1Var.h()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = b1Var.d;
            int b10 = b1Var.b();
            if (i12 != -1 && b10 != -1 && i12 != b10) {
                return i11 | 2048;
            }
        }
        return i11;
    }

    public abstract boolean a(b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2);

    public abstract boolean c(b1 b1Var, List list);

    public final void d(b1 b1Var) {
        k2.w0 w0Var = this.f46419a;
        if (w0Var != null) {
            RecyclerView recyclerView = (RecyclerView) w0Var.f14874b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.f46342a;
            if (b1Var.f46348j != null && b1Var.f46349k == null) {
                b1Var.f46348j = null;
            }
            b1Var.f46349k = null;
            if ((b1Var.f46350l & 16) == 0) {
                qf.e eVar = recyclerView.f3610b;
                recyclerView.y0();
                g3 g3Var = recyclerView.e;
                ad.d dVar = (ad.d) g3Var.f16266c;
                t1 t1Var = (t1) g3Var.f16265b;
                int indexOfChild = ((RecyclerView) t1Var.f15585b).indexOfChild(view);
                if (indexOfChild == -1) {
                    g3Var.X(view);
                } else if (dVar.E(indexOfChild)) {
                    dVar.G(indexOfChild);
                    g3Var.X(view);
                    t1Var.Y(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    b1 U = RecyclerView.U(view);
                    eVar.k(U);
                    eVar.h(U);
                }
                recyclerView.z0(!z10);
                if (!z10 && b1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f46420b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jl0 jl0Var = (jl0) arrayList.get(i10);
            jl0Var.f27721a.c(jl0Var.f27722b, jl0Var.f27723c, jl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.f46421c;
    }

    public long i() {
        return Math.max(this.f46422f, this.f46423g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.u0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        ?? obj = new Object();
        View view = b1Var.f46342a;
        obj.f4060a = view.getLeft();
        obj.f4061b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f46421c = j10;
        this.e = j10;
        this.d = j10;
        this.f46422f = j10;
        this.f46423g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f46424i = timeInterpolator;
        this.f46425j = timeInterpolator;
        this.f46426k = timeInterpolator;
    }
}
