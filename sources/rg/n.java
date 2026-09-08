package rg;

import org.telegram.ui.zt0;
public final class n implements q0.a {
    public final int f45348a;
    public final zt0 f45349b;

    public n(zt0 zt0Var, int i10) {
        this.f45348a = i10;
        this.f45349b = zt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45348a) {
            case 0:
                o0.Z(this.f45349b, (Integer) obj);
                return;
            default:
                o0.c0(this.f45349b, (Integer) obj);
                return;
        }
    }
}
