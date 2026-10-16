package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f43132a;
    public final d0 f43133b;
    public final r0 f43134c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f43132a = i10;
        this.f43133b = d0Var;
        this.f43134c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f43132a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f43133b, this.f43134c, 1));
                return;
            default:
                d0 d0Var = this.f43133b;
                d0Var.getClass();
                d0Var.f43154i = this.f43134c.f43291a;
                return;
        }
    }
}
