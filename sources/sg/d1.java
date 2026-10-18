package sg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class d1 implements Runnable {
    public final int f46259a;
    public final l1 f46260b;

    public d1(l1 l1Var, int i10) {
        this.f46259a = i10;
        this.f46260b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f46259a) {
            case 0:
                l1 l1Var = this.f46260b;
                Context context = l1Var.getContext();
                pf.d.r(context, "https://" + MessagesController.getInstance(l1Var.Y).linkPrefix + "/nft/" + l1Var.D0.slug);
                return;
            case 1:
                l1 l1Var2 = this.f46260b;
                try {
                    l1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                l1Var2.f46356o0.c(l1Var2.K0);
                return;
            default:
                this.f46260b.O0[0].setVisibility(8);
                return;
        }
    }
}
