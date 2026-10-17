package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import m.g3;
import org.telegram.ui.Components.gl0;
public abstract class l0 {
    public l2.f f46015a;
    public ArrayList f46016b;
    public long f46017c;
    public long d;
    public long e;
    public long f46018f;
    public long f46019g;
    public TimeInterpolator h;
    public TimeInterpolator f46020i;
    public TimeInterpolator f46021j;
    public TimeInterpolator f46022k;
    public long f46023l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.f45946l;
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
        l2.f fVar = this.f46015a;
        if (fVar != null) {
            RecyclerView recyclerView = (RecyclerView) fVar.f15837b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.f45938a;
            if (b1Var.f45944j != null && b1Var.f45945k == null) {
                b1Var.f45944j = null;
            }
            b1Var.f45945k = null;
            if ((b1Var.f45946l & 16) == 0) {
                qf.e eVar = recyclerView.f3606b;
                recyclerView.y0();
                g3 g3Var = recyclerView.e;
                ad.d dVar = (ad.d) g3Var.f16197c;
                ih.g gVar = (ih.g) g3Var.f16196b;
                int indexOfChild = gVar.f13134a.indexOfChild(view);
                if (indexOfChild == -1) {
                    g3Var.X(view);
                } else if (dVar.D(indexOfChild)) {
                    dVar.F(indexOfChild);
                    g3Var.X(view);
                    gVar.a(indexOfChild);
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
        ArrayList arrayList = this.f46016b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            gl0 gl0Var = (gl0) arrayList.get(i10);
            gl0Var.f26585a.c(gl0Var.f26586b, gl0Var.f26587c, gl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.f46017c;
    }

    public long i() {
        return Math.max(this.f46018f, this.f46019g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.u0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        ?? obj = new Object();
        View view = b1Var.f45938a;
        obj.f4056a = view.getLeft();
        obj.f4057b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f46017c = j10;
        this.e = j10;
        this.d = j10;
        this.f46018f = j10;
        this.f46019g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f46020i = timeInterpolator;
        this.f46021j = timeInterpolator;
        this.f46022k = timeInterpolator;
    }
}
