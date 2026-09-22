package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
public final class v1 implements Runnable {
    public final int f48166a;
    public final y3 f48167b;
    public final String f48168c;

    public v1(y3 y3Var, String str, int i10) {
        this.f48166a = i10;
        this.f48167b = y3Var;
        this.f48168c = str;
    }

    @Override
    public final void run() {
        switch (this.f48166a) {
            case 0:
                y3.i1(this.f48167b, this.f48168c);
                return;
            case 1:
                y3.h1(this.f48167b, this.f48168c);
                return;
            case 2:
                y3.u0(this.f48167b, this.f48168c);
                return;
            case 3:
                y3.Q0(this.f48167b, this.f48168c);
                return;
            case 4:
                y3.D0(this.f48167b, this.f48168c);
                return;
            case 5:
                y3.Q(this.f48167b, this.f48168c);
                return;
            case 6:
                y3.x0(this.f48167b, this.f48168c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f48168c);
                pc k10 = this.f48167b.getBulletinFactory().k(false);
                k10.f27321t = true;
                k10.j();
                return;
            default:
                y3.p0(this.f48167b, this.f48168c);
                return;
        }
    }
}
