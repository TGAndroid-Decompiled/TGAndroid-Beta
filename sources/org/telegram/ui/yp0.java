package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yp0 extends s4.r0 {
    public final kq0 f43466a;

    public yp0(kq0 kq0Var) {
        this.f43466a = kq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f43466a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        kq0 kq0Var = this.f43466a;
        if (kq0Var.J == null) {
            int L0 = kq0Var.M.L0();
            boolean z10 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(kq0Var.M.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > kq0Var.M.B() - 2 && !kq0Var.f38658r && !kq0Var.f38660s) {
                if (kq0Var.f38637a == 1) {
                    z10 = true;
                }
                kq0Var.d0(kq0Var.v, kq0Var.f38665w, z10, true);
            }
        }
    }
}
