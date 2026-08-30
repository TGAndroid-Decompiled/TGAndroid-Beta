package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class k7 extends f2.z0 {
    public final m7 f41861a;

    public k7(m7 m7Var) {
        this.f41861a = m7Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f41861a).containerView;
        viewGroup.invalidate();
    }
}
