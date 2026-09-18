package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47055a;
    public final a4 f47056b;
    public final long f47057c;

    public c1(a4 a4Var, long j3, int i10) {
        this.f47055a = i10;
        this.f47056b = a4Var;
        this.f47057c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47055a) {
            case 0:
                a4 a4Var = this.f47056b;
                b1 b1Var = a4Var.f46998n1;
                a4Var.q2(1, true, null);
                if (this.f47057c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47056b.X1(this.f47057c);
                return;
            case 2:
                a4.P0(this.f47056b, this.f47057c);
                return;
            case 3:
                a4.d1(this.f47056b, this.f47057c);
                return;
            case 4:
                this.f47056b.X1(this.f47057c);
                return;
            case 5:
                a4.m0(this.f47056b, this.f47057c);
                return;
            case 6:
                this.f47056b.X1(this.f47057c);
                return;
            case 7:
                a4.P(this.f47056b, this.f47057c);
                return;
            case 8:
                this.f47056b.X1(this.f47057c);
                return;
            case 9:
                a4.B0(this.f47056b, this.f47057c);
                return;
            case 10:
                this.f47056b.X1(this.f47057c);
                return;
            default:
                this.f47056b.X1(this.f47057c);
                return;
        }
    }
}
