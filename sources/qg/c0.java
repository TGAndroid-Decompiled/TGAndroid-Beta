package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44478a;
    public final e0 f44479b;
    public final u0 f44480c;

    public c0(e0 e0Var, u0 u0Var, int i10) {
        this.f44478a = i10;
        this.f44479b = e0Var;
        this.f44480c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f44478a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44479b, this.f44480c, 1));
                return;
            default:
                e0 e0Var = this.f44479b;
                e0Var.getClass();
                e0Var.f44502i = this.f44480c.f44666a;
                return;
        }
    }
}
