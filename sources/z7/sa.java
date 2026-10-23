package z7;

import java.util.Arrays;
public final class sa {
    public final ra f51177a;
    public final Integer f51178b;

    public sa(qa qaVar) {
        this.f51177a = (ra) qaVar.f51151a;
        this.f51178b = (Integer) qaVar.f51152b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (n6.l.l(this.f51177a, saVar.f51177a) && n6.l.l(this.f51178b, saVar.f51178b) && n6.l.l(null, null) && n6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f51177a, this.f51178b, null, null});
    }
}
