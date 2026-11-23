package ug;

import android.content.Context;
import org.telegram.messenger.np;
public final class c1 implements Runnable {
    public final int f58678a;
    public final h1 f58679b;

    public c1(h1 h1Var, int i7) {
        this.f58678a = i7;
        this.f58679b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f58678a) {
            case 0:
                h1 h1Var = this.f58679b;
                Context context = h1Var.getContext();
                vf.c.t(context, "https://" + np.u1(h1Var.U1).X2 + "/nft/" + h1Var.f58740z2.slug);
                return;
            case 1:
                h1 h1Var2 = this.f58679b;
                try {
                    h1Var2.f30179c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.f58725k2.c(h1Var2.G2);
                return;
            default:
                this.f58679b.K2[0].setVisibility(8);
                return;
        }
    }
}
