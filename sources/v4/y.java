package v4;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.dw0;
public abstract class y extends w {
    public int d;

    @Override
    public final int e(RecyclerView recyclerView, f1 f1Var) {
        int i7;
        dw0 dw0Var = (dw0) this;
        if (f1Var.f59169f == 3) {
            i7 = 0;
        } else {
            i7 = dw0Var.d;
        }
        return w.l(i7, 0);
    }
}
