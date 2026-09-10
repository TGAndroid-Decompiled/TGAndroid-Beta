package pg;

import org.telegram.ui.zt0;
public final class m implements q0.a {
    public final int f40121a;
    public final zt0 f40122b;

    public m(zt0 zt0Var, int i10) {
        this.f40121a = i10;
        this.f40122b = zt0Var;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f40121a) {
            case 0:
                m0.Z(this.f40122b, (Integer) obj);
                return;
            default:
                m0.c0(this.f40122b, (Integer) obj);
                return;
        }
    }
}
