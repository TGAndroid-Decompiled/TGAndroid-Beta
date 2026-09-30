package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class t30 extends s4.s0 {
    public final d60 f38063a;

    public t30(d60 d60Var) {
        this.f38063a = d60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        d60 d60Var = this.f38063a;
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60Var.a2.invalidate();
    }
}
