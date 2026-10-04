package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f51145a;
    public final x3 f51146b;
    public final long f51147c;

    public c1(x3 x3Var, long j3, int i10) {
        this.f51145a = i10;
        this.f51146b = x3Var;
        this.f51147c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51145a) {
            case 0:
                x3 x3Var = this.f51146b;
                b1 b1Var = x3Var.f52232n1;
                x3Var.q2(1, true, null);
                if (this.f51147c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f51146b.X1(this.f51147c);
                return;
            case 2:
                x3.P0(this.f51146b, this.f51147c);
                return;
            case 3:
                x3.d1(this.f51146b, this.f51147c);
                return;
            case 4:
                this.f51146b.X1(this.f51147c);
                return;
            case 5:
                x3.l0(this.f51146b, this.f51147c);
                return;
            case 6:
                this.f51146b.X1(this.f51147c);
                return;
            case 7:
                x3.N(this.f51146b, this.f51147c);
                return;
            case 8:
                this.f51146b.X1(this.f51147c);
                return;
            case 9:
                x3.B0(this.f51146b, this.f51147c);
                return;
            case 10:
                this.f51146b.X1(this.f51147c);
                return;
            default:
                this.f51146b.X1(this.f51147c);
                return;
        }
    }
}
