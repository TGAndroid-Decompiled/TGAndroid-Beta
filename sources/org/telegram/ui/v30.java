package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class v30 extends s4.s0 {
    public final f60 f38286a;

    public v30(f60 f60Var) {
        this.f38286a = f60Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        f60 f60Var = this.f38286a;
        viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
        viewGroup.invalidate();
        f60Var.a2.invalidate();
    }
}
