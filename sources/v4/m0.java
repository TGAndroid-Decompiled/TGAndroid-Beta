package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.ld0;
public abstract class m0 {
    public g0 f58606a;
    public ArrayList f58607b;
    public long f58608c;
    public long d;
    public long f58609e;
    public long f58610f;
    public long f58611g;
    public TimeInterpolator h;
    public TimeInterpolator f58612i;
    public TimeInterpolator f58613j;
    public TimeInterpolator f58614k;
    public long f58615l;

    public static int b(e1 e1Var) {
        int i7 = e1Var.f58544l;
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
        g0 g0Var = this.f58606a;
        if (g0Var != null) {
            RecyclerView recyclerView = g0Var.f58563a;
            boolean z10 = true;
            e1Var.q(true);
            View view = e1Var.f58535a;
            if (e1Var.f58542j != null && e1Var.f58543k == null) {
                e1Var.f58542j = null;
            }
            e1Var.f58543k = null;
            if ((e1Var.f58544l & 16) == 0) {
                w0 w0Var = recyclerView.f2796b;
                recyclerView.z0();
                ld0 ld0Var = recyclerView.f2801e;
                va vaVar = (va) ld0Var.f48977c;
                ff ffVar = (ff) ld0Var.f48976b;
                int indexOfChild = ((RecyclerView) ffVar.f34586b).indexOfChild(view);
                if (indexOfChild == -1) {
                    ld0Var.K(view);
                } else if (vaVar.v(indexOfChild)) {
                    vaVar.x(indexOfChild);
                    ld0Var.K(view);
                    ffVar.C0(indexOfChild);
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
        ArrayList arrayList = this.f58607b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ri0 ri0Var = (ri0) arrayList.get(i7);
            ri0Var.f38985a.d(ri0Var.f38986b, ri0Var.f38987c, ri0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(e1 e1Var);

    public abstract void g();

    public long h() {
        return this.f58608c;
    }

    public long i() {
        return Math.max(this.f58610f, this.f58611g);
    }

    public long j() {
        return this.f58609e;
    }

    public abstract boolean k();

    public e2.r0 l(b1 b1Var, e1 e1Var, int i7, List list) {
        ?? obj = new Object();
        View view = e1Var.f58535a;
        obj.f10369a = view.getLeft();
        obj.f10370b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f58608c = j3;
        this.f58609e = j3;
        this.d = j3;
        this.f58610f = j3;
        this.f58611g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f58612i = timeInterpolator;
        this.f58613j = timeInterpolator;
        this.f58614k = timeInterpolator;
    }
}
