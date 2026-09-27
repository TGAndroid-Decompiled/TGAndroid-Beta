package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48969a;
    public final Boolean f48970b;
    public final Boolean f48971c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48969a = (Boolean) cVar.f4254a;
        this.f48970b = (Boolean) cVar.f4255b;
        this.f48971c = (Boolean) cVar.f4256c;
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
        if (n6.l.l(this.f48969a, veVar.f48969a) && n6.l.l(this.f48970b, veVar.f48970b) && n6.l.l(this.f48971c, veVar.f48971c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48969a, this.f48970b, this.f48971c, this.d, this.e});
    }
}
