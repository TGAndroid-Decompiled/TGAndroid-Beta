package ug;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k1 extends s4.r0 {
    public final m1 f46327a;

    public k1(m1 m1Var) {
        this.f46327a = m1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f46327a.Z.getEditText());
        }
    }
}
