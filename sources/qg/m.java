package qg;

import org.telegram.ui.st0;
public final class m implements q0.a {
    public final int f41755a;
    public final st0 f41756b;

    public m(st0 st0Var, int i10) {
        this.f41755a = i10;
        this.f41756b = st0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41755a) {
            case 0:
                n0.Z(this.f41756b, (Integer) obj);
                return;
            default:
                n0.c0(this.f41756b, (Integer) obj);
                return;
        }
    }
}
