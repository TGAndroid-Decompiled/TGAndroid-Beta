package tg;

import org.telegram.ui.xp0;
public final class m implements q0.a {
    public final int f55839a;
    public final xp0 f55840b;

    public m(xp0 xp0Var, int i7) {
        this.f55839a = i7;
        this.f55840b = xp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f55839a) {
            case 0:
                g0.X(this.f55840b, (Integer) obj);
                return;
            default:
                g0.a0(this.f55840b, (Integer) obj);
                return;
        }
    }
}
