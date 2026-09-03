package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
public final class u2 implements Runnable {
    public final int f42469a;
    public final v2 f42470b;
    public final x2 f42471c;

    public u2(v2 v2Var, x2 x2Var, int i10) {
        this.f42469a = i10;
        this.f42470b = v2Var;
        this.f42471c = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f42469a) {
            case 0:
                l2 l2Var = this.f42470b.f42506c.d;
                l2Var.getClass();
                x2 x2Var = this.f42471c;
                int R = RecyclerView.R(x2Var);
                if (R != -1) {
                    hl0 hl0Var = l2Var.S0;
                    if (hl0Var != null) {
                        hl0Var.d(R, x2Var);
                        return;
                    }
                    il0 il0Var = l2Var.T0;
                    if (il0Var != null) {
                        il0Var.c(0.0f, 0.0f, R, x2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                l2 l2Var2 = this.f42470b.f42506c.d;
                l2Var2.getClass();
                x2 x2Var2 = this.f42471c;
                int R2 = RecyclerView.R(x2Var2);
                if (R2 != -1) {
                    jl0 jl0Var = l2Var2.U0;
                    if (jl0Var != null) {
                        jl0Var.d(R2, x2Var2);
                        return;
                    }
                    kl0 kl0Var = l2Var2.V0;
                    if (kl0Var != null) {
                        kl0Var.mo17c(0.0f, 0.0f, R2, x2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
