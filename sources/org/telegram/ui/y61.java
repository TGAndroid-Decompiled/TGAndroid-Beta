package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y61 extends f2.z0 {
    public final b71 f40438a;

    public y61(b71 b71Var) {
        this.f40438a = b71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b71 b71Var = this.f40438a;
        if (b71Var.d.H1) {
            AndroidUtilities.hideKeyboard(b71Var.Z);
        }
        b71.S(b71Var);
    }
}
