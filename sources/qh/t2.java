package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends f2.a1 {
    public final a3 f46114a;

    public t2(a3 a3Var) {
        this.f46114a = a3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        a3 a3Var = this.f46114a;
        if (a3Var.f44902n.H1 && (w0Var = a3Var.D) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(a3Var.D.getSearchContainer());
        }
    }
}
