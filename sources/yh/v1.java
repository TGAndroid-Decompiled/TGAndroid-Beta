package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
public final class v1 implements Runnable {
    public final int f48101a;
    public final y3 f48102b;
    public final String f48103c;

    public v1(y3 y3Var, String str, int i10) {
        this.f48101a = i10;
        this.f48102b = y3Var;
        this.f48103c = str;
    }

    @Override
    public final void run() {
        switch (this.f48101a) {
            case 0:
                y3.i1(this.f48102b, this.f48103c);
                return;
            case 1:
                y3.h1(this.f48102b, this.f48103c);
                return;
            case 2:
                y3.u0(this.f48102b, this.f48103c);
                return;
            case 3:
                y3.Q0(this.f48102b, this.f48103c);
                return;
            case 4:
                y3.D0(this.f48102b, this.f48103c);
                return;
            case 5:
                y3.Q(this.f48102b, this.f48103c);
                return;
            case 6:
                y3.x0(this.f48102b, this.f48103c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f48103c);
                qc k10 = this.f48102b.getBulletinFactory().k(false);
                k10.f27560t = true;
                k10.j();
                return;
            default:
                y3.p0(this.f48102b, this.f48103c);
                return;
        }
    }
}
