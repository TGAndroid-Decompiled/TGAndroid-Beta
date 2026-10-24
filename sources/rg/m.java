package rg;

import org.telegram.ui.it0;
public final class m implements q0.a {
    public final int f45880a;
    public final it0 f45881b;

    public m(it0 it0Var, int i10) {
        this.f45880a = i10;
        this.f45881b = it0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f45880a) {
            case 0:
                m0.Y(this.f45881b, (Integer) obj);
                return;
            default:
                m0.b0(this.f45881b, (Integer) obj);
                return;
        }
    }
}
