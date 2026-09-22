package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f46977a;
    public final z3 f46978b;
    public final long f46979c;

    public c1(z3 z3Var, long j3, int i10) {
        this.f46977a = i10;
        this.f46978b = z3Var;
        this.f46979c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46977a) {
            case 0:
                z3 z3Var = this.f46978b;
                b1 b1Var = z3Var.f48036n1;
                z3Var.q2(1, true, null);
                if (this.f46979c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f46978b.X1(this.f46979c);
                return;
            case 2:
                z3.P0(this.f46978b, this.f46979c);
                return;
            case 3:
                z3.d1(this.f46978b, this.f46979c);
                return;
            case 4:
                this.f46978b.X1(this.f46979c);
                return;
            case 5:
                z3.m0(this.f46978b, this.f46979c);
                return;
            case 6:
                this.f46978b.X1(this.f46979c);
                return;
            case 7:
                z3.P(this.f46978b, this.f46979c);
                return;
            case 8:
                this.f46978b.X1(this.f46979c);
                return;
            case 9:
                z3.B0(this.f46978b, this.f46979c);
                return;
            case 10:
                this.f46978b.X1(this.f46979c);
                return;
            default:
                this.f46978b.X1(this.f46979c);
                return;
        }
    }
}
