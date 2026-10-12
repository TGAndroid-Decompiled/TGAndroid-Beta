package xb;

import java.util.Arrays;
import n6.m;
import o1.j;
public abstract class c {
    public final float f51339a;

    public c(j jVar) {
        this.f51339a = jVar.f16689a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f51339a, cVar.f51339a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f51339a), null});
    }
}
