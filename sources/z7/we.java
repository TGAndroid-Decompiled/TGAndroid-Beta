package z7;

import java.util.Arrays;
public final class we {
    public final Boolean f55156a;
    public final Boolean f55157b;
    public final Boolean f55158c;
    public final Boolean d;
    public final Boolean e;

    public we(bh.d dVar) {
        this.f55156a = (Boolean) dVar.f2777a;
        this.f55157b = (Boolean) dVar.f2778b;
        this.f55158c = (Boolean) dVar.f2779c;
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
        if (n6.l.k(this.f55156a, weVar.f55156a) && n6.l.k(this.f55157b, weVar.f55157b) && n6.l.k(this.f55158c, weVar.f55158c) && n6.l.k(this.d, weVar.d) && n6.l.k(this.e, weVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55156a, this.f55157b, this.f55158c, this.d, this.e});
    }
}
