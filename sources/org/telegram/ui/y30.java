package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class y30 extends s4.s0 {
    public final h60 f43042a;

    public y30(h60 h60Var) {
        this.f43042a = h60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        h60 h60Var = this.f43042a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60Var.a2.invalidate();
    }
}
