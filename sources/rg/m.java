package rg;

import org.telegram.ui.jt0;
public final class m implements q0.a {
    public final int f45881a;
    public final jt0 f45882b;

    public m(jt0 jt0Var, int i10) {
        this.f45881a = i10;
        this.f45882b = jt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45881a) {
            case 0:
                m0.Y(this.f45882b, (Integer) obj);
                return;
            default:
                m0.b0(this.f45882b, (Integer) obj);
                return;
        }
    }
}
