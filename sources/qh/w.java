package qh;

import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import org.telegram.messenger.AndroidUtilities;
public final class w extends a1 {
    public final i0 f46782a;

    public w(i0 i0Var) {
        this.f46782a = i0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i0 i0Var = this.f46782a;
        if (i0Var.C.G1) {
            AndroidUtilities.hideKeyboard(i0Var.A.f34546r);
        }
    }
}
