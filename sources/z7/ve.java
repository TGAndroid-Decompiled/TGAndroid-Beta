package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51314a;
    public final Boolean f51315b;
    public final Boolean f51316c;
    public final Boolean d;
    public final Boolean f51317e;

    public ve(cf.c cVar) {
        this.f51314a = (Boolean) cVar.f4823a;
        this.f51315b = (Boolean) cVar.f4824b;
        this.f51316c = (Boolean) cVar.f4825c;
        this.d = (Boolean) cVar.d;
        this.f51317e = (Boolean) cVar.f4826e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f51314a, veVar.f51314a) && n6.l.l(this.f51315b, veVar.f51315b) && n6.l.l(this.f51316c, veVar.f51316c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f51317e, veVar.f51317e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51314a, this.f51315b, this.f51316c, this.d, this.f51317e});
    }
}
