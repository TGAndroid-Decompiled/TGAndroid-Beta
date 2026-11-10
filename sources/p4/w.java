package p4;

import java.util.List;
public final class w {
    public final h9.i0 f53469a;
    public final int f53470b;
    public final long f53471c;

    public w(List list, int i7, long j3) {
        this.f53469a = h9.i0.q(list);
        this.f53470b = i7;
        this.f53471c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f53469a.equals(wVar.f53469a) && this.f53470b == wVar.f53470b && this.f53471c == wVar.f53471c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.f1.b(this.f53471c) + (((this.f53469a.hashCode() * 31) + this.f53470b) * 31);
    }
}
