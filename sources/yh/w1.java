package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
public final class w1 implements Runnable {
    public final int f52185a;
    public final y3 f52186b;
    public final String f52187c;

    public w1(y3 y3Var, String str, int i10) {
        this.f52185a = i10;
        this.f52186b = y3Var;
        this.f52187c = str;
    }

    @Override
    public final void run() {
        switch (this.f52185a) {
            case 0:
                y3.i1(this.f52186b, this.f52187c);
                return;
            case 1:
                y3.h1(this.f52186b, this.f52187c);
                return;
            case 2:
                y3.u0(this.f52186b, this.f52187c);
                return;
            case 3:
                y3.Q0(this.f52186b, this.f52187c);
                return;
            case 4:
                y3.D0(this.f52186b, this.f52187c);
                return;
            case 5:
                y3.O(this.f52186b, this.f52187c);
                return;
            case 6:
                y3.x0(this.f52186b, this.f52187c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f52187c);
                rc k10 = this.f52186b.getBulletinFactory().k(false);
                k10.f30437t = true;
                k10.j();
                return;
            default:
                y3.o0(this.f52186b, this.f52187c);
                return;
        }
    }
}
