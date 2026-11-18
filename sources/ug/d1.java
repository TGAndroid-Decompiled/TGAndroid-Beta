package ug;

import android.content.Context;
import org.telegram.messenger.mp;
public final class d1 implements Runnable {
    public final int f58641a;
    public final i1 f58642b;

    public d1(i1 i1Var, int i7) {
        this.f58641a = i7;
        this.f58642b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f58641a) {
            case 0:
                i1 i1Var = this.f58642b;
                Context context = i1Var.getContext();
                vf.c.t(context, "https://" + mp.u1(i1Var.U1).X2 + "/nft/" + i1Var.f58701z2.slug);
                return;
            case 1:
                i1 i1Var2 = this.f58642b;
                try {
                    i1Var2.f30195c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                i1Var2.f58686k2.c(i1Var2.G2);
                return;
            default:
                this.f58642b.K2[0].setVisibility(8);
                return;
        }
    }
}
