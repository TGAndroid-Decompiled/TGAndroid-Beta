package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f47027a;
    public final a4 f47028b;
    public final long f47029c;

    public c1(a4 a4Var, long j3, int i10) {
        this.f47027a = i10;
        this.f47028b = a4Var;
        this.f47029c = j3;
    }

    @Override
    public final void run() {
        switch (this.f47027a) {
            case 0:
                a4 a4Var = this.f47028b;
                b1 b1Var = a4Var.f46970n1;
                a4Var.q2(1, true, null);
                if (this.f47029c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f47028b.X1(this.f47029c);
                return;
            case 2:
                a4.P0(this.f47028b, this.f47029c);
                return;
            case 3:
                a4.d1(this.f47028b, this.f47029c);
                return;
            case 4:
                this.f47028b.X1(this.f47029c);
                return;
            case 5:
                a4.m0(this.f47028b, this.f47029c);
                return;
            case 6:
                this.f47028b.X1(this.f47029c);
                return;
            case 7:
                a4.P(this.f47028b, this.f47029c);
                return;
            case 8:
                this.f47028b.X1(this.f47029c);
                return;
            case 9:
                a4.B0(this.f47028b, this.f47029c);
                return;
            case 10:
                this.f47028b.X1(this.f47029c);
                return;
            default:
                this.f47028b.X1(this.f47029c);
                return;
        }
    }
}
