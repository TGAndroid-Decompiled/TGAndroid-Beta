package qg;

import org.telegram.ui.tt0;
public final class m implements q0.a {
    public final int f41402a;
    public final tt0 f41403b;

    public m(tt0 tt0Var, int i10) {
        this.f41402a = i10;
        this.f41403b = tt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41402a) {
            case 0:
                p0.Z(this.f41403b, (Integer) obj);
                return;
            default:
                p0.c0(this.f41403b, (Integer) obj);
                return;
        }
    }
}
