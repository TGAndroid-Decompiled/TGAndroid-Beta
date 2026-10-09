package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45588a;
    public final d0 f45589b;
    public final t0 f45590c;

    public b0(d0 d0Var, t0 t0Var, int i10) {
        this.f45588a = i10;
        this.f45589b = d0Var;
        this.f45590c = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f45588a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45589b, this.f45590c, 1));
                return;
            default:
                d0 d0Var = this.f45589b;
                d0Var.getClass();
                d0Var.f45615i = this.f45590c.f45788a;
                return;
        }
    }
}
