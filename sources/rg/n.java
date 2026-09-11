package rg;

import org.telegram.ui.zt0;
public final class n implements q0.a {
    public final int f45320a;
    public final zt0 f45321b;

    public n(zt0 zt0Var, int i10) {
        this.f45320a = i10;
        this.f45321b = zt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45320a) {
            case 0:
                o0.Z(this.f45321b, (Integer) obj);
                return;
            default:
                o0.c0(this.f45321b, (Integer) obj);
                return;
        }
    }
}
