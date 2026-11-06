package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53340a;
    public final int f53341b;
    public final long f53342c;

    public w(List list, int i7, long j3) {
        this.f53340a = h9.i0.q(list);
        this.f53341b = i7;
        this.f53342c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53340a.equals(wVar.f53340a) && this.f53341b == wVar.f53341b && this.f53342c == wVar.f53342c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53342c) + (((this.f53340a.hashCode() * 31) + this.f53341b) * 31);
    }
}
