package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class h7 extends f2.a1 {
    public final j7 f45411a;

    public h7(j7 j7Var) {
        this.f45411a = j7Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f45411a).containerView;
        viewGroup.invalidate();
    }
}
