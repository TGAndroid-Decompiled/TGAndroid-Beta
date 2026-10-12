package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45478a;
    public final d0 f45479b;
    public final s0 f45480c;

    public b0(d0 d0Var, s0 s0Var, int i10) {
        this.f45478a = i10;
        this.f45479b = d0Var;
        this.f45480c = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45478a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45479b, this.f45480c, 1));
                return;
            default:
                d0 d0Var = this.f45479b;
                d0Var.getClass();
                d0Var.f45503i = this.f45480c.f45665a;
                return;
        }
    }
}
