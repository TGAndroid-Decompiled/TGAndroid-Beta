package sg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class g1 implements Runnable {
    public final int f46133a;
    public final o1 f46134b;

    public g1(o1 o1Var, int i10) {
        this.f46133a = i10;
        this.f46134b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f46133a) {
            case 0:
                o1 o1Var = this.f46134b;
                Context context = o1Var.getContext();
                of.f.s(context, "https://" + MessagesController.getInstance(o1Var.Y).linkPrefix + "/nft/" + o1Var.D0.slug);
                return;
            case 1:
                o1 o1Var2 = this.f46134b;
                try {
                    o1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                o1Var2.f46236o0.c(o1Var2.K0);
                return;
            default:
                this.f46134b.O0[0].setVisibility(8);
                return;
        }
    }
}
