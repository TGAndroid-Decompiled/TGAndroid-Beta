package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f52961a;
    public final Boolean f52962b;
    public final Boolean f52963c;
    public final Boolean d;
    public final Boolean f52964e;

    public ve(cf.c cVar) {
        this.f52961a = (Boolean) cVar.f4603a;
        this.f52962b = (Boolean) cVar.f4604b;
        this.f52963c = (Boolean) cVar.f4605c;
        this.d = (Boolean) cVar.d;
        this.f52964e = (Boolean) cVar.f4606e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f52961a, veVar.f52961a) && n6.l.l(this.f52962b, veVar.f52962b) && n6.l.l(this.f52963c, veVar.f52963c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f52964e, veVar.f52964e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52961a, this.f52962b, this.f52963c, this.d, this.f52964e});
    }
}
