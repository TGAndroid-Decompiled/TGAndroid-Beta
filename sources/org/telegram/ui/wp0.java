package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wp0 extends f2.a1 {
    public final hq0 f42870a;

    public wp0(hq0 hq0Var) {
        this.f42870a = hq0Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f42870a.getParentActivity().getCurrentFocus());
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int abs;
        hq0 hq0Var = this.f42870a;
        if (hq0Var.G == null) {
            int L0 = hq0Var.J.L0();
            boolean z4 = false;
            if (L0 == -1) {
                abs = 0;
            } else {
                abs = Math.abs(hq0Var.J.N0() - L0) + 1;
            }
            if (abs > 0 && L0 + abs > hq0Var.J.B() - 2 && !hq0Var.f37593r && !hq0Var.f37595s) {
                if (hq0Var.f37571a == 1) {
                    z4 = true;
                }
                hq0Var.d0(hq0Var.v, hq0Var.f37599w, z4, true);
            }
        }
    }
}
