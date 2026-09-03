package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class u30 extends f2.a1 {
    public final d60 f41718a;

    public u30(d60 d60Var) {
        this.f41718a = d60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d60 d60Var = this.f41718a;
        viewGroup = ((org.telegram.ui.ActionBar.h3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.X1.invalidate();
    }
}
