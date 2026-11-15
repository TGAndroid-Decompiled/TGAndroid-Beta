package ug;

import android.content.Context;
import org.telegram.messenger.np;
public final class b1 implements Runnable {
    public final int f58046a;
    public final g1 f58047b;

    public b1(g1 g1Var, int i7) {
        this.f58046a = i7;
        this.f58047b = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f58046a) {
            case 0:
                g1 g1Var = this.f58047b;
                Context context = g1Var.getContext();
                vf.c.t(context, "https://" + np.s1(g1Var.U1).V2 + "/nft/" + g1Var.f58111z2.slug);
                return;
            case 1:
                g1 g1Var2 = this.f58047b;
                try {
                    g1Var2.f29685c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                g1Var2.f58096k2.c(g1Var2.G2);
                return;
            default:
                this.f58047b.K2[0].setVisibility(8);
                return;
        }
    }
}
