package yh;

import org.telegram.messenger.AndroidUtilities;
public final class b1 implements Runnable {
    public final int f52276a;
    public final s3 f52277b;
    public final long f52278c;

    public b1(s3 s3Var, long j3, int i10) {
        this.f52276a = i10;
        this.f52277b = s3Var;
        this.f52278c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52276a) {
            case 0:
                s3 s3Var = this.f52277b;
                a1 a1Var = s3Var.f53186o1;
                s3Var.s2(1, true, null);
                if (this.f52278c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(a1Var);
                    AndroidUtilities.runOnUIThread(a1Var);
                    return;
                }
                return;
            case 1:
                this.f52277b.Y1(this.f52278c);
                return;
            case 2:
                s3.Q0(this.f52277b, this.f52278c);
                return;
            case 3:
                s3.e1(this.f52277b, this.f52278c);
                return;
            case 4:
                this.f52277b.Y1(this.f52278c);
                return;
            case 5:
                s3.m0(this.f52277b, this.f52278c);
                return;
            case 6:
                this.f52277b.Y1(this.f52278c);
                return;
            case 7:
                s3.Q(this.f52277b, this.f52278c);
                return;
            case 8:
                this.f52277b.Y1(this.f52278c);
                return;
            case 9:
                s3.C0(this.f52277b, this.f52278c);
                return;
            case 10:
                this.f52277b.Y1(this.f52278c);
                return;
            default:
                this.f52277b.Y1(this.f52278c);
                return;
        }
    }
}
