package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44469a;
    public final d0 f44470b;
    public final t0 f44471c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f44469a = i10;
        this.f44470b = d0Var;
        this.f44471c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44469a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44470b, this.f44471c, 1));
                return;
            default:
                d0 d0Var = this.f44470b;
                d0Var.getClass();
                d0Var.f44493i = this.f44471c.f44654a;
                return;
        }
    }
}
