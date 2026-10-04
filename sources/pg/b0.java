package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44434a;
    public final e0 f44435b;
    public final t0 f44436c;

    public b0(e0 e0Var, t0 t0Var, int i10) {
        this.f44434a = i10;
        this.f44435b = e0Var;
        this.f44436c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f44434a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44435b, this.f44436c, 1));
                return;
            default:
                e0 e0Var = this.f44435b;
                e0Var.getClass();
                e0Var.f44465i = this.f44436c.f44634a;
                return;
        }
    }
}
