package tg;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class k1 extends s4.s0 {
    public final m1 f43427a;

    public k1(m1 m1Var) {
        this.f43427a = m1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.f43427a.Z.getEditText());
        }
    }
}
