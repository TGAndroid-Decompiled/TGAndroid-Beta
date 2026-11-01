package s4;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ww0;
public abstract class w extends u {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, c1 c1Var) {
        int i10;
        ww0 ww0Var = (ww0) this;
        if (c1Var.f47912f == 3) {
            i10 = 0;
        } else {
            i10 = ww0Var.d;
        }
        return u.l(i10, 0);
    }
}
