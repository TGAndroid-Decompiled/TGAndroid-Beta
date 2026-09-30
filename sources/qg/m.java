package qg;

import org.telegram.ui.st0;
public final class m implements q0.a {
    public final int f41855a;
    public final st0 f41856b;

    public m(st0 st0Var, int i10) {
        this.f41855a = i10;
        this.f41856b = st0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41855a) {
            case 0:
                n0.Z(this.f41856b, (Integer) obj);
                return;
            default:
                n0.c0(this.f41856b, (Integer) obj);
                return;
        }
    }
}
