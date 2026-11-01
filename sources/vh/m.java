package vh;

import org.telegram.messenger.r20;
public final class m implements r20 {
    public final int f51476a;
    public final e8 f51477b;

    public m(e8 e8Var, int i10) {
        this.f51476a = i10;
        this.f51477b = e8Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f51476a) {
            case 0:
                int intValue = num.intValue();
                e8 e8Var = this.f51477b;
                e8Var.setPeriod(intValue);
                r20 r20Var = e8Var.A1;
                if (r20Var != null) {
                    r20Var.a(num);
                    return;
                }
                return;
            default:
                r20 r20Var2 = this.f51477b.B1;
                if (r20Var2 != null) {
                    r20Var2.a(num);
                    return;
                }
                return;
        }
    }
}
