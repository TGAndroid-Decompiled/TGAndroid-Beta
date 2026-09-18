package qg;

import org.telegram.ui.cu0;
public final class m implements q0.a {
    public final int f41477a;
    public final cu0 f41478b;

    public m(cu0 cu0Var, int i10) {
        this.f41477a = i10;
        this.f41478b = cu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f41477a) {
            case 0:
                p0.Z(this.f41478b, (Integer) obj);
                return;
            default:
                p0.c0(this.f41478b, (Integer) obj);
                return;
        }
    }
}
