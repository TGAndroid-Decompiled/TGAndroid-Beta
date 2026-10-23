package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ki.t1;
import m.g3;
import org.telegram.ui.Components.hl0;
public abstract class l0 {
    public k2.w0 f45998a;
    public ArrayList f45999b;
    public long f46000c;
    public long d;
    public long e;
    public long f46001f;
    public long f46002g;
    public TimeInterpolator h;
    public TimeInterpolator f46003i;
    public TimeInterpolator f46004j;
    public TimeInterpolator f46005k;
    public long f46006l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.f45929l;
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
        k2.w0 w0Var = this.f45998a;
        if (w0Var != null) {
            RecyclerView recyclerView = (RecyclerView) w0Var.f14830b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.f45921a;
            if (b1Var.f45927j != null && b1Var.f45928k == null) {
                b1Var.f45927j = null;
            }
            b1Var.f45928k = null;
            if ((b1Var.f45929l & 16) == 0) {
                qf.e eVar = recyclerView.f3603b;
                recyclerView.y0();
                g3 g3Var = recyclerView.e;
                ad.d dVar = (ad.d) g3Var.f16203c;
                t1 t1Var = (t1) g3Var.f16202b;
                int indexOfChild = ((RecyclerView) t1Var.f15525b).indexOfChild(view);
                if (indexOfChild == -1) {
                    g3Var.X(view);
                } else if (dVar.D(indexOfChild)) {
                    dVar.F(indexOfChild);
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
        ArrayList arrayList = this.f45999b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            hl0 hl0Var = (hl0) arrayList.get(i10);
            hl0Var.f26920a.c(hl0Var.f26921b, hl0Var.f26922c, hl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.f46000c;
    }

    public long i() {
        return Math.max(this.f46001f, this.f46002g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.u0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        ?? obj = new Object();
        View view = b1Var.f45921a;
        obj.f4053a = view.getLeft();
        obj.f4054b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f46000c = j10;
        this.e = j10;
        this.d = j10;
        this.f46001f = j10;
        this.f46002g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f46003i = timeInterpolator;
        this.f46004j = timeInterpolator;
        this.f46005k = timeInterpolator;
    }
}
