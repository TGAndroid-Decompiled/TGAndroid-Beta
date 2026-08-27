package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;

public final class u20 extends f2.b1 {

    public final s50 f43078a;

    public u20(s50 s50Var) {
        this.f43078a = s50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ((org.telegram.ui.ActionBar.e3) this.f43078a).containerView.invalidate();
    }
}
