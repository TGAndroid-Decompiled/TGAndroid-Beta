package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44427a;
    public final e0 f44428b;
    public final t0 f44429c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f44427a = i10;
        this.f44428b = e0Var;
        this.f44429c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44427a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44428b, this.f44429c, 1));
                return;
            default:
                e0 e0Var = this.f44428b;
                e0Var.getClass();
                e0Var.f44458i = this.f44429c.f44627a;
                return;
        }
    }
}
