package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class up0 extends f2.z0 {
    public final fq0 f38987a;

    public up0(fq0 fq0Var) {
        this.f38987a = fq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f38987a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        fq0 fq0Var = this.f38987a;
        if (fq0Var.G == null) {
            int L0 = fq0Var.J.L0();
            boolean z4 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(fq0Var.J.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > fq0Var.J.B() - 2 && !fq0Var.f34334r && !fq0Var.f34336s) {
                if (fq0Var.f34313a == 1) {
                    z4 = true;
                }
                fq0Var.d0(fq0Var.v, fq0Var.f34340w, z4, true);
            }
        }
    }
}
