package wb;

import java.util.Arrays;
import q6.m;
import r1.f;
public abstract class c {
    public final float f57641a;

    public c(f fVar) {
        this.f57641a = fVar.f54250a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f57641a, cVar.f57641a) == 0 && m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f57641a), null});
    }
}
