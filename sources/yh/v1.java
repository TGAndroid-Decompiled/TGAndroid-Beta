package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
public final class v1 implements Runnable {
    public final int f48138a;
    public final x3 f48139b;
    public final String f48140c;

    public v1(x3 x3Var, String str, int i10) {
        this.f48138a = i10;
        this.f48139b = x3Var;
        this.f48140c = str;
    }

    @Override
    public final void run() {
        switch (this.f48138a) {
            case 0:
                x3.i1(this.f48139b, this.f48140c);
                return;
            case 1:
                x3.h1(this.f48139b, this.f48140c);
                return;
            case 2:
                x3.u0(this.f48139b, this.f48140c);
                return;
            case 3:
                x3.Q0(this.f48139b, this.f48140c);
                return;
            case 4:
                x3.D0(this.f48139b, this.f48140c);
                return;
            case 5:
                x3.Q(this.f48139b, this.f48140c);
                return;
            case 6:
                x3.x0(this.f48139b, this.f48140c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f48140c);
                qc k10 = this.f48139b.getBulletinFactory().k(false);
                k10.f27587t = true;
                k10.j();
                return;
            default:
                x3.o0(this.f48139b, this.f48140c);
                return;
        }
    }
}
