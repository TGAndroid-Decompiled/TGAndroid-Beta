package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class u71 extends s4.t0 {
    public final x71 f42393a;

    public u71(x71 x71Var) {
        this.f42393a = x71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        x71 x71Var = this.f42393a;
        if (x71Var.d.I1) {
            AndroidUtilities.hideKeyboard(x71Var.f43795c0);
        }
        x71.T(x71Var);
    }
}
