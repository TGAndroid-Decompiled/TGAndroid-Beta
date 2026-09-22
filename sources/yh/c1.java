package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47309a;
    public final y3 f47310b;
    public final long f47311c;

    public c1(y3 y3Var, long j3, int i10) {
        this.f47309a = i10;
        this.f47310b = y3Var;
        this.f47311c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47309a) {
            case 0:
                y3 y3Var = this.f47310b;
                b1 b1Var = y3Var.f48345n1;
                y3Var.q2(1, true, null);
                if (this.f47311c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47310b.X1(this.f47311c);
                return;
            case 2:
                y3.P0(this.f47310b, this.f47311c);
                return;
            case 3:
                y3.d1(this.f47310b, this.f47311c);
                return;
            case 4:
                this.f47310b.X1(this.f47311c);
                return;
            case 5:
                y3.m0(this.f47310b, this.f47311c);
                return;
            case 6:
                this.f47310b.X1(this.f47311c);
                return;
            case 7:
                y3.P(this.f47310b, this.f47311c);
                return;
            case 8:
                this.f47310b.X1(this.f47311c);
                return;
            case 9:
                y3.B0(this.f47310b, this.f47311c);
                return;
            case 10:
                this.f47310b.X1(this.f47311c);
                return;
            default:
                this.f47310b.X1(this.f47311c);
                return;
        }
    }
}
