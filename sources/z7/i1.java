package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f54957a;
    public final Boolean f54958b;
    public final we f54959c;

    public i1(q5.d dVar) {
        this.f54957a = (gb) dVar.f45487b;
        this.f54958b = (Boolean) dVar.f45488c;
        this.f54959c = (we) dVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.k(this.f54957a, i1Var.f54957a) && n6.l.k(this.f54958b, i1Var.f54958b) && n6.l.k(null, null) && n6.l.k(this.f54959c, i1Var.f54959c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f54957a, this.f54958b, null, this.f54959c});
    }
}
