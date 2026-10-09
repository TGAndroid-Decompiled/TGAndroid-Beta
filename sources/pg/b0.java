package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45586a;
    public final d0 f45587b;
    public final t0 f45588c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f45586a = i10;
        this.f45587b = d0Var;
        this.f45588c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f45586a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45587b, this.f45588c, 1));
                return;
            default:
                d0 d0Var = this.f45587b;
                d0Var.getClass();
                d0Var.f45613i = this.f45588c.f45786a;
                return;
        }
    }
}
