package zb;

import java.util.Arrays;
import o6.l;
public abstract class c {
    public final float f52848a;

    public c(ac.a aVar) {
        this.f52848a = aVar.f1236a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f52848a, cVar.f52848a) == 0 && l.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f52848a), null});
    }
}
