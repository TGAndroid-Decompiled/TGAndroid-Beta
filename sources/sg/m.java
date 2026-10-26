package sg;

import org.telegram.ui.nt0;
public final class m implements q0.a {
    public final int f48303a;
    public final nt0 f48304b;

    public m(nt0 nt0Var, int i10) {
        this.f48303a = i10;
        this.f48304b = nt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f48303a) {
            case 0:
                n0.X(this.f48304b, (Integer) obj);
                return;
            default:
                n0.a0(this.f48304b, (Integer) obj);
                return;
        }
    }
}
