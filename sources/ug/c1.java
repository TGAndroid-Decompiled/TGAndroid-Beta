package ug;

import android.content.Context;
import org.telegram.messenger.mp;
public final class c1 implements Runnable {
    public final int f58674a;
    public final h1 f58675b;

    public c1(h1 h1Var, int i7) {
        this.f58674a = i7;
        this.f58675b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f58674a) {
            case 0:
                h1 h1Var = this.f58675b;
                Context context = h1Var.getContext();
                vf.c.t(context, "https://" + mp.u1(h1Var.U1).X2 + "/nft/" + h1Var.f58736z2.slug);
                return;
            case 1:
                h1 h1Var2 = this.f58675b;
                try {
                    h1Var2.f30176c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.f58721k2.c(h1Var2.G2);
                return;
            default:
                this.f58675b.K2[0].setVisibility(8);
                return;
        }
    }
}
