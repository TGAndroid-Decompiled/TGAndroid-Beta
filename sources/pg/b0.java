package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44426a;
    public final e0 f44427b;
    public final t0 f44428c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f44426a = i10;
        this.f44427b = e0Var;
        this.f44428c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44426a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44427b, this.f44428c, 1));
                return;
            default:
                e0 e0Var = this.f44427b;
                e0Var.getClass();
                e0Var.f44457i = this.f44428c.f44626a;
                return;
        }
    }
}
