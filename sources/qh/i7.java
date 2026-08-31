package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class i7 extends f2.a1 {
    public final k7 f45429a;

    public i7(k7 k7Var) {
        this.f45429a = k7Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f45429a).containerView;
        viewGroup.invalidate();
    }
}
