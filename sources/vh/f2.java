package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.nb0;
public final class f2 implements Runnable {
    public final int f51126a;
    public final g2 f51127b;
    public final h2 f51128c;

    public f2(g2 g2Var, h2 h2Var, int i10) {
        this.f51126a = i10;
        this.f51127b = g2Var;
        this.f51128c = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f51126a) {
            case 0:
                nb0 nb0Var = this.f51127b.f51189c.d;
                nb0Var.getClass();
                h2 h2Var = this.f51128c;
                int R = RecyclerView.R(h2Var);
                if (R != -1) {
                    gk0 gk0Var = nb0Var.T0;
                    if (gk0Var != null) {
                        gk0Var.f(R, h2Var);
                        return;
                    }
                    hk0 hk0Var = nb0Var.U0;
                    if (hk0Var != null) {
                        hk0Var.b(0.0f, 0.0f, R, h2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                nb0 nb0Var2 = this.f51127b.f51189c.d;
                nb0Var2.getClass();
                h2 h2Var2 = this.f51128c;
                int R2 = RecyclerView.R(h2Var2);
                if (R2 != -1) {
                    ik0 ik0Var = nb0Var2.V0;
                    if (ik0Var != null) {
                        ik0Var.f(R2, h2Var2);
                        return;
                    }
                    jk0 jk0Var = nb0Var2.W0;
                    if (jk0Var != null) {
                        jk0Var.mo16b(0.0f, 0.0f, R2, h2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
