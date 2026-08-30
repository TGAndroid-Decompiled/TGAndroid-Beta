package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class t30 extends f2.z0 {
    public final c60 f38527a;

    public t30(c60 c60Var) {
        this.f38527a = c60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        c60 c60Var = this.f38527a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
        c60Var.X1.invalidate();
    }
}
