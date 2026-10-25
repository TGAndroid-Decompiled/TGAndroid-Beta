package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class uj0 extends s4.u0 {
    public final int f44150a;
    public final org.telegram.ui.Components.r71 f44151b;
    public final vj0 f44152c;
    public final xj0 d;

    public uj0(xj0 xj0Var, int i10, org.telegram.ui.Components.r71 r71Var, vj0 vj0Var) {
        this.d = xj0Var;
        this.f44150a = i10;
        this.f44151b = r71Var;
        this.f44152c = vj0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            int i11 = this.f44150a;
            xj0 xj0Var = this.d;
            if (i11 != 2) {
                xj0.a0(xj0Var);
            } else if (xj0Var.getParentActivity() != null) {
                AndroidUtilities.hideKeyboard(xj0Var.getParentActivity().getCurrentFocus());
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12 = this.f44150a;
        xj0 xj0Var = this.d;
        vj0 vj0Var = this.f44152c;
        if (i11 >= 0) {
            org.telegram.ui.Components.r71 r71Var = this.f44151b;
            if (r71Var.f32149f3.N0() >= r71Var.f32150g3.f29509y.size() - 5 && !vj0Var.f44842k) {
                xj0Var.l0(i12, false);
            }
        }
        if (i12 == 1) {
            xj0Var.m0(vj0Var);
        }
    }
}
