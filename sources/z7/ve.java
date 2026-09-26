package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48925a;
    public final Boolean f48926b;
    public final Boolean f48927c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48925a = (Boolean) cVar.f4252a;
        this.f48926b = (Boolean) cVar.f4253b;
        this.f48927c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48925a, veVar.f48925a) && n6.l.l(this.f48926b, veVar.f48926b) && n6.l.l(this.f48927c, veVar.f48927c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48925a, this.f48926b, this.f48927c, this.d, this.e});
    }
}
