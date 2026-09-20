package qg;

import org.telegram.ui.au0;
public final class m implements q0.a {
    public final int f41768a;
    public final au0 f41769b;

    public m(au0 au0Var, int i10) {
        this.f41768a = i10;
        this.f41769b = au0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41768a) {
            case 0:
                n0.Z(this.f41769b, (Integer) obj);
                return;
            default:
                n0.c0(this.f41769b, (Integer) obj);
                return;
        }
    }
}
