package vh;

import androidx.recyclerview.widget.RecyclerView;
public final class d2 extends s4.s0 {
    public final int f51072a;
    public final k2 f51073b;

    public d2(k2 k2Var, int i10) {
        this.f51072a = i10;
        this.f51073b = k2Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.t0 t0Var;
        switch (this.f51072a) {
            case 0:
                k2 k2Var = this.f51073b;
                k2Var.getClass();
                k2Var.invalidate();
                return;
            default:
                k2 k2Var2 = this.f51073b;
                if (k2Var2.f51393n.I1 && (t0Var = k2Var2.G) != null && t0Var.getSearchField() != null) {
                    org.telegram.messenger.i0.v1(k2Var2.G.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
