package sg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class g1 implements Runnable {
    public final int f46104a;
    public final o1 f46105b;

    public g1(o1 o1Var, int i10) {
        this.f46104a = i10;
        this.f46105b = o1Var;
    }

    @Override
    public final void run() {
        switch (this.f46104a) {
            case 0:
                o1 o1Var = this.f46105b;
                Context context = o1Var.getContext();
                of.f.s(context, "https://" + MessagesController.getInstance(o1Var.Y).linkPrefix + "/nft/" + o1Var.D0.slug);
                return;
            case 1:
                o1 o1Var2 = this.f46105b;
                try {
                    o1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                o1Var2.f46207o0.c(o1Var2.K0);
                return;
            default:
                this.f46105b.O0[0].setVisibility(8);
                return;
        }
    }
}
