package qg;

import org.telegram.ui.cu0;
public final class m implements q0.a {
    public final int f46295a;
    public final cu0 f46296b;

    public m(cu0 cu0Var, int i10) {
        this.f46295a = i10;
        this.f46296b = cu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f46295a) {
            case 0:
                m0.Z(this.f46296b, (Integer) obj);
                return;
            default:
                m0.c0(this.f46296b, (Integer) obj);
                return;
        }
    }
}
