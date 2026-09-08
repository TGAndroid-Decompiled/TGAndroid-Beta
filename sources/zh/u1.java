package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qc;
public final class u1 implements Runnable {
    public final int f52711a;
    public final w3 f52712b;
    public final String f52713c;

    public u1(w3 w3Var, String str, int i10) {
        this.f52711a = i10;
        this.f52712b = w3Var;
        this.f52713c = str;
    }

    @Override
    public final void run() {
        switch (this.f52711a) {
            case 0:
                w3.i1(this.f52712b, this.f52713c);
                return;
            case 1:
                w3.h1(this.f52712b, this.f52713c);
                return;
            case 2:
                w3.u0(this.f52712b, this.f52713c);
                return;
            case 3:
                w3.Q0(this.f52712b, this.f52713c);
                return;
            case 4:
                w3.D0(this.f52712b, this.f52713c);
                return;
            case 5:
                w3.Q(this.f52712b, this.f52713c);
                return;
            case 6:
                w3.x0(this.f52712b, this.f52713c);
                return;
            case 7:
                AndroidUtilities.addToClipboard(this.f52713c);
                qc k10 = this.f52712b.getBulletinFactory().k(false);
                k10.f29716t = true;
                k10.j();
                return;
            default:
                w3.p0(this.f52712b, this.f52713c);
                return;
        }
    }
}
