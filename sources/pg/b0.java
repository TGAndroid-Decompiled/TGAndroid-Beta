package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f40844a;
    public final d0 f40845b;
    public final r0 f40846c;

    public b0(d0 d0Var, r0 r0Var, int i10) {
        this.f40844a = i10;
        this.f40845b = d0Var;
        this.f40846c = r0Var;
    }

    @Override
    public final void run() {
        switch (this.f40844a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f40845b, this.f40846c, 1));
                return;
            default:
                d0 d0Var = this.f40845b;
                d0Var.getClass();
                d0Var.f40866i = this.f40846c.f41003a;
                return;
        }
    }
}
