package ug;

import android.content.Context;
import org.telegram.messenger.qp;
public final class a1 implements Runnable {
    public final int f56433a;
    public final f1 f56434b;

    public a1(f1 f1Var, int i7) {
        this.f56433a = i7;
        this.f56434b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f56433a) {
            case 0:
                f1 f1Var = this.f56434b;
                Context context = f1Var.getContext();
                vf.c.t(context, "https://" + qp.s1(f1Var.Q1).U2 + "/nft/" + f1Var.f56490v2.slug);
                return;
            case 1:
                f1 f1Var2 = this.f56434b;
                try {
                    f1Var2.f28619c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f1Var2.f56475g2.c(f1Var2.C2);
                return;
            default:
                this.f56434b.G2[0].setVisibility(8);
                return;
        }
    }
}
