package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
public final class v1 implements Runnable {
    public final int f47794a;
    public final y3 f47795b;
    public final String f47796c;

    public v1(y3 y3Var, String str, int i10) {
        this.f47794a = i10;
        this.f47795b = y3Var;
        this.f47796c = str;
    }

    @Override
    public final void run() {
        switch (this.f47794a) {
            case 0:
                y3.i1(this.f47795b, this.f47796c);
                return;
            case 1:
                y3.h1(this.f47795b, this.f47796c);
                return;
            case 2:
                y3.u0(this.f47795b, this.f47796c);
                return;
            case 3:
                y3.Q0(this.f47795b, this.f47796c);
                return;
            case 4:
                y3.D0(this.f47795b, this.f47796c);
                return;
            case 5:
                y3.Q(this.f47795b, this.f47796c);
                return;
            case 6:
                y3.x0(this.f47795b, this.f47796c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f47796c);
                qc k10 = this.f47795b.getBulletinFactory().k(false);
                k10.f27316t = true;
                k10.j();
                return;
            default:
                y3.o0(this.f47795b, this.f47796c);
                return;
        }
    }
}
