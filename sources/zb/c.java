package zb;

import java.util.Arrays;
import o6.l;
public abstract class c {
    public final float f52845a;

    public c(ac.a aVar) {
        this.f52845a = aVar.f1236a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f52845a, cVar.f52845a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f52845a), null});
    }
}
