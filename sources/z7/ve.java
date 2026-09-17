package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48677a;
    public final Boolean f48678b;
    public final Boolean f48679c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48677a = (Boolean) cVar.f4260a;
        this.f48678b = (Boolean) cVar.f4261b;
        this.f48679c = (Boolean) cVar.f4262c;
        this.d = (Boolean) cVar.d;
        this.e = (Boolean) cVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f48677a, veVar.f48677a) && n6.l.l(this.f48678b, veVar.f48678b) && n6.l.l(this.f48679c, veVar.f48679c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48677a, this.f48678b, this.f48679c, this.d, this.e});
    }
}
