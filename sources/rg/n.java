package rg;

import org.telegram.ui.zt0;
public final class n implements q0.a {
    public final int f45349a;
    public final zt0 f45350b;

    public n(zt0 zt0Var, int i10) {
        this.f45349a = i10;
        this.f45350b = zt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45349a) {
            case 0:
                o0.Z(this.f45350b, (Integer) obj);
                return;
            default:
                o0.c0(this.f45350b, (Integer) obj);
                return;
        }
    }
}
