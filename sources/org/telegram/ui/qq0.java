package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qq0 extends s4.s0 {
    public final cr0 f36959a;

    public qq0(cr0 cr0Var) {
        this.f36959a = cr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f36959a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        cr0 cr0Var = this.f36959a;
        if (cr0Var.J == null) {
            int L0 = cr0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(cr0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > cr0Var.M.B() - 2 && !cr0Var.f32853r && !cr0Var.f32855s) {
                if (cr0Var.f32832a == 1) {
                    z10 = true;
                }
                cr0Var.d0(cr0Var.v, cr0Var.f32860w, z10, true);
            }
        }
    }
}
