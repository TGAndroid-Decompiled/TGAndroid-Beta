package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class i1 extends v4.u0 {
    public final int f58824a;
    public final Object f58825b;

    public i1(Object obj, int i7) {
        this.f58824a = i7;
        this.f58825b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f58824a) {
            case 0:
                u0 u0Var = (u0) this.f58825b;
                if (i7 == 1) {
                    u0Var.f58907l3 = true;
                }
                if (i7 == 0) {
                    l1 l1Var = null;
                    for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                        l1 l1Var2 = (l1) u0Var.getChildAt(i10);
                        if (l1Var == null || l1Var2.f58878a > l1Var.f58878a) {
                            l1Var = l1Var2;
                        }
                    }
                    if (l1Var != null) {
                        u0Var.z1(l1Var, true);
                        u0Var.f58907l3 = false;
                        u0Var.w0(0, l1Var.getTop() - ((u0Var.getMeasuredHeight() - l1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    u0Var.A1();
                    return;
                }
                org.telegram.messenger.g0.r(u0Var.f58908m3);
                return;
            case 1:
            default:
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.v0) this.f58825b).U1.getEditText());
                    return;
                }
                return;
            case 3:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.d1) this.f58825b).V1.getEditText());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58824a) {
            case 0:
                u0 u0Var = (u0) this.f58825b;
                if (recyclerView.getScrollState() == 1) {
                    u0Var.z1(null, true);
                }
                u0Var.invalidate();
                return;
            case 1:
                ((vh.g) this.f58825b).g1();
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
                zh.l lVar = (zh.l) this.f58825b;
                zh.e eVar = lVar.C;
                if (lVar.f62157x && !lVar.f62156w && c0Var != null) {
                    if (lVar.f62141f.b() - c0Var.N0() < 10) {
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
