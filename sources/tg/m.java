package tg;

import org.telegram.ui.tp0;
public final class m implements q0.a {
    public final int f55711a;
    public final tp0 f55712b;

    public m(tp0 tp0Var, int i7) {
        this.f55711a = i7;
        this.f55712b = tp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f55711a) {
            case 0:
                g0.X(this.f55712b, (Integer) obj);
                return;
            default:
                g0.a0(this.f55712b, (Integer) obj);
                return;
        }
    }
}
