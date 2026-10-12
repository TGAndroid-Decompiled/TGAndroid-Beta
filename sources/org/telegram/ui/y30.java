package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class y30 extends s4.t0 {
    public final i60 f44286a;

    public y30(i60 i60Var) {
        this.f44286a = i60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i60 i60Var = this.f44286a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) i60Var).containerView;
        viewGroup.invalidate();
        i60Var.a2.invalidate();
    }
}
