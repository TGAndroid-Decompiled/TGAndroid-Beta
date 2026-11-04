package vg;

import android.content.Context;
import org.telegram.messenger.hp;
public final class z0 implements Runnable {
    public final int f56935a;
    public final h1 f56936b;

    public z0(h1 h1Var, int i3) {
        this.f56935a = i3;
        this.f56936b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f56935a) {
            case 0:
                h1 h1Var = this.f56936b;
                Context context = h1Var.getContext();
                sf.c.t(context, "https://" + hp.s1(h1Var.R1).V2 + "/nft/" + h1Var.f56645w2.slug);
                return;
            case 1:
                h1 h1Var2 = this.f56936b;
                try {
                    h1Var2.f28589c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                h1Var2.f56630h2.c(h1Var2.D2);
                return;
            default:
                this.f56936b.H2[0].setVisibility(8);
                return;
        }
    }
}
