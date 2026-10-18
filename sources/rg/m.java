package rg;

import org.telegram.ui.it0;
public final class m implements q0.a {
    public final int f45510a;
    public final it0 f45511b;

    public m(it0 it0Var, int i10) {
        this.f45510a = i10;
        this.f45511b = it0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45510a) {
            case 0:
                m0.Z(this.f45511b, (Integer) obj);
                return;
            default:
                m0.c0(this.f45511b, (Integer) obj);
                return;
        }
    }
}
