package qg;

import org.telegram.ui.vt0;
public final class m implements q0.a {
    public final int f45154a;
    public final vt0 f45155b;

    public m(vt0 vt0Var, int i10) {
        this.f45154a = i10;
        this.f45155b = vt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45154a) {
            case 0:
                m0.Z(this.f45155b, (Integer) obj);
                return;
            default:
                m0.c0(this.f45155b, (Integer) obj);
                return;
        }
    }
}
