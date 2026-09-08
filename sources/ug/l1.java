package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class l1 extends s4.s0 {
    public final n1 f47175a;

    public l1(n1 n1Var) {
        this.f47175a = n1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f47175a.Z.getEditText());
        }
    }
}
