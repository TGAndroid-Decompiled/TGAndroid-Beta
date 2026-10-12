package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y71 extends s4.r0 {
    public final b81 f42067a;

    public y71(b81 b81Var) {
        this.f42067a = b81Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b81 b81Var = this.f42067a;
        if (b81Var.d.I1) {
            AndroidUtilities.hideKeyboard(b81Var.f34451c0);
        }
        b81.T(b81Var);
    }
}
