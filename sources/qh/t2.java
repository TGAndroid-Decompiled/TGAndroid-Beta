package qh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
public final class t2 implements Runnable {
    public final int f46128a;
    public final u2 f46129b;
    public final w2 f46130c;

    public t2(u2 u2Var, w2 w2Var, int i10) {
        this.f46128a = i10;
        this.f46129b = u2Var;
        this.f46130c = w2Var;
    }

    @Override
    public final void run() {
        switch (this.f46128a) {
            case 0:
                k2 k2Var = this.f46129b.f46164c.d;
                k2Var.getClass();
                w2 w2Var = this.f46130c;
                int R = RecyclerView.R(w2Var);
                if (R != -1) {
                    il0 il0Var = k2Var.S0;
                    if (il0Var != null) {
                        il0Var.f(R, w2Var);
                        return;
                    }
                    jl0 jl0Var = k2Var.T0;
                    if (jl0Var != null) {
                        jl0Var.c(0.0f, 0.0f, R, w2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                k2 k2Var2 = this.f46129b.f46164c.d;
                k2Var2.getClass();
                w2 w2Var2 = this.f46130c;
                int R2 = RecyclerView.R(w2Var2);
                if (R2 != -1) {
                    kl0 kl0Var = k2Var2.U0;
                    if (kl0Var != null) {
                        kl0Var.f(R2, w2Var2);
                        return;
                    }
                    ll0 ll0Var = k2Var2.V0;
                    if (ll0Var != null) {
                        ll0Var.mo17c(0.0f, 0.0f, R2, w2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
