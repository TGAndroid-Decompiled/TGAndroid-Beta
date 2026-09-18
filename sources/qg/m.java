package qg;

import org.telegram.ui.au0;
public final class m implements q0.a {
    public final int f41735a;
    public final au0 f41736b;

    public m(au0 au0Var, int i10) {
        this.f41735a = i10;
        this.f41736b = au0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41735a) {
            case 0:
                m0.Z(this.f41736b, (Integer) obj);
                return;
            default:
                m0.c0(this.f41736b, (Integer) obj);
                return;
        }
    }
}
