package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc;
public final class v1 implements Runnable {
    public final int f47909a;
    public final a4 f47910b;
    public final String f47911c;

    public v1(a4 a4Var, String str, int i10) {
        this.f47909a = i10;
        this.f47910b = a4Var;
        this.f47911c = str;
    }

    @Override
    public final void run() {
        switch (this.f47909a) {
            case 0:
                a4.i1(this.f47910b, this.f47911c);
                return;
            case 1:
                a4.h1(this.f47910b, this.f47911c);
                return;
            case 2:
                a4.u0(this.f47910b, this.f47911c);
                return;
            case 3:
                a4.Q0(this.f47910b, this.f47911c);
                return;
            case 4:
                a4.D0(this.f47910b, this.f47911c);
                return;
            case 5:
                a4.Q(this.f47910b, this.f47911c);
                return;
            case 6:
                a4.x0(this.f47910b, this.f47911c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f47911c);
                oc k10 = this.f47910b.getBulletinFactory().k(false);
                k10.f26715t = true;
                k10.j();
                return;
            default:
                a4.p0(this.f47910b, this.f47911c);
                return;
        }
    }
}
