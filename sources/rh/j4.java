package rh;

import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
public final class j4 implements j20 {
    public final int f47125a = 0;
    public final boolean[] f47126b;
    public final j20 f47127c;
    public final q20 d;

    public j4(q20 q20Var, boolean[] zArr, j20 j20Var) {
        this.d = q20Var;
        this.f47126b = zArr;
        this.f47127c = j20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f47125a) {
            case 0:
                q20 q20Var = this.d;
                if (q20Var != null) {
                    q20Var.a(Boolean.TRUE);
                }
                this.f47126b[0] = true;
                j20 j20Var = this.f47127c;
                if (j20Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    j20Var.a(str, l4);
                    return;
                }
                return;
            default:
                this.f47126b[0] = true;
                j20 j20Var2 = this.f47127c;
                if (j20Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    j20Var2.a(str2, l4);
                }
                q20 q20Var2 = this.d;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public j4(boolean[] zArr, j20 j20Var, q20 q20Var) {
        this.f47126b = zArr;
        this.f47127c = j20Var;
        this.d = q20Var;
    }
}
