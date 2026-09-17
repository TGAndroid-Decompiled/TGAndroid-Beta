package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51284a;
    public final Boolean f51285b;
    public final Boolean f51286c;
    public final Boolean d;
    public final Boolean f51287e;

    public ve(cf.c cVar) {
        this.f51284a = (Boolean) cVar.f4796a;
        this.f51285b = (Boolean) cVar.f4797b;
        this.f51286c = (Boolean) cVar.f4798c;
        this.d = (Boolean) cVar.d;
        this.f51287e = (Boolean) cVar.f4799e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f51284a, veVar.f51284a) && n6.l.l(this.f51285b, veVar.f51285b) && n6.l.l(this.f51286c, veVar.f51286c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f51287e, veVar.f51287e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51284a, this.f51285b, this.f51286c, this.d, this.f51287e});
    }
}
