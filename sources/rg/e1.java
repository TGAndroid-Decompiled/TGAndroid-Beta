package rg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class e1 implements Runnable {
    public final int f47463a;
    public final l1 f47464b;

    public e1(l1 l1Var, int i10) {
        this.f47463a = i10;
        this.f47464b = l1Var;
    }

    @Override
    public final void run() {
        switch (this.f47463a) {
            case 0:
                l1 l1Var = this.f47464b;
                Context context = l1Var.getContext();
                of.f.s(context, "https://" + MessagesController.getInstance(l1Var.Y).linkPrefix + "/nft/" + l1Var.D0.slug);
                return;
            case 1:
                l1 l1Var2 = this.f47464b;
                try {
                    l1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                l1Var2.f47556o0.c(l1Var2.K0);
                return;
            default:
                this.f47464b.O0[0].setVisibility(8);
                return;
        }
    }
}
