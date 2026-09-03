package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.mr;
public final class t5 implements Runnable {
    public final int f42397a;
    public final x5 f42398b;

    public t5(x5 x5Var, int i10) {
        this.f42397a = i10;
        this.f42398b = x5Var;
    }

    @Override
    public final void run() {
        switch (this.f42397a) {
            case 0:
                this.f42398b.c();
                return;
            default:
                x5 x5Var = this.f42398b;
                x5Var.f42592a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(mr.h).setDuration(280L).start();
                x5Var.f42594c = System.currentTimeMillis();
                x5Var.invalidate();
                try {
                    x5Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(x5Var.h, 59500L);
                return;
        }
    }
}
