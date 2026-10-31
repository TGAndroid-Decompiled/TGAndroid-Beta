package vh;

import org.telegram.messenger.q20;
public final class m implements q20 {
    public final int f51461a;
    public final e8 f51462b;

    public m(e8 e8Var, int i10) {
        this.f51461a = i10;
        this.f51462b = e8Var;
    }

    @Override
    public final void a(Object obj) {
        Integer num = (Integer) obj;
        switch (this.f51461a) {
            case 0:
                int intValue = num.intValue();
                e8 e8Var = this.f51462b;
                e8Var.setPeriod(intValue);
                q20 q20Var = e8Var.A1;
                if (q20Var != null) {
                    q20Var.a(num);
                    return;
                }
                return;
            default:
                q20 q20Var2 = this.f51462b.B1;
                if (q20Var2 != null) {
                    q20Var2.a(num);
                    return;
                }
                return;
        }
    }
}
