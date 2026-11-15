package tg;

import org.telegram.ui.tp0;
public final class m implements q0.a {
    public final int f57433a;
    public final tp0 f57434b;

    public m(tp0 tp0Var, int i7) {
        this.f57433a = i7;
        this.f57434b = tp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f57433a) {
            case 0:
                g0.X(this.f57434b, (Integer) obj);
                return;
            default:
                g0.a0(this.f57434b, (Integer) obj);
                return;
        }
    }
}
