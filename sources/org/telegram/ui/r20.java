package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class r20 extends f2.d1 {
    public final o50 f42255a;

    public r20(o50 o50Var) {
        this.f42255a = o50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f42255a).containerView;
        viewGroup.invalidate();
    }
}
