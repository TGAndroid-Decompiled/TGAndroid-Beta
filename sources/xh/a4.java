package xh;

import org.telegram.messenger.AndroidUtilities;
public final class a4 implements Runnable {
    public final int f46117a;
    public final i4 f46118b;

    public a4(i4 i4Var, int i10) {
        this.f46117a = i10;
        this.f46118b = i4Var;
    }

    @Override
    public final void run() {
        switch (this.f46117a) {
            case 0:
                this.f46118b.Z();
                return;
            default:
                i4 i4Var = this.f46118b;
                i4Var.f46248i0.N(true);
                AndroidUtilities.runOnUIThread(new a4(i4Var, 0), 150L);
                return;
        }
    }
}
