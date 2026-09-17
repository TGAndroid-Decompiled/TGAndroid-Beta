package qg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f44380a;
    public final d0 f44381b;
    public final r0 f44382c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f44380a = i10;
        this.f44381b = d0Var;
        this.f44382c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f44380a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f44381b, this.f44382c, 1));
                return;
            default:
                d0 d0Var = this.f44381b;
                d0Var.getClass();
                d0Var.f44405i = this.f44382c.f44549a;
                return;
        }
    }
}
