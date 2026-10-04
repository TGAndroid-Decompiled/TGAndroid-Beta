package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
public final class v1 implements Runnable {
    public final int f52118a;
    public final x3 f52119b;
    public final String f52120c;

    public v1(x3 x3Var, String str, int i10) {
        this.f52118a = i10;
        this.f52119b = x3Var;
        this.f52120c = str;
    }

    @Override
    public final void run() {
        switch (this.f52118a) {
            case 0:
                x3.i1(this.f52119b, this.f52120c);
                return;
            case 1:
                x3.h1(this.f52119b, this.f52120c);
                return;
            case 2:
                x3.u0(this.f52119b, this.f52120c);
                return;
            case 3:
                x3.Q0(this.f52119b, this.f52120c);
                return;
            case 4:
                x3.D0(this.f52119b, this.f52120c);
                return;
            case 5:
                x3.O(this.f52119b, this.f52120c);
                return;
            case 6:
                x3.x0(this.f52119b, this.f52120c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f52120c);
                rc k10 = this.f52119b.getBulletinFactory().k(false);
                k10.f30355t = true;
                k10.j();
                return;
            default:
                x3.o0(this.f52119b, this.f52120c);
                return;
        }
    }
}
