package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class xp0 extends s4.r0 {
    public final jq0 f43261a;

    public xp0(jq0 jq0Var) {
        this.f43261a = jq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f43261a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        jq0 jq0Var = this.f43261a;
        if (jq0Var.J == null) {
            int L0 = jq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(jq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > jq0Var.M.B() - 2 && !jq0Var.f38325r && !jq0Var.f38327s) {
                if (jq0Var.f38304a == 1) {
                    z10 = true;
                }
                jq0Var.d0(jq0Var.v, jq0Var.f38332w, z10, true);
            }
        }
    }
}
