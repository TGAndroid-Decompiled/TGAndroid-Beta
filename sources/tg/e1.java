package tg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class e1 implements Runnable {
    public final int f48850a;
    public final m1 f48851b;

    public e1(m1 m1Var, int i10) {
        this.f48850a = i10;
        this.f48851b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f48850a) {
            case 0:
                m1 m1Var = this.f48851b;
                Context context = m1Var.getContext();
                qf.d.r(context, "https://" + MessagesController.getInstance(m1Var.Y).linkPrefix + "/nft/" + m1Var.D0.slug);
                return;
            case 1:
                m1 m1Var2 = this.f48851b;
                try {
                    m1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m1Var2.f48943o0.c(m1Var2.K0);
                return;
            default:
                this.f48851b.O0[0].setVisibility(8);
                return;
        }
    }
}
