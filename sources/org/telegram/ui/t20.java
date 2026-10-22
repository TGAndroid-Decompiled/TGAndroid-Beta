package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class t20 extends s4.r0 {
    public final q50 f41587a;

    public t20(q50 q50Var) {
        this.f41587a = q50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f41587a).containerView;
        viewGroup.invalidate();
    }
}
