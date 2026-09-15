package rg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class d1 implements Runnable {
    public final int f42273a;
    public final k1 f42274b;

    public d1(k1 k1Var, int i10) {
        this.f42273a = i10;
        this.f42274b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f42273a) {
            case 0:
                k1 k1Var = this.f42274b;
                Context context = k1Var.getContext();
                nf.f.s(context, "https://" + MessagesController.getInstance(k1Var.Y).linkPrefix + "/nft/" + k1Var.D0.slug);
                return;
            case 1:
                k1 k1Var2 = this.f42274b;
                try {
                    k1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                k1Var2.f42357o0.c(k1Var2.K0);
                return;
            default:
                this.f42274b.O0[0].setVisibility(8);
                return;
        }
    }
}
