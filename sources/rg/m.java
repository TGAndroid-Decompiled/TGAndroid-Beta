package rg;

import org.telegram.ui.gu0;
public final class m implements q0.a {
    public final int f44104a;
    public final gu0 f44105b;

    public m(gu0 gu0Var, int i10) {
        this.f44104a = i10;
        this.f44105b = gu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f44104a) {
            case 0:
                o0.Z(this.f44105b, (Integer) obj);
                return;
            default:
                o0.c0(this.f44105b, (Integer) obj);
                return;
        }
    }
}
