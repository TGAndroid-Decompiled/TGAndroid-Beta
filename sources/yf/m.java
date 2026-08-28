package yf;

import org.telegram.ui.xs0;
public final class m implements q0.a {
    public final int f49972a;
    public final xs0 f49973b;

    public m(xs0 xs0Var, int i9) {
        this.f49972a = i9;
        this.f49973b = xs0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f49972a) {
            case 0:
                l0.Z(this.f49973b, (Integer) obj);
                return;
            default:
                l0.c0(this.f49973b, (Integer) obj);
                return;
        }
    }
}
