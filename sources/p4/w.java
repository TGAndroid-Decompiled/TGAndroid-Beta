package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53364a;
    public final int f53365b;
    public final long f53366c;

    public w(List list, int i7, long j3) {
        this.f53364a = h9.i0.q(list);
        this.f53365b = i7;
        this.f53366c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53364a.equals(wVar.f53364a) && this.f53365b == wVar.f53365b && this.f53366c == wVar.f53366c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53366c) + (((this.f53364a.hashCode() * 31) + this.f53365b) * 31);
    }
}
