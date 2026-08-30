package ph;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
public final class u2 implements Runnable {
    public final int f42388a;
    public final v2 f42389b;
    public final x2 f42390c;

    public u2(v2 v2Var, x2 x2Var, int i10) {
        this.f42388a = i10;
        this.f42389b = v2Var;
        this.f42390c = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f42388a) {
            case 0:
                l2 l2Var = this.f42389b.f42474c.d;
                l2Var.getClass();
                x2 x2Var = this.f42390c;
                int R = RecyclerView.R(x2Var);
                if (R != -1) {
                    il0 il0Var = l2Var.S0;
                    if (il0Var != null) {
                        il0Var.f(R, x2Var);
                        return;
                    }
                    jl0 jl0Var = l2Var.T0;
                    if (jl0Var != null) {
                        jl0Var.c(0.0f, 0.0f, R, x2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                l2 l2Var2 = this.f42389b.f42474c.d;
                l2Var2.getClass();
                x2 x2Var2 = this.f42390c;
                int R2 = RecyclerView.R(x2Var2);
                if (R2 != -1) {
                    kl0 kl0Var = l2Var2.U0;
                    if (kl0Var != null) {
                        kl0Var.f(R2, x2Var2);
                        return;
                    }
                    ll0 ll0Var = l2Var2.V0;
                    if (ll0Var != null) {
                        ll0Var.mo18c(0.0f, 0.0f, R2, x2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
