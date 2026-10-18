package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class v20 extends s4.r0 {
    public final s50 f42123a;

    public v20(s50 s50Var) {
        this.f42123a = s50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f42123a).containerView;
        viewGroup.invalidate();
    }
}
