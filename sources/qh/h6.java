package qh;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class h6 extends f2.a1 {
    public final i6 f45410a;

    public h6(i6 i6Var) {
        this.f45410a = i6Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            i6 i6Var = this.f45410a;
            if (i6Var.f45471f0) {
                i6Var.f45471f0 = false;
            }
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ViewGroup viewGroup;
        i6 i6Var = this.f45410a;
        i6Var.d0();
        i6Var.X();
        if (i6Var.d.H1 && !i6Var.f45471f0) {
            viewGroup = ((org.telegram.ui.ActionBar.h3) i6Var).containerView;
            AndroidUtilities.hideKeyboard(viewGroup);
        }
    }
}
