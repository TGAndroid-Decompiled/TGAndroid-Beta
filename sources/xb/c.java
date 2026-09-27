package xb;

import java.util.Arrays;
import n6.l;
import o1.j;
public abstract class c {
    public final float f46065a;

    public c(j jVar) {
        this.f46065a = jVar.f15571a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f46065a, cVar.f46065a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f46065a), null});
    }
}
