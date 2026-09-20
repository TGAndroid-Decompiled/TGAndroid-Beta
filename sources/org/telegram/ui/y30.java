package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class y30 extends s4.s0 {
    public final i60 f39793a;

    public y30(i60 i60Var) {
        this.f39793a = i60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i60 i60Var = this.f39793a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
        i60Var.a2.invalidate();
    }
}
