package ug;

import android.content.Context;
import org.telegram.messenger.np;
public final class c1 implements Runnable {
    public final int f58643a;
    public final h1 f58644b;

    public c1(h1 h1Var, int i7) {
        this.f58643a = i7;
        this.f58644b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f58643a) {
            case 0:
                h1 h1Var = this.f58644b;
                Context context = h1Var.getContext();
                vf.c.t(context, "https://" + np.u1(h1Var.U1).X2 + "/nft/" + h1Var.f58705z2.slug);
                return;
            case 1:
                h1 h1Var2 = this.f58644b;
                try {
                    h1Var2.f30145c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.f58690k2.c(h1Var2.G2);
                return;
            default:
                this.f58644b.K2[0].setVisibility(8);
                return;
        }
    }
}
