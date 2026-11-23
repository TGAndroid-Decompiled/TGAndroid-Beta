package wb;

import java.util.Arrays;
import q6.m;
import r1.f;
public abstract class c {
    public final float f59666a;

    public c(f fVar) {
        this.f59666a = fVar.f56315a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f59666a, cVar.f59666a) == 0 && m.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f59666a), null});
    }
}
