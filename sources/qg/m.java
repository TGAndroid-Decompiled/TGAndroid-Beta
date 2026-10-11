package qg;

import org.telegram.ui.au0;
public final class m implements q0.a {
    public final int f46487a;
    public final au0 f46488b;

    public m(au0 au0Var, int i10) {
        this.f46487a = i10;
        this.f46488b = au0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f46487a) {
            case 0:
                m0.Z(this.f46488b, (Integer) obj);
                return;
            default:
                m0.c0(this.f46488b, (Integer) obj);
                return;
        }
    }
}
