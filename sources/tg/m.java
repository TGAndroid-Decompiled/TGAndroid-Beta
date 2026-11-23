package tg;

import org.telegram.ui.vp0;
public final class m implements q0.a {
    public final int f58058a;
    public final vp0 f58059b;

    public m(vp0 vp0Var, int i7) {
        this.f58058a = i7;
        this.f58059b = vp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f58058a) {
            case 0:
                h0.X(this.f58059b, (Integer) obj);
                return;
            default:
                h0.a0(this.f58059b, (Integer) obj);
                return;
        }
    }
}
