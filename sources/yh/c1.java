package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f51151a;
    public final x3 f51152b;
    public final long f51153c;

    public c1(x3 x3Var, long j3, int i10) {
        this.f51151a = i10;
        this.f51152b = x3Var;
        this.f51153c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51151a) {
            case 0:
                x3 x3Var = this.f51152b;
                b1 b1Var = x3Var.f52237n1;
                x3Var.q2(1, true, null);
                if (this.f51153c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f51152b.X1(this.f51153c);
                return;
            case 2:
                x3.P0(this.f51152b, this.f51153c);
                return;
            case 3:
                x3.d1(this.f51152b, this.f51153c);
                return;
            case 4:
                this.f51152b.X1(this.f51153c);
                return;
            case 5:
                x3.l0(this.f51152b, this.f51153c);
                return;
            case 6:
                this.f51152b.X1(this.f51153c);
                return;
            case 7:
                x3.N(this.f51152b, this.f51153c);
                return;
            case 8:
                this.f51152b.X1(this.f51153c);
                return;
            case 9:
                x3.B0(this.f51152b, this.f51153c);
                return;
            case 10:
                this.f51152b.X1(this.f51153c);
                return;
            default:
                this.f51152b.X1(this.f51153c);
                return;
        }
    }
}
