package rg;

import org.telegram.ui.gt0;
public final class m implements q0.a {
    public final int f45471a;
    public final gt0 f45472b;

    public m(gt0 gt0Var, int i10) {
        this.f45471a = i10;
        this.f45472b = gt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45471a) {
            case 0:
                m0.Z(this.f45472b, (Integer) obj);
                return;
            default:
                m0.c0(this.f45472b, (Integer) obj);
                return;
        }
    }
}
