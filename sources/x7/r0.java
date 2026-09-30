package x7;

import java.util.Arrays;
public final class r0 {
    public final n7 f45952a;
    public final Boolean f45953b;
    public final h8 f45954c;

    public r0(v7.l lVar) {
        this.f45952a = (n7) lVar.f44421b;
        this.f45953b = (Boolean) lVar.f44422c;
        this.f45954c = (h8) lVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n6.l.l(this.f45952a, r0Var.f45952a) && n6.l.l(this.f45953b, r0Var.f45953b) && n6.l.l(null, null) && n6.l.l(this.f45954c, r0Var.f45954c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45952a, this.f45953b, null, this.f45954c});
    }
}
