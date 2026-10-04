package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f52955a;
    public final Boolean f52956b;
    public final Boolean f52957c;
    public final Boolean d;
    public final Boolean f52958e;

    public ve(cf.c cVar) {
        this.f52955a = (Boolean) cVar.f4602a;
        this.f52956b = (Boolean) cVar.f4603b;
        this.f52957c = (Boolean) cVar.f4604c;
        this.d = (Boolean) cVar.d;
        this.f52958e = (Boolean) cVar.f4605e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f52955a, veVar.f52955a) && n6.l.l(this.f52956b, veVar.f52956b) && n6.l.l(this.f52957c, veVar.f52957c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f52958e, veVar.f52958e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52955a, this.f52956b, this.f52957c, this.d, this.f52958e});
    }
}
