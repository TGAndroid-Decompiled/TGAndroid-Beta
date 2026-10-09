package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends s4.t0 {
    public final g60 f43082a;

    public w30(g60 g60Var) {
        this.f43082a = g60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g60 g60Var = this.f43082a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) g60Var).containerView;
        viewGroup.invalidate();
        g60Var.a2.invalidate();
    }
}
