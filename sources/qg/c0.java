package qg;

import org.telegram.messenger.AndroidUtilities;
public final class c0 implements Runnable {
    public final int f44516a;
    public final e0 f44517b;
    public final t0 f44518c;

    public c0(e0 e0Var, t0 t0Var, int i10) {
        this.f44516a = i10;
        this.f44517b = e0Var;
        this.f44518c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44516a) {
            case 0:
                AndroidUtilities.runOnUIThread(new c0(this.f44517b, this.f44518c, 1));
                return;
            default:
                e0 e0Var = this.f44517b;
                e0Var.getClass();
                e0Var.f44538i = this.f44518c.f44695a;
                return;
        }
    }
}
