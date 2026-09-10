package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
public final class v1 implements Runnable {
    public final int f46163a;
    public final x3 f46164b;
    public final String f46165c;

    public v1(x3 x3Var, String str, int i10) {
        this.f46163a = i10;
        this.f46164b = x3Var;
        this.f46165c = str;
    }

    @Override
    public final void run() {
        switch (this.f46163a) {
            case 0:
                x3.i1(this.f46164b, this.f46165c);
                return;
            case 1:
                x3.h1(this.f46164b, this.f46165c);
                return;
            case 2:
                x3.u0(this.f46164b, this.f46165c);
                return;
            case 3:
                x3.Q0(this.f46164b, this.f46165c);
                return;
            case 4:
                x3.D0(this.f46164b, this.f46165c);
                return;
            case 5:
                x3.Q(this.f46164b, this.f46165c);
                return;
            case 6:
                x3.x0(this.f46164b, this.f46165c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f46165c);
                pc k10 = this.f46164b.getBulletinFactory().k(false);
                k10.f26091t = true;
                k10.j();
                return;
            default:
                x3.p0(this.f46164b, this.f46165c);
                return;
        }
    }
}
