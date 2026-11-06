package r2;

import java.util.List;
public final class f extends y2.b {
    public final List d;
    public final long f54200e;

    public f(long j3, List list) {
        super(0L, list.size() - 1);
        this.f54200e = j3;
        this.d = list;
    }

    @Override
    public final long E() {
        a();
        s2.k kVar = (s2.k) this.d.get((int) this.f58783c);
        return this.f54200e + kVar.f54586e + kVar.f54585c;
    }

    @Override
    public final long w() {
        a();
        return this.f54200e + ((s2.k) this.d.get((int) this.f58783c)).f54586e;
    }
}
