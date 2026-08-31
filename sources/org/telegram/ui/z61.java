package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class z61 extends f2.a1 {
    public final c71 f43852a;

    public z61(c71 c71Var) {
        this.f43852a = c71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        c71 c71Var = this.f43852a;
        if (c71Var.d.H1) {
            AndroidUtilities.hideKeyboard(c71Var.Z);
        }
        c71.S(c71Var);
    }
}
