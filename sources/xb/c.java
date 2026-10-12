package xb;

import java.util.Arrays;
import n6.m;
import o1.j;
public abstract class c {
    public final float f51347a;

    public c(j jVar) {
        this.f51347a = jVar.f16690a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f51347a, cVar.f51347a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f51347a), null});
    }
}
