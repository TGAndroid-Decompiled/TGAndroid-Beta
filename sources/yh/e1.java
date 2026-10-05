package yh;

import org.telegram.messenger.AndroidUtilities;
public final class e1 implements Runnable {
    public final int f51242a;
    public final y3 f51243b;
    public final long f51244c;

    public e1(y3 y3Var, long j3, int i10) {
        this.f51242a = i10;
        this.f51243b = y3Var;
        this.f51244c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51242a) {
            case 0:
                y3 y3Var = this.f51243b;
                d1 d1Var = y3Var.f52305n1;
                y3Var.q2(1, true, null);
                if (this.f51244c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(d1Var);
                    AndroidUtilities.runOnUIThread(d1Var);
                    return;
                }
                return;
            case 1:
                this.f51243b.X1(this.f51244c);
                return;
            case 2:
                y3.P0(this.f51243b, this.f51244c);
                return;
            case 3:
                y3.d1(this.f51243b, this.f51244c);
                return;
            case 4:
                this.f51243b.X1(this.f51244c);
                return;
            case 5:
                y3.l0(this.f51243b, this.f51244c);
                return;
            case 6:
                this.f51243b.X1(this.f51244c);
                return;
            case 7:
                y3.N(this.f51243b, this.f51244c);
                return;
            case 8:
                this.f51243b.X1(this.f51244c);
                return;
            case 9:
                y3.B0(this.f51243b, this.f51244c);
                return;
            case 10:
                this.f51243b.X1(this.f51244c);
                return;
            default:
                this.f51243b.X1(this.f51244c);
                return;
        }
    }
}
