package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class r71 extends s4.t0 {
    public final u71 f41299a;

    public r71(u71 u71Var) {
        this.f41299a = u71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        u71 u71Var = this.f41299a;
        if (u71Var.d.I1) {
            AndroidUtilities.hideKeyboard(u71Var.f42352c0);
        }
        u71.T(u71Var);
    }
}
