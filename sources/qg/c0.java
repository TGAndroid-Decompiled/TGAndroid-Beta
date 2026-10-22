package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44481a;
    public final e0 f44482b;
    public final u0 f44483c;

    public c0(e0 e0Var, u0 u0Var, int i10) {
        this.f44481a = i10;
        this.f44482b = e0Var;
        this.f44483c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f44481a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44482b, this.f44483c, 1));
                return;
            default:
                e0 e0Var = this.f44482b;
                e0Var.getClass();
                e0Var.f44505i = this.f44483c.f44669a;
                return;
        }
    }
}
