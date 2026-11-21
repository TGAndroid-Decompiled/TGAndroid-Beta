package p4;

import java.util.List;
public final class w {
    public final h9.i0 f55489a;
    public final int f55490b;
    public final long f55491c;

    public w(List list, int i7, long j3) {
        this.f55489a = h9.i0.q(list);
        this.f55490b = i7;
        this.f55491c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.f55489a.equals(wVar.f55489a) && this.f55490b == wVar.f55490b && this.f55491c == wVar.f55491c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return c8.l1.b(this.f55491c) + (((this.f55489a.hashCode() * 31) + this.f55490b) * 31);
    }
}
