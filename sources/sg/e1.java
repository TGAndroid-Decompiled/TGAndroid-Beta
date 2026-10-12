package sg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class e1 implements Runnable {
    public final int f45173a;
    public final m1 f45174b;

    public e1(m1 m1Var, int i10) {
        this.f45173a = i10;
        this.f45174b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f45173a) {
            case 0:
                m1 m1Var = this.f45174b;
                Context context = m1Var.getContext();
                pf.d.s(context, "https://" + MessagesController.getInstance(m1Var.Y).linkPrefix + "/nft/" + m1Var.D0.slug);
                return;
            case 1:
                m1 m1Var2 = this.f45174b;
                try {
                    m1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m1Var2.f45265o0.c(m1Var2.K0);
                return;
            default:
                this.f45174b.O0[0].setVisibility(8);
                return;
        }
    }
}
