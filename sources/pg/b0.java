package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f41076a;
    public final e0 f41077b;
    public final t0 f41078c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f41076a = i10;
        this.f41077b = e0Var;
        this.f41078c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f41076a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f41077b, this.f41078c, 1));
                return;
            default:
                e0 e0Var = this.f41077b;
                e0Var.getClass();
                e0Var.f41104i = this.f41078c.f41262a;
                return;
        }
    }
}
