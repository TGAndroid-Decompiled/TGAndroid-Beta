package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rq0 extends s4.t0 {
    public final dr0 f41707a;

    public rq0(dr0 dr0Var) {
        this.f41707a = dr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f41707a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        dr0 dr0Var = this.f41707a;
        if (dr0Var.J == null) {
            int L0 = dr0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(dr0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > dr0Var.M.B() - 2 && !dr0Var.f36888r && !dr0Var.f36890s) {
                if (dr0Var.f36866a == 1) {
                    z10 = true;
                }
                dr0Var.d0(dr0Var.v, dr0Var.f36895w, z10, true);
            }
        }
    }
}
