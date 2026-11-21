package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class i1 extends v4.u0 {
    public final int f58740a;
    public final Object f58741b;

    public i1(Object obj, int i7) {
        this.f58740a = i7;
        this.f58741b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f58740a) {
            case 0:
                u0 u0Var = (u0) this.f58741b;
                if (i7 == 1) {
                    u0Var.f58823l3 = true;
                }
                if (i7 == 0) {
                    l1 l1Var = null;
                    for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                        l1 l1Var2 = (l1) u0Var.getChildAt(i10);
                        if (l1Var == null || l1Var2.f58794a > l1Var.f58794a) {
                            l1Var = l1Var2;
                        }
                    }
                    if (l1Var != null) {
                        u0Var.z1(l1Var, true);
                        u0Var.f58823l3 = false;
                        u0Var.w0(0, l1Var.getTop() - ((u0Var.getMeasuredHeight() - l1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    u0Var.A1();
                    return;
                }
                org.telegram.messenger.g0.r(u0Var.f58824m3);
                return;
            case 1:
            default:
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) this.f58741b).U1.getEditText());
                    return;
                }
                return;
            case 3:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.e1) this.f58741b).V1.getEditText());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58740a) {
            case 0:
                u0 u0Var = (u0) this.f58741b;
                if (recyclerView.getScrollState() == 1) {
                    u0Var.z1(null, true);
                }
                u0Var.invalidate();
                return;
            case 1:
                ((vh.g) this.f58741b).g1();
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
                zh.l lVar = (zh.l) this.f58741b;
                zh.e eVar = lVar.C;
                if (lVar.f62070x && !lVar.f62069w && c0Var != null) {
                    if (lVar.f62054f.b() - c0Var.N0() < 10) {
                        org.telegram.messenger.g0.r(eVar);
                        org.telegram.messenger.g0.g3(eVar);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
