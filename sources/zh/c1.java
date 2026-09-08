package zh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f51760a;
    public final w3 f51761b;
    public final long f51762c;

    public c1(w3 w3Var, long j3, int i10) {
        this.f51760a = i10;
        this.f51761b = w3Var;
        this.f51762c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51760a) {
            case 0:
                w3 w3Var = this.f51761b;
                b1 b1Var = w3Var.f52811n1;
                w3Var.q2(1, true, null);
                if (this.f51762c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f51761b.X1(this.f51762c);
                return;
            case 2:
                w3.P0(this.f51761b, this.f51762c);
                return;
            case 3:
                w3.d1(this.f51761b, this.f51762c);
                return;
            case 4:
                this.f51761b.X1(this.f51762c);
                return;
            case 5:
                w3.m0(this.f51761b, this.f51762c);
                return;
            case 6:
                this.f51761b.X1(this.f51762c);
                return;
            case 7:
                w3.P(this.f51761b, this.f51762c);
                return;
            case 8:
                this.f51761b.X1(this.f51762c);
                return;
            case 9:
                w3.B0(this.f51761b, this.f51762c);
                return;
            case 10:
                this.f51761b.X1(this.f51762c);
                return;
            default:
                this.f51761b.X1(this.f51762c);
                return;
        }
    }
}
