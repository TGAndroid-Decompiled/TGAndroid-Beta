package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48927a;
    public final Boolean f48928b;
    public final Boolean f48929c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48927a = (Boolean) cVar.f4252a;
        this.f48928b = (Boolean) cVar.f4253b;
        this.f48929c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48927a, veVar.f48927a) && n6.l.l(this.f48928b, veVar.f48928b) && n6.l.l(this.f48929c, veVar.f48929c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48927a, this.f48928b, this.f48929c, this.d, this.e});
    }
}
