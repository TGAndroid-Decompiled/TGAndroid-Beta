package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
public final class u2 implements Runnable {
    public final int f46148a;
    public final v2 f46149b;
    public final x2 f46150c;

    public u2(v2 v2Var, x2 x2Var, int i10) {
        this.f46148a = i10;
        this.f46149b = v2Var;
        this.f46150c = x2Var;
    }

    @Override
    public final void run() {
        switch (this.f46148a) {
            case 0:
                l2 l2Var = this.f46149b.f46188c.d;
                l2Var.getClass();
                x2 x2Var = this.f46150c;
                int R = RecyclerView.R(x2Var);
                if (R != -1) {
                    jl0 jl0Var = l2Var.S0;
                    if (jl0Var != null) {
                        jl0Var.f(R, x2Var);
                        return;
                    }
                    kl0 kl0Var = l2Var.T0;
                    if (kl0Var != null) {
                        kl0Var.c(0.0f, 0.0f, R, x2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                l2 l2Var2 = this.f46149b.f46188c.d;
                l2Var2.getClass();
                x2 x2Var2 = this.f46150c;
                int R2 = RecyclerView.R(x2Var2);
                if (R2 != -1) {
                    ll0 ll0Var = l2Var2.U0;
                    if (ll0Var != null) {
                        ll0Var.f(R2, x2Var2);
                        return;
                    }
                    ml0 ml0Var = l2Var2.V0;
                    if (ml0Var != null) {
                        ml0Var.mo17c(0.0f, 0.0f, R2, x2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
