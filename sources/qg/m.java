package qg;

import org.telegram.ui.st0;
public final class m implements q0.a {
    public final int f41756a;
    public final st0 f41757b;

    public m(st0 st0Var, int i10) {
        this.f41756a = i10;
        this.f41757b = st0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41756a) {
            case 0:
                n0.Z(this.f41757b, (Integer) obj);
                return;
            default:
                n0.c0(this.f41757b, (Integer) obj);
                return;
        }
    }
}
