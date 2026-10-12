package z7;

import java.util.Arrays;
public final class i1 {
    public final gb f49655a;
    public final Boolean f49656b;
    public final ve f49657c;

    public i1(u2.c cVar) {
        this.f49655a = (gb) cVar.f45875b;
        this.f49656b = (Boolean) cVar.f45876c;
        this.f49657c = (ve) cVar.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        if (n6.l.l(this.f49655a, i1Var.f49655a) && n6.l.l(this.f49656b, i1Var.f49656b) && n6.l.l(null, null) && n6.l.l(this.f49657c, i1Var.f49657c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49655a, this.f49656b, null, this.f49657c});
    }
}
