package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
public final class j7 extends f2.z0 {
    public final l7 f41820a;

    public j7(l7 l7Var) {
        this.f41820a = l7Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f41820a).containerView;
        viewGroup.invalidate();
    }
}
