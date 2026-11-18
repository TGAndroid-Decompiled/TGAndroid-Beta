package ug;

import android.content.Context;
import org.telegram.messenger.mp;
public final class d1 implements Runnable {
    public final int f58642a;
    public final i1 f58643b;

    public d1(i1 i1Var, int i7) {
        this.f58642a = i7;
        this.f58643b = i1Var;
    }

    @Override
    public final void run() {
        switch (this.f58642a) {
            case 0:
                i1 i1Var = this.f58643b;
                Context context = i1Var.getContext();
                vf.c.t(context, "https://" + mp.u1(i1Var.U1).X2 + "/nft/" + i1Var.f58702z2.slug);
                return;
            case 1:
                i1 i1Var2 = this.f58643b;
                try {
                    i1Var2.f30193c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                i1Var2.f58687k2.c(i1Var2.G2);
                return;
            default:
                this.f58643b.K2[0].setVisibility(8);
                return;
        }
    }
}
