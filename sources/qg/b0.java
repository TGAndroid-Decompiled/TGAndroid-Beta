package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f43390a;
    public final d0 f43391b;
    public final r0 f43392c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f43390a = i10;
        this.f43391b = d0Var;
        this.f43392c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f43390a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f43391b, this.f43392c, 1));
                return;
            default:
                d0 d0Var = this.f43391b;
                d0Var.getClass();
                d0Var.f43412i = this.f43392c.f43549a;
                return;
        }
    }
}
