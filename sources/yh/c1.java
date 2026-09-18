package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47245a;
    public final y3 f47246b;
    public final long f47247c;

    public c1(y3 y3Var, long j3, int i10) {
        this.f47245a = i10;
        this.f47246b = y3Var;
        this.f47247c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47245a) {
            case 0:
                y3 y3Var = this.f47246b;
                b1 b1Var = y3Var.f48281n1;
                y3Var.q2(1, true, null);
                if (this.f47247c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47246b.X1(this.f47247c);
                return;
            case 2:
                y3.P0(this.f47246b, this.f47247c);
                return;
            case 3:
                y3.d1(this.f47246b, this.f47247c);
                return;
            case 4:
                this.f47246b.X1(this.f47247c);
                return;
            case 5:
                y3.m0(this.f47246b, this.f47247c);
                return;
            case 6:
                this.f47246b.X1(this.f47247c);
                return;
            case 7:
                y3.P(this.f47246b, this.f47247c);
                return;
            case 8:
                this.f47246b.X1(this.f47247c);
                return;
            case 9:
                y3.B0(this.f47246b, this.f47247c);
                return;
            case 10:
                this.f47246b.X1(this.f47247c);
                return;
            default:
                this.f47246b.X1(this.f47247c);
                return;
        }
    }
}
