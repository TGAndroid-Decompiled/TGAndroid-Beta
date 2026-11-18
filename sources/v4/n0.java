package v4;

import a8.va;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.of;
import org.telegram.ui.md0;
public abstract class n0 {
    public jh.g f59193a;
    public ArrayList f59194b;
    public long f59195c;
    public long d;
    public long f59196e;
    public long f59197f;
    public long f59198g;
    public TimeInterpolator h;
    public TimeInterpolator f59199i;
    public TimeInterpolator f59200j;
    public TimeInterpolator f59201k;
    public long f59202l;

    public static int b(f1 f1Var) {
        int i7 = f1Var.f59131l;
        int i10 = i7 & 14;
        if (f1Var.h()) {
            return 4;
        }
        if ((i7 & 4) == 0) {
            int i11 = f1Var.d;
            int b10 = f1Var.b();
            if (i11 != -1 && b10 != -1 && i11 != b10) {
                return i10 | 2048;
            }
        }
        return i10;
    }

    public abstract boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2);

    public abstract boolean c(f1 f1Var, List list);

    public final void d(f1 f1Var) {
        jh.g gVar = this.f59193a;
        if (gVar != null) {
            RecyclerView recyclerView = gVar.f17787a;
            boolean z10 = true;
            f1Var.q(true);
            View view = f1Var.f59122a;
            if (f1Var.f59129j != null && f1Var.f59130k == null) {
                f1Var.f59129j = null;
            }
            f1Var.f59130k = null;
            if ((f1Var.f59131l & 16) == 0) {
                x0 x0Var = recyclerView.f2790b;
                recyclerView.z0();
                md0 md0Var = recyclerView.f2795e;
                va vaVar = (va) md0Var.f49839c;
                of ofVar = (of) md0Var.f49838b;
                int indexOfChild = ((RecyclerView) ofVar.f38076b).indexOfChild(view);
                if (indexOfChild == -1) {
                    md0Var.K(view);
                } else if (vaVar.G(indexOfChild)) {
                    vaVar.I(indexOfChild);
                    md0Var.K(view);
                    ofVar.x0(indexOfChild);
                } else {
                    z10 = false;
                }
                if (z10) {
                    f1 U = RecyclerView.U(view);
                    x0Var.k(U);
                    x0Var.h(U);
                }
                recyclerView.A0(!z10);
                if (!z10 && f1Var.l()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f59194b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            aj0 aj0Var = (aj0) arrayList.get(i7);
            aj0Var.f33353a.k(aj0Var.f33354b, aj0Var.f33355c, aj0Var.d, false);
        }
        arrayList.clear();
    }

    public abstract void f(f1 f1Var);

    public abstract void g();

    public long h() {
        return this.f59195c;
    }

    public long i() {
        return Math.max(this.f59197f, this.f59198g);
    }

    public long j() {
        return this.f59196e;
    }

    public abstract boolean k();

    public e2.r0 l(c1 c1Var, f1 f1Var, int i7, List list) {
        ?? obj = new Object();
        View view = f1Var.f59122a;
        obj.f10687a = view.getLeft();
        obj.f10688b = view.getTop();
        view.getRight();
        view.getBottom();
        return obj;
    }

    public abstract void m();

    public final void n(long j3) {
        this.f59195c = j3;
        this.f59196e = j3;
        this.d = j3;
        this.f59197f = j3;
        this.f59198g = j3;
    }

    public final void o(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        this.f59199i = timeInterpolator;
        this.f59200j = timeInterpolator;
        this.f59201k = timeInterpolator;
    }
}
