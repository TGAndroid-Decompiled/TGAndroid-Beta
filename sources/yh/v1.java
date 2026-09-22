package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc;
public final class v1 implements Runnable {
    public final int f47834a;
    public final z3 f47835b;
    public final String f47836c;

    public v1(z3 z3Var, String str, int i10) {
        this.f47834a = i10;
        this.f47835b = z3Var;
        this.f47836c = str;
    }

    @Override
    public final void run() {
        switch (this.f47834a) {
            case 0:
                z3.i1(this.f47835b, this.f47836c);
                return;
            case 1:
                z3.h1(this.f47835b, this.f47836c);
                return;
            case 2:
                z3.u0(this.f47835b, this.f47836c);
                return;
            case 3:
                z3.Q0(this.f47835b, this.f47836c);
                return;
            case 4:
                z3.D0(this.f47835b, this.f47836c);
                return;
            case 5:
                z3.Q(this.f47835b, this.f47836c);
                return;
            case 6:
                z3.x0(this.f47835b, this.f47836c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f47836c);
                oc k10 = this.f47835b.getBulletinFactory().k(false);
                k10.f26761t = true;
                k10.j();
                return;
            default:
                z3.p0(this.f47835b, this.f47836c);
                return;
        }
    }
}
