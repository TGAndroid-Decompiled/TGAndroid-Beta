package s4;

import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import ji.h5;
import org.telegram.ui.Components.kl0;
public abstract class l0 {
    public l2.f f44915a;
    public ArrayList f44916b;
    public long f44917c;
    public long d;
    public long e;
    public long f44918f;
    public long f44919g;
    public TimeInterpolator h;
    public TimeInterpolator f44920i;
    public TimeInterpolator f44921j;
    public TimeInterpolator f44922k;
    public long f44923l;

    public static int b(b1 b1Var) {
        int i10 = b1Var.f44846l;
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

    public abstract boolean a(b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2);

    public abstract boolean c(b1 b1Var, List list);

    public final void d(b1 b1Var) {
        l2.f fVar = this.f44915a;
        if (fVar != null) {
            RecyclerView recyclerView = (RecyclerView) fVar.f14503b;
            boolean z10 = true;
            b1Var.q(true);
            View view = b1Var.f44838a;
            if (b1Var.f44844j != null && b1Var.f44845k == null) {
                b1Var.f44844j = null;
            }
            b1Var.f44845k = null;
            if ((b1Var.f44846l & 16) == 0) {
                qf.e eVar = recyclerView.f1989b;
                recyclerView.y0();
                li.k kVar = recyclerView.e;
                ad.d dVar = (ad.d) kVar.f14821c;
                h5 h5Var = (h5) kVar.f14820b;
                int indexOfChild = ((RecyclerView) h5Var.f13312b).indexOfChild(view);
                if (indexOfChild == -1) {
                    kVar.X(view);
                } else if (dVar.E(indexOfChild)) {
                    dVar.G(indexOfChild);
                    kVar.X(view);
                    h5Var.a1(indexOfChild);
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
        ArrayList arrayList = this.f44916b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            kl0 kl0Var = (kl0) arrayList.get(i10);
            kl0Var.f26727a.c(kl0Var.f26728b, kl0Var.f26729c, kl0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(b1 b1Var);

    public abstract void g();

    public long h() {
        return this.f44917c;
    }

    public long i() {
        return Math.max(this.f44918f, this.f44919g);
    }

    public long j() {
        return this.e;
    }

    public abstract boolean k();

    public b2.v0 l(y0 y0Var, b1 b1Var, int i10, List list) {
        ?? obj = new Object();
        View view = b1Var.f44838a;
        obj.f2444a = view.getLeft();
        obj.f2445b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j10) {
        this.f44917c = j10;
        this.e = j10;
        this.d = j10;
        this.f44918f = j10;
        this.f44919g = j10;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f44920i = timeInterpolator;
        this.f44921j = timeInterpolator;
        this.f44922k = timeInterpolator;
    }
}
