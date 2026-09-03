package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class r5 implements Runnable {
    public final int f45990a;
    public final v5 f45991b;

    public r5(v5 v5Var, int i10) {
        this.f45990a = i10;
        this.f45991b = v5Var;
    }

    @Override
    public final void run() {
        switch (this.f45990a) {
            case 0:
                this.f45991b.c();
                return;
            default:
                v5 v5Var = this.f45991b;
                v5Var.f46210a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.h).setDuration(280L).start();
                v5Var.f46212c = System.currentTimeMillis();
                v5Var.invalidate();
                try {
                    v5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(v5Var.h, 59500L);
                return;
        }
    }
}
