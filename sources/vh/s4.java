package vh;

import org.telegram.ui.Components.gr;
public final class s4 implements Runnable {
    public final int f51924a;
    public final v4 f51925b;

    public s4(v4 v4Var, int i10) {
        this.f51924a = i10;
        this.f51925b = v4Var;
    }

    @Override
    public final void run() {
        switch (this.f51924a) {
            case 0:
                this.f51925b.c();
                return;
            default:
                v4 v4Var = this.f51925b;
                v4Var.f52042a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.h).setDuration(280L).start();
                v4Var.f52044c = System.currentTimeMillis();
                v4Var.invalidate();
                try {
                    v4Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.i0.h3(v4Var.h, 59500L);
                return;
        }
    }
}
