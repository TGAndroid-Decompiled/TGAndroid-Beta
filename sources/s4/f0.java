package s4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class f0 {
    public final RecyclerView f47937a;

    public f0(RecyclerView recyclerView) {
        this.f47937a = recyclerView;
    }

    public void a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        int i10;
        int i11;
        boolean z10;
        c1 T;
        int i12;
        RecyclerView recyclerView = this.f47937a;
        recyclerView.f1894b.k(c1Var);
        recyclerView.h(c1Var);
        c1Var.q(false);
        f1 f1Var = (f1) recyclerView.f1897c0;
        f1Var.getClass();
        int i13 = gVar.f385a;
        int i14 = gVar.f386b;
        View view = c1Var.f47909a;
        if (gVar2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = gVar2.f385a;
        }
        int i15 = i10;
        if (gVar2 == null) {
            i11 = view.getTop();
        } else {
            i11 = gVar2.f386b;
        }
        int i16 = i11;
        if (!c1Var.j() && (i13 != i15 || i14 != i16)) {
            view.layout(i15, i16, view.getWidth() + i15, view.getHeight() + i16);
            z10 = f1Var.r(c1Var, gVar, i13, i14, i15, i16);
        } else {
            int i17 = c1Var.h;
            int i18 = -1;
            if (i17 != -1) {
                for (int i19 = 0; i19 < recyclerView.getChildCount(); i19++) {
                    View childAt = recyclerView.getChildAt(i19);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i12 = T.h) >= 0 && i12 < i17 && i12 > i18) {
                        i18 = i12;
                    }
                }
            }
            c1Var.f47914i = (c1Var.h - i18) + (i18 * 1000);
            f1Var.s(c1Var, gVar);
            z10 = true;
        }
        if (z10) {
            recyclerView.m0();
        }
    }

    public void b(c1 c1Var) {
        RecyclerView recyclerView = this.f47937a;
        n0 n0Var = recyclerView.f1924y;
        View view = c1Var.f47909a;
        hf.e eVar = recyclerView.f1894b;
        q5.d dVar = n0Var.f47989a;
        m2.t tVar = (m2.t) dVar.f45498b;
        int indexOfChild = ((RecyclerView) tVar.f12685b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((c3.g0) dVar.f45499c).H(indexOfChild)) {
                dVar.y(view);
            }
            tVar.J(indexOfChild);
        }
        eVar.g(view);
    }
}
