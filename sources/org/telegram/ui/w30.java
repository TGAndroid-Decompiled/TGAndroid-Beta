package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class w30 extends s4.s0 {
    public final g60 f38803a;

    public w30(g60 g60Var) {
        this.f38803a = g60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        g60 g60Var = this.f38803a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.invalidate();
        g60Var.a2.invalidate();
    }
}
