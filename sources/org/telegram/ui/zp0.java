package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class zp0 extends s4.r0 {
    public final lq0 f44192a;

    public zp0(lq0 lq0Var) {
        this.f44192a = lq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f44192a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        lq0 lq0Var = this.f44192a;
        if (lq0Var.J == null) {
            int L0 = lq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(lq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > lq0Var.M.B() - 2 && !lq0Var.f39354r && !lq0Var.f39356s) {
                if (lq0Var.f39333a == 1) {
                    z10 = true;
                }
                lq0Var.d0(lq0Var.v, lq0Var.f39361w, z10, true);
            }
        }
    }
}
