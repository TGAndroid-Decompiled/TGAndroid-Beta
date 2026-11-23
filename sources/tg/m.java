package tg;

import org.telegram.ui.wp0;
public final class m implements q0.a {
    public final int f58023a;
    public final wp0 f58024b;

    public m(wp0 wp0Var, int i7) {
        this.f58023a = i7;
        this.f58024b = wp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f58023a) {
            case 0:
                h0.X(this.f58024b, (Integer) obj);
                return;
            default:
                h0.a0(this.f58024b, (Integer) obj);
                return;
        }
    }
}
