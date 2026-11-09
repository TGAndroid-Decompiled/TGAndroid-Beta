package tg;

import org.telegram.ui.wp0;
public final class m implements q0.a {
    public final int f55840a;
    public final wp0 f55841b;

    public m(wp0 wp0Var, int i7) {
        this.f55840a = i7;
        this.f55841b = wp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f55840a) {
            case 0:
                g0.X(this.f55841b, (Integer) obj);
                return;
            default:
                g0.a0(this.f55841b, (Integer) obj);
                return;
        }
    }
}
