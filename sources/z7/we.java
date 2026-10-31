package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f55138a;
    public final Boolean f55139b;
    public final Boolean f55140c;
    public final Boolean d;
    public final Boolean e;

    public we(bh.d dVar) {
        this.f55138a = (Boolean) dVar.f2777a;
        this.f55139b = (Boolean) dVar.f2778b;
        this.f55140c = (Boolean) dVar.f2779c;
        this.d = (Boolean) dVar.d;
        this.e = (Boolean) dVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof we)) {
            return false;
        }
        we weVar = (we) obj;
        if (n6.l.k(this.f55138a, weVar.f55138a) && n6.l.k(this.f55139b, weVar.f55139b) && n6.l.k(this.f55140c, weVar.f55140c) && n6.l.k(this.d, weVar.d) && n6.l.k(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55138a, this.f55139b, this.f55140c, this.d, this.e});
    }
}
