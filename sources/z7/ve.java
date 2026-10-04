package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f52956a;
    public final Boolean f52957b;
    public final Boolean f52958c;
    public final Boolean d;
    public final Boolean f52959e;

    public ve(cf.c cVar) {
        this.f52956a = (Boolean) cVar.f4602a;
        this.f52957b = (Boolean) cVar.f4603b;
        this.f52958c = (Boolean) cVar.f4604c;
        this.d = (Boolean) cVar.d;
        this.f52959e = (Boolean) cVar.f4605e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f52956a, veVar.f52956a) && n6.l.l(this.f52957b, veVar.f52957b) && n6.l.l(this.f52958c, veVar.f52958c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f52959e, veVar.f52959e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52956a, this.f52957b, this.f52958c, this.d, this.f52959e});
    }
}
