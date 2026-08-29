package org.telegram.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class v20 extends f2.a1 {
    public final r50 f43408a;

    public v20(r50 r50Var) {
        this.f43408a = r50Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f43408a).containerView;
        viewGroup.invalidate();
    }
}
