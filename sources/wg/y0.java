package wg;

import org.telegram.messenger.w10;
import org.telegram.ui.Wallet.o5;
public final class y0 implements w10 {
    public final int f59967a;
    public final d1 f59968b;

    public y0(d1 d1Var, int i7) {
        this.f59967a = i7;
        this.f59968b = d1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59967a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f59968b.dismiss();
                return;
            default:
                d1 d1Var = this.f59968b;
                d1Var.f59856j2 = (String) obj;
                o5 o5Var = d1Var.f59863q2;
                org.telegram.messenger.g0.r(o5Var);
                org.telegram.messenger.g0.h3(o5Var, 350L);
                return;
        }
    }
}
