package tg;

import org.telegram.ui.up0;
public final class m implements q0.a {
    public final int f55736a;
    public final up0 f55737b;

    public m(up0 up0Var, int i7) {
        this.f55736a = i7;
        this.f55737b = up0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f55736a) {
            case 0:
                g0.X(this.f55737b, (Integer) obj);
                return;
            default:
                g0.a0(this.f55737b, (Integer) obj);
                return;
        }
    }
}
