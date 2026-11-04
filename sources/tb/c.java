package tb;

import java.util.Arrays;
import p6.m;
import q1.f;
public abstract class c {
    public final float f55080a;

    public c(f fVar) {
        this.f55080a = fVar.f53635a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (getClass().equals(cVar.getClass()) && Float.compare(this.f55080a, cVar.f55080a) == 0 && m.k(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{getClass(), Float.valueOf(this.f55080a), null});
    }
}
