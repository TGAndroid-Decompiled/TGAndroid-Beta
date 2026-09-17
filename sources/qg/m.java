package qg;

import org.telegram.ui.cu0;
public final class m implements q0.a {
    public final int f41472a;
    public final cu0 f41473b;

    public m(cu0 cu0Var, int i10) {
        this.f41472a = i10;
        this.f41473b = cu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41472a) {
            case 0:
                p0.Z(this.f41473b, (Integer) obj);
                return;
            default:
                p0.c0(this.f41473b, (Integer) obj);
                return;
        }
    }
}
