package zh;

import org.telegram.messenger.AndroidUtilities;
public final class c1 implements Runnable {
    public final int f51729a;
    public final w3 f51730b;
    public final long f51731c;

    public c1(w3 w3Var, long j3, int i10) {
        this.f51729a = i10;
        this.f51730b = w3Var;
        this.f51731c = j3;
    }

    @Override
    public final void run() {
        switch (this.f51729a) {
            case 0:
                w3 w3Var = this.f51730b;
                b1 b1Var = w3Var.f52780n1;
                w3Var.q2(1, true, null);
                if (this.f51731c > 0) {
                    AndroidUtilities.cancelRunOnUIThread(b1Var);
                    AndroidUtilities.runOnUIThread(b1Var);
                    return;
                }
                return;
            case 1:
                this.f51730b.X1(this.f51731c);
                return;
            case 2:
                w3.P0(this.f51730b, this.f51731c);
                return;
            case 3:
                w3.d1(this.f51730b, this.f51731c);
                return;
            case 4:
                this.f51730b.X1(this.f51731c);
                return;
            case 5:
                w3.m0(this.f51730b, this.f51731c);
                return;
            case 6:
                this.f51730b.X1(this.f51731c);
                return;
            case 7:
                w3.P(this.f51730b, this.f51731c);
                return;
            case 8:
                this.f51730b.X1(this.f51731c);
                return;
            case 9:
                w3.B0(this.f51730b, this.f51731c);
                return;
            case 10:
                this.f51730b.X1(this.f51731c);
                return;
            default:
                this.f51730b.X1(this.f51731c);
                return;
        }
    }
}
