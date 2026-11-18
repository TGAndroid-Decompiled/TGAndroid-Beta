package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class j1 extends v4.u0 {
    public final int f58710a;
    public final Object f58711b;

    public j1(Object obj, int i7) {
        this.f58710a = i7;
        this.f58711b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f58710a) {
            case 0:
                v0 v0Var = (v0) this.f58711b;
                if (i7 == 1) {
                    v0Var.f58790l3 = true;
                }
                if (i7 == 0) {
                    m1 m1Var = null;
                    for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
                        m1 m1Var2 = (m1) v0Var.getChildAt(i10);
                        if (m1Var == null || m1Var2.f58766a > m1Var.f58766a) {
                            m1Var = m1Var2;
                        }
                    }
                    if (m1Var != null) {
                        v0Var.z1(m1Var, true);
                        v0Var.f58790l3 = false;
                        v0Var.w0(0, m1Var.getTop() - ((v0Var.getMeasuredHeight() - m1Var.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                    }
                    v0Var.A1();
                    return;
                }
                org.telegram.messenger.g0.r(v0Var.f58791m3);
                return;
            case 1:
            default:
                return;
            case 2:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.w0) this.f58711b).U1.getEditText());
                    return;
                }
                return;
            case 3:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((wg.d1) this.f58711b).V1.getEditText());
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58710a) {
            case 0:
                v0 v0Var = (v0) this.f58711b;
                if (recyclerView.getScrollState() == 1) {
                    v0Var.z1(null, true);
                }
                v0Var.invalidate();
                return;
            case 1:
                ((vh.g) this.f58711b).g1();
                return;
            case 2:
            case 3:
            default:
                return;
            case 4:
                v4.c0 c0Var = (v4.c0) recyclerView.getLayoutManager();
                zh.l lVar = (zh.l) this.f58711b;
                zh.e eVar = lVar.C;
                if (lVar.f62029x && !lVar.f62028w && c0Var != null) {
                    if (lVar.f62013f.b() - c0Var.N0() < 10) {
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
