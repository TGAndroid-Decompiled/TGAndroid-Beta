package rh;

import org.telegram.messenger.q20;
public final class n4 implements q20 {
    public final int f47251a = 1;
    public final e6 f47252b;
    public final int f47253c;
    public final q20 d;
    public final boolean[] e;
    public final q20 f47254f;

    public n4(e6 e6Var, int i10, q20 q20Var, boolean[] zArr, q20 q20Var2) {
        this.f47252b = e6Var;
        this.f47253c = i10;
        this.d = q20Var;
        this.e = zArr;
        this.f47254f = q20Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f47251a) {
            case 0:
                this.e[0] = true;
                if (this.f47253c > 0) {
                    this.f47252b.R();
                }
                q20 q20Var = this.d;
                if (q20Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    q20Var.a(str);
                }
                q20 q20Var2 = this.f47254f;
                if (q20Var2 != null) {
                    q20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f47253c > 0) {
                    this.f47252b.R();
                }
                q20 q20Var3 = this.d;
                if (q20Var3 != null) {
                    q20Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                q20 q20Var4 = this.f47254f;
                if (q20Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    q20Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public n4(e6 e6Var, boolean[] zArr, int i10, q20 q20Var, q20 q20Var2) {
        this.f47252b = e6Var;
        this.e = zArr;
        this.f47253c = i10;
        this.d = q20Var;
        this.f47254f = q20Var2;
    }
}
