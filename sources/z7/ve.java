package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48924a;
    public final Boolean f48925b;
    public final Boolean f48926c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48924a = (Boolean) cVar.f4252a;
        this.f48925b = (Boolean) cVar.f4253b;
        this.f48926c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48924a, veVar.f48924a) && n6.l.l(this.f48925b, veVar.f48925b) && n6.l.l(this.f48926c, veVar.f48926c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48924a, this.f48925b, this.f48926c, this.d, this.e});
    }
}
