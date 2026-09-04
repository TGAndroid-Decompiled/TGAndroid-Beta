package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f51283a;
    public final Boolean f51284b;
    public final Boolean f51285c;
    public final Boolean d;
    public final Boolean f51286e;

    public ve(cf.c cVar) {
        this.f51283a = (Boolean) cVar.f4796a;
        this.f51284b = (Boolean) cVar.f4797b;
        this.f51285c = (Boolean) cVar.f4798c;
        this.d = (Boolean) cVar.d;
        this.f51286e = (Boolean) cVar.f4799e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f51283a, veVar.f51283a) && n6.l.l(this.f51284b, veVar.f51284b) && n6.l.l(this.f51285c, veVar.f51285c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.f51286e, veVar.f51286e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51283a, this.f51284b, this.f51285c, this.d, this.f51286e});
    }
}
