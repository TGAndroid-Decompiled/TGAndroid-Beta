package v4;

import a8.va;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ff;
import org.telegram.ui.ld0;
public final class g0 {
    public final RecyclerView f58563a;

    public g0(RecyclerView recyclerView) {
        this.f58563a = recyclerView;
    }

    public void a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        boolean z10;
        e1 T;
        int i11;
        RecyclerView recyclerView = this.f58563a;
        recyclerView.f2799b.k(e1Var);
        recyclerView.h(e1Var);
        e1Var.q(false);
        g1 g1Var = (g1) recyclerView.f2803d0;
        g1Var.getClass();
        int i12 = r0Var.f10369a;
        int i13 = r0Var.f10370b;
        View view = e1Var.f58535a;
        if (r0Var2 == null) {
            i7 = view.getLeft();
        } else {
            i7 = r0Var2.f10369a;
        }
        int i14 = i7;
        if (r0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = r0Var2.f10370b;
        }
        int i15 = i10;
        if (!e1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = g1Var.r(e1Var, r0Var, i12, i13, i14, i15);
        } else {
            int i16 = e1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            e1Var.f58541i = (e1Var.h - i17) + (i17 * 1000);
            g1Var.s(e1Var, r0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(e1 e1Var) {
        RecyclerView recyclerView = this.f58563a;
        o0 o0Var = recyclerView.f2830y;
        View view = e1Var.f58535a;
        w0 w0Var = recyclerView.f2799b;
        ld0 ld0Var = o0Var.f58621a;
        ff ffVar = (ff) ld0Var.f48972b;
        int indexOfChild = ((RecyclerView) ffVar.f34590b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((va) ld0Var.f48973c).x(indexOfChild)) {
                ld0Var.K(view);
            }
            ffVar.C0(indexOfChild);
        }
        w0Var.g(view);
    }
}
