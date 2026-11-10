package ug;

import android.content.Context;
import org.telegram.messenger.qp;
public final class a1 implements Runnable {
    public final int f56537a;
    public final f1 f56538b;

    public a1(f1 f1Var, int i7) {
        this.f56537a = i7;
        this.f56538b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f56537a) {
            case 0:
                f1 f1Var = this.f56538b;
                Context context = f1Var.getContext();
                vf.c.t(context, "https://" + qp.s1(f1Var.T1).U2 + "/nft/" + f1Var.f56597y2.slug);
                return;
            case 1:
                f1 f1Var2 = this.f56538b;
                try {
                    f1Var2.f28675c.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                f1Var2.f56582j2.c(f1Var2.F2);
                return;
            default:
                this.f56538b.J2[0].setVisibility(8);
                return;
        }
    }
}
