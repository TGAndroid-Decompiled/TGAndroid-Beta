package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48974a;
    public final Boolean f48975b;
    public final Boolean f48976c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48974a = (Boolean) cVar.f4259a;
        this.f48975b = (Boolean) cVar.f4260b;
        this.f48976c = (Boolean) cVar.f4261c;
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
        if (n6.l.l(this.f48974a, veVar.f48974a) && n6.l.l(this.f48975b, veVar.f48975b) && n6.l.l(this.f48976c, veVar.f48976c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48974a, this.f48975b, this.f48976c, this.d, this.e});
    }
}
