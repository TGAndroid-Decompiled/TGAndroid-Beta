package rh;

import org.telegram.messenger.r20;
public final class n4 implements r20 {
    public final int f47262a = 1;
    public final e6 f47263b;
    public final int f47264c;
    public final r20 d;
    public final boolean[] e;
    public final r20 f47265f;

    public n4(e6 e6Var, int i10, r20 r20Var, boolean[] zArr, r20 r20Var2) {
        this.f47263b = e6Var;
        this.f47264c = i10;
        this.d = r20Var;
        this.e = zArr;
        this.f47265f = r20Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f47262a) {
            case 0:
                this.e[0] = true;
                if (this.f47264c > 0) {
                    this.f47263b.R();
                }
                r20 r20Var = this.d;
                if (r20Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    r20Var.a(str);
                }
                r20 r20Var2 = this.f47265f;
                if (r20Var2 != null) {
                    r20Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f47264c > 0) {
                    this.f47263b.R();
                }
                r20 r20Var3 = this.d;
                if (r20Var3 != null) {
                    r20Var3.a(Boolean.TRUE);
                }
                this.e[0] = true;
                r20 r20Var4 = this.f47265f;
                if (r20Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    r20Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public n4(e6 e6Var, boolean[] zArr, int i10, r20 r20Var, r20 r20Var2) {
        this.f47263b = e6Var;
        this.e = zArr;
        this.f47264c = i10;
        this.d = r20Var;
        this.f47265f = r20Var2;
    }
}
