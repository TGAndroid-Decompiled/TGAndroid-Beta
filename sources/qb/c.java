package qb;

import java.util.Arrays;
import n6.l;
import o1.i;
public abstract class c {
    public final float f45509a;

    public c(i iVar) {
        this.f45509a = iVar.f13940a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f45509a, cVar.f45509a) == 0 && l.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f45509a), null});
    }
}
