package ug;

import org.telegram.ui.lp0;
public final class m implements q0.a {
    public final int f56150a;
    public final lp0 f56151b;

    public m(lp0 lp0Var, int i3) {
        this.f56150a = i3;
        this.f56151b = lp0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f56150a) {
            case 0:
                f0.X(this.f56151b, (Integer) obj);
                return;
            default:
                f0.a0(this.f56151b, (Integer) obj);
                return;
        }
    }
}
