package qg;

import org.telegram.ui.vt0;
public final class m implements q0.a {
    public final int f41793a;
    public final vt0 f41794b;

    public m(vt0 vt0Var, int i10) {
        this.f41793a = i10;
        this.f41794b = vt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41793a) {
            case 0:
                m0.Z(this.f41794b, (Integer) obj);
                return;
            default:
                m0.c0(this.f41794b, (Integer) obj);
                return;
        }
    }
}
