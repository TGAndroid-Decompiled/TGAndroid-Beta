package yf;

import org.telegram.messenger.AndroidUtilities;

public final class b0 implements Runnable {

    public final int f49875a;

    public final d0 f49876b;

    public final q0 f49877c;

    public b0(d0 d0Var, q0 q0Var, int i10) {
        this.f49875a = i10;
        this.f49876b = d0Var;
        this.f49877c = q0Var;
    }

    @Override
    public final void run() {
        switch (this.f49875a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f49876b, this.f49877c, 1));
                break;
            default:
                d0 d0Var = this.f49876b;
                d0Var.getClass();
                d0Var.f49902i = this.f49877c.f50038a;
                break;
        }
    }
}
