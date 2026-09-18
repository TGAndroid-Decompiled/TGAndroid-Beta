package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f48682a;
    public final Boolean f48683b;
    public final Boolean f48684c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f48682a = (Boolean) cVar.f4260a;
        this.f48683b = (Boolean) cVar.f4261b;
        this.f48684c = (Boolean) cVar.f4262c;
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
        if (n6.l.l(this.f48682a, veVar.f48682a) && n6.l.l(this.f48683b, veVar.f48683b) && n6.l.l(this.f48684c, veVar.f48684c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48682a, this.f48683b, this.f48684c, this.d, this.e});
    }
}
