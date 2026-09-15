package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48654a;
    public final Boolean f48655b;
    public final Boolean f48656c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48654a = (Boolean) cVar.f4255a;
        this.f48655b = (Boolean) cVar.f4256b;
        this.f48656c = (Boolean) cVar.f4257c;
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
        if (n6.l.l(this.f48654a, veVar.f48654a) && n6.l.l(this.f48655b, veVar.f48655b) && n6.l.l(this.f48656c, veVar.f48656c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48654a, this.f48655b, this.f48656c, this.d, this.e});
    }
}
