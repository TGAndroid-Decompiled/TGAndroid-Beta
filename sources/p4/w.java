package p4;

import java.util.List;
public final class w {
    public final h9.i0 f55448a;
    public final int f55449b;
    public final long f55450c;

    public w(List list, int i7, long j3) {
        this.f55448a = h9.i0.q(list);
        this.f55449b = i7;
        this.f55450c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f55448a.equals(wVar.f55448a) && this.f55449b == wVar.f55449b && this.f55450c == wVar.f55450c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.l1.b(this.f55450c) + (((this.f55448a.hashCode() * 31) + this.f55449b) * 31);
    }
}
