package ph;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k6 extends f2.z0 {
    public final l6 f41921a;

    public k6(l6 l6Var) {
        this.f41921a = l6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            l6 l6Var = this.f41921a;
            if (l6Var.f41951f0) {
                l6Var.f41951f0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        l6 l6Var = this.f41921a;
        l6Var.d0();
        l6Var.X();
        if (l6Var.d.H1 && !l6Var.f41951f0) {
            viewGroup = ((org.telegram.ui.ActionBar.g3) l6Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
