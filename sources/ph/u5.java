package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class u5 implements Runnable {
    public final int f42396a;
    public final y5 f42397b;

    public u5(y5 y5Var, int i10) {
        this.f42396a = i10;
        this.f42397b = y5Var;
    }

    @Override
    public final void run() {
        switch (this.f42396a) {
            case 0:
                this.f42397b.c();
                return;
            default:
                y5 y5Var = this.f42397b;
                y5Var.f42619a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.h).setDuration(280L).start();
                y5Var.f42621c = System.currentTimeMillis();
                y5Var.invalidate();
                try {
                    y5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(y5Var.h, 59500L);
                return;
        }
    }
}
