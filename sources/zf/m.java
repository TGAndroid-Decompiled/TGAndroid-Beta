package zf;

import org.telegram.ui.ys0;

public final class m implements q0.a {

    public final int f50565a;

    public final ys0 f50566b;

    public m(ys0 ys0Var, int i10) {
        this.f50565a = i10;
        this.f50566b = ys0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f50565a) {
            case 0:
                l0.Z(this.f50566b, (Integer) obj);
                break;
            default:
                l0.c0(this.f50566b, (Integer) obj);
                break;
        }
    }
}
