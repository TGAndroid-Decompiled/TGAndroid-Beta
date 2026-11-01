package rh;

import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
public final class j4 implements k20 {
    public final int f47139a = 0;
    public final boolean[] f47140b;
    public final k20 f47141c;
    public final r20 d;

    public j4(r20 r20Var, boolean[] zArr, k20 k20Var) {
        this.d = r20Var;
        this.f47140b = zArr;
        this.f47141c = k20Var;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        String str;
        String str2;
        Long l4 = (Long) obj;
        Boolean bool = (Boolean) obj2;
        switch (this.f47139a) {
            case 0:
                r20 r20Var = this.d;
                if (r20Var != null) {
                    r20Var.a(Boolean.TRUE);
                }
                this.f47140b[0] = true;
                k20 k20Var = this.f47141c;
                if (k20Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    k20Var.a(str, l4);
                    return;
                }
                return;
            default:
                this.f47140b[0] = true;
                k20 k20Var2 = this.f47141c;
                if (k20Var2 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    k20Var2.a(str2, l4);
                }
                r20 r20Var2 = this.d;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
        }
    }

    public j4(boolean[] zArr, k20 k20Var, r20 r20Var) {
        this.f47140b = zArr;
        this.f47141c = k20Var;
        this.d = r20Var;
    }
}
