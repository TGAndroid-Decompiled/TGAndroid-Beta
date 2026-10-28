package y7;

import java.util.Arrays;
public final class c7 {
    public final b7 f52154a;
    public final Integer f52155b;

    public c7(m4.c cVar) {
        this.f52154a = (b7) cVar.f18008b;
        this.f52155b = (Integer) cVar.f18009c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        if (o6.l.l(this.f52154a, c7Var.f52154a) && o6.l.l(this.f52155b, c7Var.f52155b) && o6.l.l(null, null) && o6.l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f52154a, this.f52155b, null, null});
    }
}
