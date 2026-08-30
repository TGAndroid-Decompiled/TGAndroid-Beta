package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class t2 extends f2.z0 {
    public final a3 f42328a;

    public t2(a3 a3Var) {
        this.f42328a = a3Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        org.telegram.ui.ActionBar.w0 w0Var;
        a3 a3Var = this.f42328a;
        if (a3Var.f41264n.H1 && (w0Var = a3Var.D) != null && w0Var.getSearchField() != null) {
            AndroidUtilities.hideKeyboard(a3Var.D.getSearchContainer());
        }
    }
}
