package xb;

import java.util.Arrays;
import n6.m;
import o1.j;
public abstract class c {
    public final float f51198a;

    public c(j jVar) {
        this.f51198a = jVar.f16987a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f51198a, cVar.f51198a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f51198a), null});
    }
}
