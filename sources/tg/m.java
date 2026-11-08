package tg;

import org.telegram.ui.up0;
public final class m implements q0.a {
    public final int f55827a;
    public final up0 f55828b;

    public m(up0 up0Var, int i7) {
        this.f55827a = i7;
        this.f55828b = up0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f55827a) {
            case 0:
                g0.X(this.f55828b, (Integer) obj);
                return;
            default:
                g0.a0(this.f55828b, (Integer) obj);
                return;
        }
    }
}
