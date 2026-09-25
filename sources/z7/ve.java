package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48926a;
    public final Boolean f48927b;
    public final Boolean f48928c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48926a = (Boolean) cVar.f4252a;
        this.f48927b = (Boolean) cVar.f4253b;
        this.f48928c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48926a, veVar.f48926a) && n6.l.l(this.f48927b, veVar.f48927b) && n6.l.l(this.f48928c, veVar.f48928c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48926a, this.f48927b, this.f48928c, this.d, this.e});
    }
}
