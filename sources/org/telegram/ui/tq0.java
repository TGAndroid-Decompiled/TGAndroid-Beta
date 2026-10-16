package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class tq0 extends s4.r0 {
    public final fr0 f40199a;

    public tq0(fr0 fr0Var) {
        this.f40199a = fr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f40199a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        fr0 fr0Var = this.f40199a;
        if (fr0Var.J == null) {
            int L0 = fr0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(fr0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > fr0Var.M.B() - 2 && !fr0Var.f35932r && !fr0Var.f35934s) {
                if (fr0Var.f35911a == 1) {
                    z10 = true;
                }
                fr0Var.d0(fr0Var.v, fr0Var.f35939w, z10, true);
            }
        }
    }
}
