package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class w20 extends s4.r0 {
    public final u50 f42905a;

    public w20(u50 u50Var) {
        this.f42905a = u50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f42905a).containerView;
        viewGroup.invalidate();
    }
}
