package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sc;
public final class r1 implements Runnable {
    public final int f51059a;
    public final r3 f51060b;
    public final String f51061c;

    public r1(r3 r3Var, String str, int i10) {
        this.f51059a = i10;
        this.f51060b = r3Var;
        this.f51061c = str;
    }

    @Override
    public final void run() {
        switch (this.f51059a) {
            case 0:
                r3.j1(this.f51060b, this.f51061c);
                return;
            case 1:
                r3.i1(this.f51060b, this.f51061c);
                return;
            case 2:
                r3.v0(this.f51060b, this.f51061c);
                return;
            case 3:
                r3.R0(this.f51060b, this.f51061c);
                return;
            case 4:
                r3.E0(this.f51060b, this.f51061c);
                return;
            case 5:
                r3.R(this.f51060b, this.f51061c);
                return;
            case 6:
                r3.y0(this.f51060b, this.f51061c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f51061c);
                sc k10 = this.f51060b.getBulletinFactory().k(false);
                k10.f28815t = true;
                k10.j();
                return;
            default:
                r3.p0(this.f51060b, this.f51061c);
                return;
        }
    }
}
