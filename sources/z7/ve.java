package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48954a;
    public final Boolean f48955b;
    public final Boolean f48956c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48954a = (Boolean) cVar.f4261a;
        this.f48955b = (Boolean) cVar.f4262b;
        this.f48956c = (Boolean) cVar.f4263c;
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
        if (n6.l.l(this.f48954a, veVar.f48954a) && n6.l.l(this.f48955b, veVar.f48955b) && n6.l.l(this.f48956c, veVar.f48956c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48954a, this.f48955b, this.f48956c, this.d, this.e});
    }
}
