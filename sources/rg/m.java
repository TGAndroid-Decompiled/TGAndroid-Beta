package rg;

import org.telegram.ui.hu0;
public final class m implements q0.a {
    public final int f44345a;
    public final hu0 f44346b;

    public m(hu0 hu0Var, int i10) {
        this.f44345a = i10;
        this.f44346b = hu0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f44345a) {
            case 0:
                o0.Z(this.f44346b, (Integer) obj);
                return;
            default:
                o0.c0(this.f44346b, (Integer) obj);
                return;
        }
    }
}
