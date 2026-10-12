package pg;

import org.telegram.messenger.AndroidUtilities;
public final class b0 implements Runnable {
    public final int f45473a;
    public final d0 f45474b;
    public final s0 f45475c;

    public b0(d0 d0Var, s0 s0Var, int i10) {
        this.f45473a = i10;
        this.f45474b = d0Var;
        this.f45475c = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f45473a) {
            case 0:
                AndroidUtilities.runOnUIThread(new b0(this.f45474b, this.f45475c, 1));
                return;
            default:
                d0 d0Var = this.f45474b;
                d0Var.getClass();
                d0Var.f45498i = this.f45475c.f45660a;
                return;
        }
    }
}
