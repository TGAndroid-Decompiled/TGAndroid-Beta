package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class i1 extends s4.r0 {
    public final l1 f47705a;

    public i1(l1 l1Var) {
        this.f47705a = l1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f47705a.Z.getEditText());
        }
    }
}
