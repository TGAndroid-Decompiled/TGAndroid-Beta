package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class v30 extends f2.z0 {
    public final e60 f38989a;

    public v30(e60 e60Var) {
        this.f38989a = e60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        e60 e60Var = this.f38989a;
        viewGroup = ((org.telegram.ui.ActionBar.g3) e60Var).containerView;
        viewGroup.invalidate();
        e60Var.X1.invalidate();
    }
}
