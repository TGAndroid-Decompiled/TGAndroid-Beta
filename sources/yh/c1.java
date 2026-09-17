package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47050a;
    public final a4 f47051b;
    public final long f47052c;

    public c1(a4 a4Var, long j3, int i10) {
        this.f47050a = i10;
        this.f47051b = a4Var;
        this.f47052c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47050a) {
            case 0:
                a4 a4Var = this.f47051b;
                b1 b1Var = a4Var.f46993n1;
                a4Var.q2(1, true, null);
                if (this.f47052c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47051b.X1(this.f47052c);
                return;
            case 2:
                a4.P0(this.f47051b, this.f47052c);
                return;
            case 3:
                a4.d1(this.f47051b, this.f47052c);
                return;
            case 4:
                this.f47051b.X1(this.f47052c);
                return;
            case 5:
                a4.m0(this.f47051b, this.f47052c);
                return;
            case 6:
                this.f47051b.X1(this.f47052c);
                return;
            case 7:
                a4.P(this.f47051b, this.f47052c);
                return;
            case 8:
                this.f47051b.X1(this.f47052c);
                return;
            case 9:
                a4.B0(this.f47051b, this.f47052c);
                return;
            case 10:
                this.f47051b.X1(this.f47052c);
                return;
            default:
                this.f47051b.X1(this.f47052c);
                return;
        }
    }
}
