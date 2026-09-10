package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class s71 extends s4.s0 {
    public final v71 f36576a;

    public s71(v71 v71Var) {
        this.f36576a = v71Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        v71 v71Var = this.f36576a;
        if (v71Var.d.K1) {
            AndroidUtilities.hideKeyboard(v71Var.f37436c0);
        }
        v71.S(v71Var);
    }
}
