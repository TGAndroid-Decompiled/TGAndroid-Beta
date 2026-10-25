package vg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k1 extends s4.u0 {
    public final n1 f50187a;

    public k1(n1 n1Var) {
        this.f50187a = n1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f50187a.Z.getEditText());
        }
    }
}
