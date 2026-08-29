package qc;

import java.io.Serializable;
import kotlin.jvm.internal.j;
public final class d implements Serializable {
    public final Object f46595a;
    public final Object f46596b;

    public d(Object obj, Object obj2) {
        this.f46595a = obj;
        this.f46596b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (j.a(this.f46595a, dVar.f46595a) && j.a(this.f46596b, dVar.f46596b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f46595a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f46596b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f46595a + ", " + this.f46596b + ')';
    }
}
