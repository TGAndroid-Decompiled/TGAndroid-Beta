package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44482a;
    public final e0 f44483b;
    public final u0 f44484c;

    public c0(e0 e0Var, u0 u0Var, int i10) {
        this.f44482a = i10;
        this.f44483b = e0Var;
        this.f44484c = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f44482a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44483b, this.f44484c, 1));
                return;
            default:
                e0 e0Var = this.f44483b;
                e0Var.getClass();
                e0Var.f44506i = this.f44484c.f44670a;
                return;
        }
    }
}
