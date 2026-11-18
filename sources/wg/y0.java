package wg;

import org.telegram.messenger.x10;
public final class y0 implements x10 {
    public final int f59859a;
    public final d1 f59860b;

    public y0(d1 d1Var, int i7) {
        this.f59859a = i7;
        this.f59860b = d1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59859a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f59860b.dismiss();
                return;
            default:
                d1 d1Var = this.f59860b;
                d1Var.f59746j2 = (String) obj;
                s4.s0 s0Var = d1Var.f59753q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                return;
        }
    }
}
