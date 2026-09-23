package yh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f46937a;
    public final y3 f46938b;
    public final long f46939c;

    public c1(y3 y3Var, long j3, int i10) {
        this.f46937a = i10;
        this.f46938b = y3Var;
        this.f46939c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46937a) {
            case 0:
                y3 y3Var = this.f46938b;
                b1 b1Var = y3Var.f47971n1;
                y3Var.q2(1, true, null);
                if (this.f46939c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f46938b.X1(this.f46939c);
                return;
            case 2:
                y3.P0(this.f46938b, this.f46939c);
                return;
            case 3:
                y3.d1(this.f46938b, this.f46939c);
                return;
            case 4:
                this.f46938b.X1(this.f46939c);
                return;
            case 5:
                y3.l0(this.f46938b, this.f46939c);
                return;
            case 6:
                this.f46938b.X1(this.f46939c);
                return;
            case 7:
                y3.P(this.f46938b, this.f46939c);
                return;
            case 8:
                this.f46938b.X1(this.f46939c);
                return;
            case 9:
                y3.B0(this.f46938b, this.f46939c);
                return;
            case 10:
                this.f46938b.X1(this.f46939c);
                return;
            default:
                this.f46938b.X1(this.f46939c);
                return;
        }
    }
}
