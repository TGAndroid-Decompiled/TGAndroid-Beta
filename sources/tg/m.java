package tg;

import org.telegram.ui.vp0;
public final class m implements q0.a {
    public final int f58003a;
    public final vp0 f58004b;

    public m(vp0 vp0Var, int i7) {
        this.f58003a = i7;
        this.f58004b = vp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f58003a) {
            case 0:
                g0.X(this.f58004b, (Integer) obj);
                return;
            default:
                g0.a0(this.f58004b, (Integer) obj);
                return;
        }
    }
}
