package qg;

import org.telegram.ui.bu0;
public final class m implements q0.a {
    public final int f46402a;
    public final bu0 f46403b;

    public m(bu0 bu0Var, int i10) {
        this.f46402a = i10;
        this.f46403b = bu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f46402a) {
            case 0:
                m0.Z(this.f46403b, (Integer) obj);
                return;
            default:
                m0.c0(this.f46403b, (Integer) obj);
                return;
        }
    }
}
