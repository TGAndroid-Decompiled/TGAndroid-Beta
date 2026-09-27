package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47300a;
    public final x3 f47301b;
    public final long f47302c;

    public c1(x3 x3Var, long j3, int i10) {
        this.f47300a = i10;
        this.f47301b = x3Var;
        this.f47302c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47300a) {
            case 0:
                x3 x3Var = this.f47301b;
                b1 b1Var = x3Var.f48302n1;
                x3Var.q2(1, true, null);
                if (this.f47302c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47301b.X1(this.f47302c);
                return;
            case 2:
                x3.P0(this.f47301b, this.f47302c);
                return;
            case 3:
                x3.d1(this.f47301b, this.f47302c);
                return;
            case 4:
                this.f47301b.X1(this.f47302c);
                return;
            case 5:
                x3.l0(this.f47301b, this.f47302c);
                return;
            case 6:
                this.f47301b.X1(this.f47302c);
                return;
            case 7:
                x3.P(this.f47301b, this.f47302c);
                return;
            case 8:
                this.f47301b.X1(this.f47302c);
                return;
            case 9:
                x3.B0(this.f47301b, this.f47302c);
                return;
            case 10:
                this.f47301b.X1(this.f47302c);
                return;
            default:
                this.f47301b.X1(this.f47302c);
                return;
        }
    }
}
