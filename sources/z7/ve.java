package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48647a;
    public final Boolean f48648b;
    public final Boolean f48649c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48647a = (Boolean) cVar.f4257a;
        this.f48648b = (Boolean) cVar.f4258b;
        this.f48649c = (Boolean) cVar.f4259c;
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
        if (n6.l.l(this.f48647a, veVar.f48647a) && n6.l.l(this.f48648b, veVar.f48648b) && n6.l.l(this.f48649c, veVar.f48649c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48647a, this.f48648b, this.f48649c, this.d, this.e});
    }
}
