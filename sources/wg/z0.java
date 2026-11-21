package wg;

import org.telegram.messenger.x10;
public final class z0 implements x10 {
    public final int f59903a;
    public final e1 f59904b;

    public z0(e1 e1Var, int i7) {
        this.f59903a = i7;
        this.f59904b = e1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59903a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f59904b.dismiss();
                return;
            default:
                e1 e1Var = this.f59904b;
                e1Var.f59792j2 = (String) obj;
                s4.s0 s0Var = e1Var.f59799q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                return;
        }
    }
}
