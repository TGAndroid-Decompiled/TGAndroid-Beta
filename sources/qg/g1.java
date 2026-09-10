package qg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class g1 implements Runnable {
    public final int f40742a;
    public final m1 f40743b;

    public g1(m1 m1Var, int i10) {
        this.f40742a = i10;
        this.f40743b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f40742a) {
            case 0:
                m1 m1Var = this.f40743b;
                Context context = m1Var.getContext();
                nf.f.s(context, "https://" + MessagesController.getInstance(m1Var.Y).linkPrefix + "/nft/" + m1Var.D0.slug);
                return;
            case 1:
                m1 m1Var2 = this.f40743b;
                try {
                    m1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m1Var2.f40825o0.c(m1Var2.K0);
                return;
            default:
                this.f40743b.O0[0].setVisibility(8);
                return;
        }
    }
}
