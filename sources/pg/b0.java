package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45632a;
    public final d0 f45633b;
    public final t0 f45634c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f45632a = i10;
        this.f45633b = d0Var;
        this.f45634c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f45632a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45633b, this.f45634c, 1));
                return;
            default:
                d0 d0Var = this.f45633b;
                d0Var.getClass();
                d0Var.f45659i = this.f45634c.f45832a;
                return;
        }
    }
}
