package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j6 extends f2.a1 {
    public final k6 f45496a;

    public j6(k6 k6Var) {
        this.f45496a = k6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            k6 k6Var = this.f45496a;
            if (k6Var.f45572f0) {
                k6Var.f45572f0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        k6 k6Var = this.f45496a;
        k6Var.d0();
        k6Var.X();
        if (k6Var.d.H1 && !k6Var.f45572f0) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) k6Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
