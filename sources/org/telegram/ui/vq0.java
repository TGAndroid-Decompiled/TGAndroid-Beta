package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vq0 extends s4.r0 {
    public final hr0 f41061a;

    public vq0(hr0 hr0Var) {
        this.f41061a = hr0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f41061a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        hr0 hr0Var = this.f41061a;
        if (hr0Var.J == null) {
            int L0 = hr0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(hr0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > hr0Var.M.B() - 2 && !hr0Var.f36934r && !hr0Var.f36936s) {
                if (hr0Var.f36913a == 1) {
                    z10 = true;
                }
                hr0Var.d0(hr0Var.v, hr0Var.f36941w, z10, true);
            }
        }
    }
}
