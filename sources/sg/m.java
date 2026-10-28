package sg;

import org.telegram.ui.pt0;
public final class m implements q0.a {
    public final int f48356a;
    public final pt0 f48357b;

    public m(pt0 pt0Var, int i10) {
        this.f48356a = i10;
        this.f48357b = pt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f48356a) {
            case 0:
                m0.X(this.f48357b, (Integer) obj);
                return;
            default:
                m0.a0(this.f48357b, (Integer) obj);
                return;
        }
    }
}
