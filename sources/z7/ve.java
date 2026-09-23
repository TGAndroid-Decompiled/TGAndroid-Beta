package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48597a;
    public final Boolean f48598b;
    public final Boolean f48599c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48597a = (Boolean) cVar.f4252a;
        this.f48598b = (Boolean) cVar.f4253b;
        this.f48599c = (Boolean) cVar.f4254c;
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
        if (n6.l.l(this.f48597a, veVar.f48597a) && n6.l.l(this.f48598b, veVar.f48598b) && n6.l.l(this.f48599c, veVar.f48599c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48597a, this.f48598b, this.f48599c, this.d, this.e});
    }
}
