package qg;

import org.telegram.ui.vt0;
public final class m implements q0.a {
    public final int f45168a;
    public final vt0 f45169b;

    public m(vt0 vt0Var, int i10) {
        this.f45168a = i10;
        this.f45169b = vt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45168a) {
            case 0:
                m0.Z(this.f45169b, (Integer) obj);
                return;
            default:
                m0.c0(this.f45169b, (Integer) obj);
                return;
        }
    }
}
