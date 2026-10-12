package zh;

import org.telegram.messenger.AndroidUtilities;
public final class b1 implements Runnable {
    public final int f50292a;
    public final r3 f50293b;
    public final long f50294c;

    public b1(r3 r3Var, long j10, int i10) {
        this.f50292a = i10;
        this.f50293b = r3Var;
        this.f50294c = j10;
    }

    @Override
    public final void run() {
        switch (this.f50292a) {
            case 0:
                r3 r3Var = this.f50293b;
                a1 a1Var = r3Var.f51095o1;
                r3Var.s2(1, true, null);
                if (this.f50294c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var);
                    return;
                }
                return;
            case 1:
                this.f50293b.Y1(this.f50294c);
                return;
            case 2:
                r3.Q0(this.f50293b, this.f50294c);
                return;
            case 3:
                r3.e1(this.f50293b, this.f50294c);
                return;
            case 4:
                this.f50293b.Y1(this.f50294c);
                return;
            case 5:
                r3.m0(this.f50293b, this.f50294c);
                return;
            case 6:
                this.f50293b.Y1(this.f50294c);
                return;
            case 7:
                r3.Q(this.f50293b, this.f50294c);
                return;
            case 8:
                this.f50293b.Y1(this.f50294c);
                return;
            case 9:
                r3.C0(this.f50293b, this.f50294c);
                return;
            case 10:
                this.f50293b.Y1(this.f50294c);
                return;
            default:
                this.f50293b.Y1(this.f50294c);
                return;
        }
    }
}
