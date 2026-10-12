package qg;

import org.telegram.ui.cu0;
public final class m implements q0.a {
    public final int f46303a;
    public final cu0 f46304b;

    public m(cu0 cu0Var, int i10) {
        this.f46303a = i10;
        this.f46304b = cu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f46303a) {
            case 0:
                m0.Z(this.f46304b, (Integer) obj);
                return;
            default:
                m0.c0(this.f46304b, (Integer) obj);
                return;
        }
    }
}
