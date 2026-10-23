package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class j1 extends s4.r0 {
    public final m1 f47697a;

    public j1(m1 m1Var) {
        this.f47697a = m1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f47697a.Z.getEditText());
        }
    }
}
