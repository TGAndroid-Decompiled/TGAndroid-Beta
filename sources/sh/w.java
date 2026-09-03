package sh;

import androidx.recyclerview.widget.RecyclerView;
import f2.z0;
import org.telegram.messenger.AndroidUtilities;
public final class w extends z0 {
    public final i0 f44478a;

    public w(i0 i0Var) {
        this.f44478a = i0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i0 i0Var = this.f44478a;
        if (i0Var.D.H1) {
            AndroidUtilities.hideKeyboard(i0Var.B.f24117r);
        }
    }
}
