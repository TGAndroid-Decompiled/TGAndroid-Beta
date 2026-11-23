package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.pf;
import org.telegram.ui.md0;
public abstract class m0 {
    public jh.g f59181a;
    public ArrayList f59182b;
    public long f59183c;
    public long d;
    public long f59184e;
    public long f59185f;
    public long f59186g;
    public TimeInterpolator h;
    public TimeInterpolator f59187i;
    public TimeInterpolator f59188j;
    public TimeInterpolator f59189k;
    public long f59190l;

    public static int b(e1 e1Var) {
        int i7 = e1Var.f59120l;
        int i10 = i7 & 14;
        if (e1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = e1Var.d;
            int b10 = e1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(e1 e1Var, List list);

    public final void d(e1 e1Var) {
        jh.g gVar = this.f59181a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17778a;
            boolean z10 = true;
            e1Var.q(true);
            View view = e1Var.f59111a;
            if (e1Var.f59118j != null && e1Var.f59119k == null) {
                e1Var.f59118j = null;
            }
            e1Var.f59119k = null;
            if ((e1Var.f59120l & 16) == 0) {
                w0 w0Var = recyclerView.f2761b;
                recyclerView.z0();
                md0 md0Var = recyclerView.f2766e;
                va vaVar = (va) md0Var.f49831c;
                pf pfVar = (pf) md0Var.f49830b;
                int indexOfChild = ((RecyclerView) pfVar.f38544b).indexOfChild(view);
                if (indexOfChild == -1) {
                    md0Var.K(view);
                } else if (vaVar.G(indexOfChild)) {
                    vaVar.I(indexOfChild);
                    md0Var.K(view);
                    pfVar.x0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    e1 U = RecyclerView.U(view);
                    w0Var.k(U);
                    w0Var.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && e1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f59182b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            cj0 cj0Var = (cj0) arrayList.get(i7);
            cj0Var.f34174a.k(cj0Var.f34175b, cj0Var.f34176c, cj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(e1 e1Var);

    public abstract void g();

    public long h() {
        return this.f59183c;
    }

    public long i() {
        return Math.max(this.f59185f, this.f59186g);
    }

    public long j() {
        return this.f59184e;
    }

    public abstract boolean k();

    public e2.r0 l(b1 b1Var, e1 e1Var, int i7, List list) {
        ?? obj = new Object();
        View view = e1Var.f59111a;
        obj.f10679a = view.getLeft();
        obj.f10680b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59183c = j3;
        this.f59184e = j3;
        this.d = j3;
        this.f59185f = j3;
        this.f59186g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59187i = timeInterpolator;
        this.f59188j = timeInterpolator;
        this.f59189k = timeInterpolator;
    }
}
