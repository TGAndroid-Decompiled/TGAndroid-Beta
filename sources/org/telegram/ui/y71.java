package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class y71 extends s4.r0 {
    public final b81 f41770a;

    public y71(b81 b81Var) {
        this.f41770a = b81Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        b81 b81Var = this.f41770a;
        if (b81Var.d.I1) {
            AndroidUtilities.hideKeyboard(b81Var.f34235c0);
        }
        b81.T(b81Var);
    }
}
