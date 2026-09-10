package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class z30 extends s4.s0 {
    public final j60 f39201a;

    public z30(j60 j60Var) {
        this.f39201a = j60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        j60 j60Var = this.f39201a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) j60Var).containerView;
        viewGroup.invalidate();
        j60Var.a2.invalidate();
    }
}
