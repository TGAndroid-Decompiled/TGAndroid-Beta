package tg;

import org.telegram.ui.vp0;
public final class m implements q0.a {
    public final int f58054a;
    public final vp0 f58055b;

    public m(vp0 vp0Var, int i7) {
        this.f58054a = i7;
        this.f58055b = vp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f58054a) {
            case 0:
                h0.X(this.f58055b, (Integer) obj);
                return;
            default:
                h0.a0(this.f58055b, (Integer) obj);
                return;
        }
    }
}
