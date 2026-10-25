package sg;

import org.telegram.ui.nt0;
public final class m implements q0.a {
    public final int f48300a;
    public final nt0 f48301b;

    public m(nt0 nt0Var, int i10) {
        this.f48300a = i10;
        this.f48301b = nt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f48300a) {
            case 0:
                n0.X(this.f48301b, (Integer) obj);
                return;
            default:
                n0.a0(this.f48301b, (Integer) obj);
                return;
        }
    }
}
