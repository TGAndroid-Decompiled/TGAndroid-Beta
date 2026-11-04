package u4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.ig;
import org.telegram.ui.Components.nh;
public final class g0 {
    public final RecyclerView f55573a;

    public g0(RecyclerView recyclerView) {
        this.f55573a = recyclerView;
    }

    public void a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        int i3;
        int i10;
        boolean z10;
        d1 T;
        int i11;
        RecyclerView recyclerView = this.f55573a;
        recyclerView.f2274b.k(d1Var);
        recyclerView.h(d1Var);
        d1Var.q(false);
        f1 f1Var = (f1) recyclerView.f2278d0;
        f1Var.getClass();
        int i12 = t0Var.f8413a;
        int i13 = t0Var.f8414b;
        View view = d1Var.f55540a;
        if (t0Var2 == null) {
            i3 = view.getLeft();
        } else {
            i3 = t0Var2.f8413a;
        }
        int i14 = i3;
        if (t0Var2 == null) {
            i10 = view.getTop();
        } else {
            i10 = t0Var2.f8414b;
        }
        int i15 = i10;
        if (!d1Var.j() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = f1Var.r(d1Var, t0Var, i12, i13, i14, i15);
        } else {
            int i16 = d1Var.h;
            int i17 = -1;
            if (i16 != -1) {
                for (int i18 = 0; i18 < recyclerView.getChildCount(); i18++) {
                    View childAt = recyclerView.getChildAt(i18);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i11 = T.h) >= 0 && i11 < i16 && i11 > i17) {
                        i17 = i11;
                    }
                }
            }
            d1Var.f55546i = (d1Var.h - i17) + (i17 * 1000);
            f1Var.s(d1Var, t0Var);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(d1 d1Var) {
        RecyclerView recyclerView = this.f55573a;
        o0 o0Var = recyclerView.f2305y;
        View view = d1Var.f55540a;
        tf.e eVar = recyclerView.f2274b;
        p7.d dVar = o0Var.f55629a;
        nh nhVar = (nh) dVar.f53345b;
        int indexOfChild = ((RecyclerView) nhVar.f36540b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((ig) dVar.d).G(indexOfChild)) {
                dVar.H(view);
            }
            nhVar.I(indexOfChild);
        }
        eVar.g(view);
    }
}
