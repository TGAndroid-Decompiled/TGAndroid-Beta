package tg;

import org.telegram.ui.vp0;
public final class r implements q0.a {
    public final int f58186a;
    public final vp0 f58187b;

    public r(vp0 vp0Var, int i7) {
        this.f58186a = i7;
        this.f58187b = vp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f58186a) {
            case 0:
                l0.Z(this.f58187b, (Integer) obj);
                return;
            default:
                l0.a0(this.f58187b, (Integer) obj);
                return;
        }
    }
}
