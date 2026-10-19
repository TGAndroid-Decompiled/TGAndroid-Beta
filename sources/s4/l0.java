package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ki.t1;
import m.g3;
import org.telegram.ui.Components.gl0;
public abstract class l0 {
    public k2.w0 f45987a;
    public ArrayList f45988b;
    public long f45989c;
    public long d;
    public long e;
    public long f45990f;
    public long f45991g;
    public TimeInterpolator h;
    public TimeInterpolator f45992i;
    public TimeInterpolator f45993j;
    public TimeInterpolator f45994k;
    public long f45995l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.f45918l;
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
        k2.w0 w0Var = this.f45987a;
        if (w0Var != null) {
            RecyclerView recyclerView = (RecyclerView) w0Var.f14832b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.f45910a;
            if (b1Var.f45916j != null && b1Var.f45917k == null) {
                b1Var.f45916j = null;
            }
            b1Var.f45917k = null;
            if ((b1Var.f45918l & 16) == 0) {
                qf.e eVar = recyclerView.f3605b;
                recyclerView.y0();
                g3 g3Var = recyclerView.e;
                ad.d dVar = (ad.d) g3Var.f16205c;
                t1 t1Var = (t1) g3Var.f16204b;
                int indexOfChild = ((RecyclerView) t1Var.f15527b).indexOfChild(view);
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
        ArrayList arrayList = this.f45988b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            gl0 gl0Var = (gl0) arrayList.get(i10);
            gl0Var.f26614a.c(gl0Var.f26615b, gl0Var.f26616c, gl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.f45989c;
    }

    public long i() {
        return Math.max(this.f45990f, this.f45991g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.u0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        ?? obj = new Object();
        View view = b1Var.f45910a;
        obj.f4055a = view.getLeft();
        obj.f4056b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f45989c = j10;
        this.e = j10;
        this.d = j10;
        this.f45990f = j10;
        this.f45991g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f45992i = timeInterpolator;
        this.f45993j = timeInterpolator;
        this.f45994k = timeInterpolator;
    }
}
