package zf;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class d1 implements Runnable {
    public final int f50486a;
    public final k1 f50487b;

    public d1(k1 k1Var, int i9) {
        this.f50486a = i9;
        this.f50487b = k1Var;
    }

    @Override
    public final void run() {
        switch (this.f50486a) {
            case 0:
                k1 k1Var = this.f50487b;
                Context context = k1Var.getContext();
                ve.e.s(context, "https://" + MessagesController.getInstance(k1Var.U).linkPrefix + "/nft/" + k1Var.f50591z0.slug);
                return;
            case 1:
                k1 k1Var2 = this.f50487b;
                try {
                    k1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                k1Var2.f50577k0.c(k1Var2.G0);
                return;
            default:
                this.f50487b.K0[0].setVisibility(8);
                return;
        }
    }
}
