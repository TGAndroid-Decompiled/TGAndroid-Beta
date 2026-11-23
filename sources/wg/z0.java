package wg;

import org.telegram.messenger.y10;
public final class z0 implements y10 {
    public final int f59872a;
    public final e1 f59873b;

    public z0(e1 e1Var, int i7) {
        this.f59872a = i7;
        this.f59873b = e1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59872a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f59873b.dismiss();
                return;
            default:
                e1 e1Var = this.f59873b;
                e1Var.f59761j2 = (String) obj;
                s4.s0 s0Var = e1Var.f59768q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                return;
        }
    }
}
