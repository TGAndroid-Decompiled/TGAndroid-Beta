package tg;

import org.telegram.ui.tp0;
public final class m implements q0.a {
    public final int f57420a;
    public final tp0 f57421b;

    public m(tp0 tp0Var, int i7) {
        this.f57420a = i7;
        this.f57421b = tp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f57420a) {
            case 0:
                g0.X(this.f57421b, (Integer) obj);
                return;
            default:
                g0.a0(this.f57421b, (Integer) obj);
                return;
        }
    }
}
