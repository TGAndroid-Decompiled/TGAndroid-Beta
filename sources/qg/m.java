package qg;

import org.telegram.ui.au0;
public final class m implements q0.a {
    public final int f41450a;
    public final au0 f41451b;

    public m(au0 au0Var, int i10) {
        this.f41450a = i10;
        this.f41451b = au0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41450a) {
            case 0:
                p0.Z(this.f41451b, (Integer) obj);
                return;
            default:
                p0.c0(this.f41451b, (Integer) obj);
                return;
        }
    }
}
