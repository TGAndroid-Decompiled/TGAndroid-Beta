package sg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class n1 extends s4.s0 {
    public final p1 f41960a;

    public n1(p1 p1Var) {
        this.f41960a = p1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f41960a.Z.getEditText());
        }
    }
}
