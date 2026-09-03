package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class s2 extends f2.a1 {
    public final z2 f46094a;

    public s2(z2 z2Var) {
        this.f46094a = z2Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        z2 z2Var = this.f46094a;
        if (z2Var.f46397n.H1 && (w0Var = z2Var.D) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(z2Var.D.getSearchContainer());
        }
    }
}
