package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48914a;
    public final Boolean f48915b;
    public final Boolean f48916c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48914a = (Boolean) cVar.f4252a;
        this.f48915b = (Boolean) cVar.f4253b;
        this.f48916c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48914a, veVar.f48914a) && n6.l.l(this.f48915b, veVar.f48915b) && n6.l.l(this.f48916c, veVar.f48916c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48914a, this.f48915b, this.f48916c, this.d, this.e});
    }
}
