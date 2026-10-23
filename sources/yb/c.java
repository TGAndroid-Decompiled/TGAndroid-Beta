package yb;

import java.util.Arrays;
import n6.l;
import o1.j;
public abstract class c {
    public final float f50129a;

    public c(j jVar) {
        this.f50129a = jVar.f17558a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f50129a, cVar.f50129a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f50129a), null});
    }
}
