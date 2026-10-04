package rg;

import android.content.Context;
import org.telegram.messenger.MessagesController;
public final class e1 implements Runnable {
    public final int f46097a;
    public final m1 f46098b;

    public e1(m1 m1Var, int i10) {
        this.f46097a = i10;
        this.f46098b = m1Var;
    }

    @Override
    public final void run() {
        switch (this.f46097a) {
            case 0:
                m1 m1Var = this.f46098b;
                Context context = m1Var.getContext();
                nf.f.s(context, "https://" + MessagesController.getInstance(m1Var.Y).linkPrefix + "/nft/" + m1Var.D0.slug);
                return;
            case 1:
                m1 m1Var2 = this.f46098b;
                try {
                    m1Var2.container.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                m1Var2.f46198o0.c(m1Var2.K0);
                return;
            default:
                this.f46098b.O0[0].setVisibility(8);
                return;
        }
    }
}
