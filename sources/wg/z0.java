package wg;

import org.telegram.messenger.y10;
public final class z0 implements y10 {
    public final int f59907a;
    public final e1 f59908b;

    public z0(e1 e1Var, int i7) {
        this.f59907a = i7;
        this.f59908b = e1Var;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f59907a) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.f59908b.dismiss();
                return;
            default:
                e1 e1Var = this.f59908b;
                e1Var.f59796j2 = (String) obj;
                s4.s0 s0Var = e1Var.f59803q2;
                org.telegram.messenger.g0.r(s0Var);
                org.telegram.messenger.g0.h3(s0Var, 350L);
                return;
        }
    }
}
