package yh;

import org.telegram.messenger.AndroidUtilities;
public final class x3 implements Runnable {
    public final int f50582a;
    public final f4 f50583b;

    public x3(f4 f4Var, int i10) {
        this.f50582a = i10;
        this.f50583b = f4Var;
    }

    @Override
    public final void run() {
        switch (this.f50582a) {
            case 0:
                this.f50583b.a0();
                return;
            default:
                f4 f4Var = this.f50583b;
                f4Var.f50248i0.N(true);
                AndroidUtilities.runOnUIThread(new x3(f4Var, 0), 150L);
                return;
        }
    }
}
