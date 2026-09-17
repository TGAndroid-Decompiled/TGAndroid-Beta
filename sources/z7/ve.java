package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51315a;
    public final Boolean f51316b;
    public final Boolean f51317c;
    public final Boolean d;
    public final Boolean f51318e;

    public ve(cf.c cVar) {
        this.f51315a = (Boolean) cVar.f4823a;
        this.f51316b = (Boolean) cVar.f4824b;
        this.f51317c = (Boolean) cVar.f4825c;
        this.d = (Boolean) cVar.d;
        this.f51318e = (Boolean) cVar.f4826e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f51315a, veVar.f51315a) && n6.l.l(this.f51316b, veVar.f51316b) && n6.l.l(this.f51317c, veVar.f51317c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f51318e, veVar.f51318e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51315a, this.f51316b, this.f51317c, this.d, this.f51318e});
    }
}
