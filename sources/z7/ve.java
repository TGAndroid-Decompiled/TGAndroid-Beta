package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48908a;
    public final Boolean f48909b;
    public final Boolean f48910c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48908a = (Boolean) cVar.f4260a;
        this.f48909b = (Boolean) cVar.f4261b;
        this.f48910c = (Boolean) cVar.f4262c;
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
        if (n6.l.l(this.f48908a, veVar.f48908a) && n6.l.l(this.f48909b, veVar.f48909b) && n6.l.l(this.f48910c, veVar.f48910c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48908a, this.f48909b, this.f48910c, this.d, this.e});
    }
}
