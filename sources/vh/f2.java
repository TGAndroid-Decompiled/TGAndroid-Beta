package vh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.mb0;
public final class f2 implements Runnable {
    public final int f51141a;
    public final g2 f51142b;
    public final h2 f51143c;

    public f2(g2 g2Var, h2 h2Var, int i10) {
        this.f51141a = i10;
        this.f51142b = g2Var;
        this.f51143c = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f51141a) {
            case 0:
                mb0 mb0Var = this.f51142b.f51204c.d;
                mb0Var.getClass();
                h2 h2Var = this.f51143c;
                int R = RecyclerView.R(h2Var);
                if (R != -1) {
                    hk0 hk0Var = mb0Var.T0;
                    if (hk0Var != null) {
                        hk0Var.f(R, h2Var);
                        return;
                    }
                    ik0 ik0Var = mb0Var.U0;
                    if (ik0Var != null) {
                        ik0Var.b(0.0f, 0.0f, R, h2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                mb0 mb0Var2 = this.f51142b.f51204c.d;
                mb0Var2.getClass();
                h2 h2Var2 = this.f51143c;
                int R2 = RecyclerView.R(h2Var2);
                if (R2 != -1) {
                    jk0 jk0Var = mb0Var2.V0;
                    if (jk0Var != null) {
                        jk0Var.f(R2, h2Var2);
                        return;
                    }
                    kk0 kk0Var = mb0Var2.W0;
                    if (kk0Var != null) {
                        kk0Var.mo16b(0.0f, 0.0f, R2, h2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
