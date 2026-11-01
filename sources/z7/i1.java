package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f54975a;
    public final Boolean f54976b;
    public final we f54977c;

    public i1(q5.d dVar) {
        this.f54975a = (gb) dVar.f45498b;
        this.f54976b = (Boolean) dVar.f45499c;
        this.f54977c = (we) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.k(this.f54975a, i1Var.f54975a) && n6.l.k(this.f54976b, i1Var.f54976b) && n6.l.k(null, null) && n6.l.k(this.f54977c, i1Var.f54977c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54975a, this.f54976b, null, this.f54977c});
    }
}
