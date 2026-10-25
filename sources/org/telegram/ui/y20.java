package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class y20 extends s4.u0 {
    public final v50 f45933a;

    public y20(v50 v50Var) {
        this.f45933a = v50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f45933a).containerView;
        viewGroup.invalidate();
    }
}
