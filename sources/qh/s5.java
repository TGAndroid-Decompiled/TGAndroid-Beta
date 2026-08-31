package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class s5 implements Runnable {
    public final int f46039a;
    public final w5 f46040b;

    public s5(w5 w5Var, int i10) {
        this.f46039a = i10;
        this.f46040b = w5Var;
    }

    @Override
    public final void run() {
        switch (this.f46039a) {
            case 0:
                this.f46040b.c();
                return;
            default:
                w5 w5Var = this.f46040b;
                w5Var.f46227a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.h).setDuration(280L).start();
                w5Var.f46229c = System.currentTimeMillis();
                w5Var.invalidate();
                try {
                    w5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(w5Var.h, 59500L);
                return;
        }
    }
}
