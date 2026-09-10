package xh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f45294a;
    public final x3 f45295b;
    public final long f45296c;

    public c1(x3 x3Var, long j3, int i10) {
        this.f45294a = i10;
        this.f45295b = x3Var;
        this.f45296c = j3;
    }

    @Override
    public final void run() {
        switch (this.f45294a) {
            case 0:
                x3 x3Var = this.f45295b;
                b1 b1Var = x3Var.f46292n1;
                x3Var.q2(1, true, null);
                if (this.f45296c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f45295b.X1(this.f45296c);
                return;
            case 2:
                x3.P0(this.f45295b, this.f45296c);
                return;
            case 3:
                x3.d1(this.f45295b, this.f45296c);
                return;
            case 4:
                this.f45295b.X1(this.f45296c);
                return;
            case 5:
                x3.m0(this.f45295b, this.f45296c);
                return;
            case 6:
                this.f45295b.X1(this.f45296c);
                return;
            case 7:
                x3.P(this.f45295b, this.f45296c);
                return;
            case 8:
                this.f45295b.X1(this.f45296c);
                return;
            case 9:
                x3.B0(this.f45295b, this.f45296c);
                return;
            case 10:
                this.f45295b.X1(this.f45296c);
                return;
            default:
                this.f45295b.X1(this.f45296c);
                return;
        }
    }
}
