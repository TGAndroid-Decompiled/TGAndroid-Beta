package ug;

import android.content.Context;
import org.telegram.messenger.qp;
public final class a1 implements Runnable {
    public final int f56434a;
    public final f1 f56435b;

    public a1(f1 f1Var, int i7) {
        this.f56434a = i7;
        this.f56435b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f56434a) {
            case 0:
                f1 f1Var = this.f56435b;
                Context context = f1Var.getContext();
                vf.c.t(context, "https://" + qp.s1(f1Var.Q1).U2 + "/nft/" + f1Var.f56491v2.slug);
                return;
            case 1:
                f1 f1Var2 = this.f56435b;
                try {
                    f1Var2.f28618c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f1Var2.f56476g2.c(f1Var2.C2);
                return;
            default:
                this.f56435b.G2[0].setVisibility(8);
                return;
        }
    }
}
