package v4;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bw0;
public abstract class y extends w {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, f1 f1Var) {
        int i7;
        bw0 bw0Var = (bw0) this;
        if (f1Var.f59127f == 3) {
            i7 = 0;
        } else {
            i7 = bw0Var.d;
        }
        return w.l(i7, 0);
    }
}
