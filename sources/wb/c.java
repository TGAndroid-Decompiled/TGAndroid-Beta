package wb;

import java.util.Arrays;
import q6.m;
import r1.f;
public abstract class c {
    public final float f59659a;

    public c(f fVar) {
        this.f59659a = fVar.f56305a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f59659a, cVar.f59659a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f59659a), null});
    }
}
