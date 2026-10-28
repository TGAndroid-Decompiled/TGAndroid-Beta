package tg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class e1 implements Runnable {
    public final int f48888a;
    public final m1 f48889b;

    public e1(m1 m1Var, int i10) {
        this.f48888a = i10;
        this.f48889b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f48888a) {
            case 0:
                m1 m1Var = this.f48889b;
                Context context = m1Var.getContext();
                qf.d.r(context, "https://" + MessagesController.getInstance(m1Var.Y).linkPrefix + "/nft/" + m1Var.D0.slug);
                return;
            case 1:
                m1 m1Var2 = this.f48889b;
                try {
                    m1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m1Var2.f48981o0.c(m1Var2.K0);
                return;
            default:
                this.f48889b.O0[0].setVisibility(8);
                return;
        }
    }
}
