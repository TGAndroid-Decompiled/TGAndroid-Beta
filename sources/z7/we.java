package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f51219a;
    public final Boolean f51220b;
    public final Boolean f51221c;
    public final Boolean d;
    public final Boolean e;

    public we(com.google.android.gms.internal.cast.z5 z5Var) {
        this.f51219a = (Boolean) z5Var.f6882b;
        this.f51220b = (Boolean) z5Var.f6883c;
        this.f51221c = (Boolean) z5Var.f6881a;
        this.d = (Boolean) z5Var.d;
        this.e = (Boolean) z5Var.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.l.l(this.f51219a, weVar.f51219a) && n6.l.l(this.f51220b, weVar.f51220b) && n6.l.l(this.f51221c, weVar.f51221c) && n6.l.l(this.d, weVar.d) && n6.l.l(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51219a, this.f51220b, this.f51221c, this.d, this.e});
    }
}
