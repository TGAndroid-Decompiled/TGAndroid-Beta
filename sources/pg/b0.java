package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41075a;
    public final e0 f41076b;
    public final t0 f41077c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41075a = i10;
        this.f41076b = e0Var;
        this.f41077c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41075a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41076b, this.f41077c, 1));
                return;
            default:
                e0 e0Var = this.f41076b;
                e0Var.getClass();
                e0Var.f41103i = this.f41077c.f41261a;
                return;
        }
    }
}
