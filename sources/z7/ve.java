package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f52982a;
    public final Boolean f52983b;
    public final Boolean f52984c;
    public final Boolean d;
    public final Boolean f52985e;

    public ve(cf.c cVar) {
        this.f52982a = (Boolean) cVar.f4603a;
        this.f52983b = (Boolean) cVar.f4604b;
        this.f52984c = (Boolean) cVar.f4605c;
        this.d = (Boolean) cVar.d;
        this.f52985e = (Boolean) cVar.f4606e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f52982a, veVar.f52982a) && n6.l.l(this.f52983b, veVar.f52983b) && n6.l.l(this.f52984c, veVar.f52984c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f52985e, veVar.f52985e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52982a, this.f52983b, this.f52984c, this.d, this.f52985e});
    }
}
