package s4;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.vw0;
public abstract class w extends u {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        int i10;
        vw0 vw0Var = (vw0) this;
        if (c1Var.f47901f == 3) {
            i10 = 0;
        } else {
            i10 = vw0Var.d;
        }
        return u.l(i10, 0);
    }
}
