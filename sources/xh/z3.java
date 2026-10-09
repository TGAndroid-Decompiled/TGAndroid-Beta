package xh;

import org.telegram.messenger.AndroidUtilities;
public final class z3 implements Runnable {
    public final int f51622a;
    public final h4 f51623b;

    public z3(h4 h4Var, int i10) {
        this.f51622a = i10;
        this.f51623b = h4Var;
    }

    @Override
    public final void run() {
        switch (this.f51622a) {
            case 0:
                this.f51623b.a0();
                return;
            default:
                h4 h4Var = this.f51623b;
                h4Var.f51276i0.N(true);
                AndroidUtilities.runOnUIThread(new z3(h4Var, 0), 150L);
                return;
        }
    }
}
