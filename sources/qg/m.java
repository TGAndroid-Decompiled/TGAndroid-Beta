package qg;

import org.telegram.ui.bu0;
public final class m implements q0.a {
    public final int f46358a;
    public final bu0 f46359b;

    public m(bu0 bu0Var, int i10) {
        this.f46358a = i10;
        this.f46359b = bu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f46358a) {
            case 0:
                m0.Z(this.f46359b, (Integer) obj);
                return;
            default:
                m0.c0(this.f46359b, (Integer) obj);
                return;
        }
    }
}
