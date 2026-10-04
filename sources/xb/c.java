package xb;

import java.util.Arrays;
import n6.l;
import o1.j;
public abstract class c {
    public final float f49817a;

    public c(j jVar) {
        this.f49817a = jVar.f16983a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f49817a, cVar.f49817a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f49817a), null});
    }
}
